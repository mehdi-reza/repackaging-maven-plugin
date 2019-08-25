package org.palestyn.maven.plugin;

import java.io.File;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.StreamSupport;

import org.apache.maven.artifact.Artifact;
import org.apache.maven.model.Dependency;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;
import org.apache.maven.shared.artifact.ArtifactCoordinate;
import org.apache.maven.shared.artifact.DefaultArtifactCoordinate;
import org.apache.maven.shared.artifact.filter.collection.ArtifactsFilter;
import org.apache.maven.shared.artifact.filter.collection.ScopeFilter;
import org.apache.maven.shared.artifact.resolve.ArtifactResolverException;
import org.apache.maven.shared.artifact.resolve.ArtifactResult;
import org.apache.maven.shared.dependencies.resolve.DependencyResolverException;
import org.apache.maven.plugins.annotations.ResolutionScope;
import org.apache.maven.plugins.dependency.fromDependencies.AbstractDependencyFilterMojo;
import org.apache.maven.plugins.dependency.utils.DependencyStatusSets;

@Mojo(name = "repackage", defaultPhase = LifecyclePhase.PACKAGE, 
	requiresProject = true, 
	threadSafe = true, 
	requiresDependencyResolution = ResolutionScope.COMPILE_PLUS_RUNTIME, 
	requiresDependencyCollection = ResolutionScope.COMPILE_PLUS_RUNTIME)
public class PalestynRepackager extends AbstractDependencyFilterMojo {

	@Override
	protected ArtifactsFilter getMarkedArtifactFilter() {
		return new ScopeFilter(Artifact.SCOPE_COMPILE, Artifact.SCOPE_TEST);
	}

	@Override
	protected void doExecute() throws MojoExecutionException, MojoFailureException {
		DependencyStatusSets statusSets = getDependencySets(true);			
		statusSets.getResolvedDependencies().forEach(a -> {
			getLog().info(a.getGroupId()+":"+a.getArtifactId());
		});			
	}
}

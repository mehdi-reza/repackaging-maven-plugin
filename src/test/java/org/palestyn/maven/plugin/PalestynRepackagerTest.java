package org.palestyn.maven.plugin;

import org.apache.maven.plugin.testing.MojoRule;
import org.apache.maven.plugin.testing.WithoutMojo;

import org.junit.Rule;
import static org.junit.Assert.*;
import org.junit.Test;
import java.io.File;

public class PalestynRepackagerTest {
	@Rule
	public MojoRule rule = new MojoRule() {
		@Override
		protected void before() throws Throwable {
		}

		@Override
		protected void after() {
		}
	};

	/**
	 * @throws Exception if any
	 */
	@Test
	public void testRepackaging() throws Exception {

	}

	/** Do not need the MojoRule. */
	@WithoutMojo
	@Test
	public void testSomethingWhichDoesNotNeedTheMojoAndProbablyShouldBeExtractedIntoANewClassOfItsOwn() {
		assertTrue(true);
	}

}

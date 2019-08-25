package org.palestyn.maven.plugin;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PalestynRepackagerTest {
	/*
	 * @Rule public MojoRule rule = new MojoRule() {
	 * 
	 * @Override protected void before() throws Throwable { }
	 * 
	 * @Override protected void after() { } };
	 */
	/**
	 * @throws Exception if any
	 */
	@Test
	public void testRepackaging() throws Exception {

	}

	/** Do not need the MojoRule. */
	//@WithoutMojo
	@Test
	public void testSomethingWhichDoesNotNeedTheMojoAndProbablyShouldBeExtractedIntoANewClassOfItsOwn() {
		assertTrue(true);
	}

}

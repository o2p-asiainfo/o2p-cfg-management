package com.asiainfo.integration.o2p.cfg.util;

import java.util.LinkedList;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ListUtilTest</code> contains tests for the class <code>{@link ListUtil}</code>.
 *
 * @generatedBy CodePro at 15-11-26 上午11:11
 * @author windy
 * @version $Revision: 1.0 $
 */
public class ListUtilTest {
	/**
	 * Run the String getString(List<?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:11
	 */
	@Test
	public void testGetString_1()
		throws Exception {
		List<Object> list = null;

		String result = ListUtil.getString(list);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getString(List<?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:11
	 */
	@Test
	public void testGetString_2()
		throws Exception {
		List<Object> list = new LinkedList();

		String result = ListUtil.getString(list);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getString(List<?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:11
	 */
	@Test
	public void testGetString_3()
		throws Exception {
		List<Object> list = new LinkedList();

		String result = ListUtil.getString(list);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:11
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:11
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:11
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ListUtilTest.class);
	}
}
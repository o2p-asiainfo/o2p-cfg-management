package com.asiainfo.integration.o2p.cfg.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>CommonUtilTest</code> contains tests for the class <code>{@link CommonUtil}</code>.
 *
 * @generatedBy CodePro at 15-11-26 上午11:11
 * @author windy
 * @version $Revision: 1.0 $
 */
public class CommonUtilTest {
	/**
	 * Run the ByteArrayOutputStream getCopyOutputStream(InputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:11
	 */
	@Test(expected = java.io.IOException.class)
	public void testGetCopyOutputStream_1()
		throws Exception {
		InputStream is = new PipedInputStream();

		ByteArrayOutputStream result = CommonUtil.getCopyOutputStream(is);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ByteArrayOutputStream getCopyOutputStream(InputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:11
	 */
	@Test(expected = java.io.IOException.class)
	public void testGetCopyOutputStream_2()
		throws Exception {
		InputStream is = new PipedInputStream();

		ByteArrayOutputStream result = CommonUtil.getCopyOutputStream(is);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ByteArrayOutputStream getCopyOutputStream(InputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:11
	 */
	@Test(expected = java.io.IOException.class)
	public void testGetCopyOutputStream_3()
		throws Exception {
		InputStream is = new PipedInputStream();

		ByteArrayOutputStream result = CommonUtil.getCopyOutputStream(is);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ByteArrayOutputStream getCopyOutputStream(InputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:11
	 */
	@Test(expected = java.io.IOException.class)
	public void testGetCopyOutputStream_4()
		throws Exception {
		InputStream is = new PipedInputStream();

		ByteArrayOutputStream result = CommonUtil.getCopyOutputStream(is);

		// add additional test code here
		assertNotNull(result);
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
		new org.junit.runner.JUnitCore().run(CommonUtilTest.class);
	}
}
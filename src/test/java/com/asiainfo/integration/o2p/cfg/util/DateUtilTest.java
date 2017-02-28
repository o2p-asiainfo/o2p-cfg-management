package com.asiainfo.integration.o2p.cfg.util;

import java.text.DateFormat;
import java.util.Date;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>DateUtilTest</code> contains tests for the class <code>{@link DateUtil}</code>.
 *
 * @generatedBy CodePro at 15-11-26 上午11:11
 * @author windy
 * @version $Revision: 1.0 $
 */
public class DateUtilTest {
	/**
	 * Run the Date addDays(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:11
	 */
	@Test
	public void testAddDays_1()
		throws Exception {
		int addDays = 1;

		Date result = DateUtil.addDays(addDays);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Date addDays(Date,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:11
	 */
	@Test
	public void testAddDays_2()
		throws Exception {
		Date src = new Date();
		int addDays = 1;

		Date result = DateUtil.addDays(src, addDays);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Date addHours(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:11
	 */
	@Test
	public void testAddHours_1()
		throws Exception {
		int addHours = 0;

		Date result = DateUtil.addHours(addHours);

		// add additional test code here
		assertNotNull(result);
		Date date = new Date();
		assertEquals(DateFormat.getInstance().format(date), DateFormat.getInstance().format(result));
	}

	/**
	 * Run the Date addHours(Date,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:11
	 */
	@Test
	public void testAddHours_2()
		throws Exception {
		Date src = new Date();
		int addHours = 0;

		Date result = DateUtil.addHours(src, addHours);

		// add additional test code here
		assertNotNull(result);
		assertEquals(DateFormat.getInstance().format(new Date()), DateFormat.getInstance().format(result));
	}

	/**
	 * Run the String formatDate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:11
	 */
	@Test
	public void testFormatDate_1()
		throws Exception {

		String result = DateUtil.formatDate();

	}

	/**
	 * Run the String formatDate(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:11
	 */
	@Test
	public void testFormatDate_2()
		throws Exception {
		String formatPattern = "";

		String result = DateUtil.formatDate(formatPattern);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String formatDate(Date) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:11
	 */
	@Test
	public void testFormatDate_3()
		throws Exception {
		Date src = new Date();

		String result = DateUtil.formatDate(src);

		// add additional test code here
	}

	/**
	 * Run the String formatDate(Date,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:11
	 */
	@Test
	public void testFormatDate_4()
		throws Exception {
		Date src = null;
		String formatPattern = "";

		String result = DateUtil.formatDate(src, formatPattern);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String formatDate(Date,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:11
	 */
	@Test
	public void testFormatDate_5()
		throws Exception {
		Date src = new Date();
		String formatPattern = "";

		String result = DateUtil.formatDate(src, formatPattern);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the Date getDate(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:11
	 */
	@Test
	public void testGetDate_1()
		throws Exception {
		int year = 1;
		int month = 1;
		int day = 1;

		Date result = DateUtil.getDate(year, month, day);

		// add additional test code here
		assertNotNull(result);
		assertEquals(DateFormat.getInstance().format(new Date(-62135798400000L)), DateFormat.getInstance().format(result));
		assertEquals(-62135798400000L, result.getTime());
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
		new org.junit.runner.JUnitCore().run(DateUtilTest.class);
	}
}
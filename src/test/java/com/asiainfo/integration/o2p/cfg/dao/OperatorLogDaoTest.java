package com.asiainfo.integration.o2p.cfg.dao;

import org.junit.*;
import static org.junit.Assert.*;
import com.ailk.eaap.o2p.sqllog.model.OperateLog;
import com.ailk.eaap.o2p.sqllog.model.OperateLogData;

/**
 * The class <code>OperatorLogDaoTest</code> contains tests for the class <code>{@link OperatorLogDao}</code>.
 *
 * @generatedBy CodePro at 15-11-26 上午11:11
 * @author windy
 * @version $Revision: 1.0 $
 */
public class OperatorLogDaoTest {
	/**
	 * Run the OperatorLogDao() constructor test.
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:11
	 */
	@Test
	public void testOperatorLogDao_1()
		throws Exception {
		OperatorLogDao result = new OperatorLogDao();
		assertNotNull(result);
		// add additional test code here
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
		new org.junit.runner.JUnitCore().run(OperatorLogDaoTest.class);
	}
}
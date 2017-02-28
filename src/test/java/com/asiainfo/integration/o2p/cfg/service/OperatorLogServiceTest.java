package com.asiainfo.integration.o2p.cfg.service;

import org.easymock.EasyMock;
import org.junit.*;

import static org.junit.Assert.*;

import com.ailk.eaap.o2p.sqllog.model.OperateLog;
import com.asiainfo.integration.o2p.cfg.dao.OperatorLogDao;

/**
 * The class <code>OperatorLogServiceTest</code> contains tests for the class <code>{@link OperatorLogService}</code>.
 *
 * @generatedBy CodePro at 15-11-26 上午11:12
 * @author windy
 * @version $Revision: 1.0 $
 */
public class OperatorLogServiceTest {
	/**
	 * Run the void recordOperateLog(OperateLog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testRecordOperateLog_1()
		throws Exception {
		OperatorLogService fixture = new OperatorLogService();
		OperateLog log = new OperateLog();
		OperatorLogDao dao = EasyMock.createMock(OperatorLogDao.class);
		fixture.setOperatorLogDao(dao);
		dao.insertOperateLog(log);
		EasyMock.expectLastCall();
		dao.insertOperateLogData(null);
		EasyMock.expectLastCall();
		EasyMock.replay(dao);
		fixture.recordOperateLog(log);
	}

	/**
	 * Run the void recordOperateLog(OperateLog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testRecordOperateLog_2()
		throws Exception {
		OperatorLogService fixture = new OperatorLogService();
		OperateLog log = new OperateLog();
		OperatorLogDao dao = EasyMock.createMock(OperatorLogDao.class);
		fixture.setOperatorLogDao(dao);
		dao.insertOperateLog(log);
		EasyMock.expectLastCall();
		dao.insertOperateLogData(null);
		EasyMock.expectLastCall();
		EasyMock.replay(dao);
		fixture.recordOperateLog(log);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.asiainfo.integration.o2p.cfg.service.OperatorLogService.recordOperateLog(OperatorLogService.java:21)
	}

	/**
	 * Run the void recordOperateLog(OperateLog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testRecordOperateLog_3()
		throws Exception {
		OperatorLogService fixture = new OperatorLogService();
		OperateLog log = new OperateLog();
		OperatorLogDao dao = EasyMock.createMock(OperatorLogDao.class);
		fixture.setOperatorLogDao(dao);
		dao.insertOperateLog(log);
		EasyMock.expectLastCall();
		dao.insertOperateLogData(null);
		EasyMock.expectLastCall();
		EasyMock.replay(dao);
		fixture.recordOperateLog(log);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.asiainfo.integration.o2p.cfg.service.OperatorLogService.recordOperateLog(OperatorLogService.java:21)
	}

	/**
	 * Run the void recordOperateLog(OperateLog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testRecordOperateLog_4()
		throws Exception {
		OperatorLogService fixture = new OperatorLogService();
		OperateLog log = new OperateLog();
		OperatorLogDao dao = EasyMock.createMock(OperatorLogDao.class);
		fixture.setOperatorLogDao(dao);
		dao.insertOperateLog(log);
		EasyMock.expectLastCall();
		dao.insertOperateLogData(null);
		EasyMock.expectLastCall();
		EasyMock.replay(dao);
		fixture.recordOperateLog(log);
		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.asiainfo.integration.o2p.cfg.service.OperatorLogService.recordOperateLog(OperatorLogService.java:21)
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:12
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
	 * @generatedBy CodePro at 15-11-26 上午11:12
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
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(OperatorLogServiceTest.class);
	}
}
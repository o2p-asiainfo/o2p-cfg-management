package com.asiainfo.integration.o2p.cfg.util;

import org.junit.*;
import static org.junit.Assert.*;
import com.asiainfo.foundation.exception.Result;

/**
 * The class <code>CfgExceptionTest</code> contains tests for the class <code>{@link CfgException}</code>.
 *
 * @generatedBy CodePro at 15-11-26 上午11:12
 * @author windy
 * @version $Revision: 1.0 $
 */
public class CfgExceptionTest {
	/**
	 * Run the CfgException(int,String,String[],Throwable) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testCfgException_1()
		throws Exception {
		int code = 9501;
		String key = "o2p.configuration.controller.9501";
		String[] msgArgs = new String[] {};
		Throwable cause = new Throwable();

		CfgException result = new CfgException(code, key, msgArgs, cause);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.springframework.context.NoSuchMessageException: No message found under code '' for locale 'zh_CN'.
		//       at org.springframework.context.support.AbstractMessageSource.getMessage(AbstractMessageSource.java:159)
		//       at com.asiainfo.foundation.util.MessageSourceUtils.getMessage(MessageSourceUtils.java:41)
		//       at com.asiainfo.foundation.exception.BusinessException.getMessage(BusinessException.java:151)
		//       at com.asiainfo.foundation.exception.BusinessException.<init>(BusinessException.java:105)
		//       at com.asiainfo.integration.o2p.cfg.util.CfgException.<init>(CfgException.java:23)
		assertNotNull(result);
	}

	/**
	 * Run the Throwable getCause() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testGetCause_1()
		throws Exception {
		CfgException fixture = new CfgException(9501, "o2p.configuration.controller.9501", new String[] {}, new Throwable());
		

		Throwable result = fixture.getCause();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.springframework.context.NoSuchMessageException: No message found under code '' for locale 'zh_CN'.
		//       at org.springframework.context.support.AbstractMessageSource.getMessage(AbstractMessageSource.java:159)
		//       at com.asiainfo.foundation.util.MessageSourceUtils.getMessage(MessageSourceUtils.java:41)
		//       at com.asiainfo.foundation.exception.BusinessException.getMessage(BusinessException.java:151)
		//       at com.asiainfo.foundation.exception.BusinessException.<init>(BusinessException.java:105)
		//       at com.asiainfo.integration.o2p.cfg.util.CfgException.<init>(CfgException.java:23)
		assertNotNull(result);
	}

	/**
	 * Run the Result getResult() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testGetResult_1()
		throws Exception {
		CfgException fixture = new CfgException(9501, "o2p.configuration.controller.9501", new String[] {}, new Throwable());
		

		Result result = fixture.getResult();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.springframework.context.NoSuchMessageException: No message found under code '' for locale 'zh_CN'.
		//       at org.springframework.context.support.AbstractMessageSource.getMessage(AbstractMessageSource.java:159)
		//       at com.asiainfo.foundation.util.MessageSourceUtils.getMessage(MessageSourceUtils.java:41)
		//       at com.asiainfo.foundation.exception.BusinessException.getMessage(BusinessException.java:151)
		//       at com.asiainfo.foundation.exception.BusinessException.<init>(BusinessException.java:105)
		//       at com.asiainfo.integration.o2p.cfg.util.CfgException.<init>(CfgException.java:23)
		assertNotNull(result);
	}

	/**
	 * Run the void setCause(Throwable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testSetCause_1()
		throws Exception {
		CfgException fixture = new CfgException(9501, "o2p.configuration.controller.9501", new String[] {}, new Throwable());
		
		Throwable cause = new Throwable();

		fixture.setCause(cause);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.springframework.context.NoSuchMessageException: No message found under code '' for locale 'zh_CN'.
		//       at org.springframework.context.support.AbstractMessageSource.getMessage(AbstractMessageSource.java:159)
		//       at com.asiainfo.foundation.util.MessageSourceUtils.getMessage(MessageSourceUtils.java:41)
		//       at com.asiainfo.foundation.exception.BusinessException.getMessage(BusinessException.java:151)
		//       at com.asiainfo.foundation.exception.BusinessException.<init>(BusinessException.java:105)
		//       at com.asiainfo.integration.o2p.cfg.util.CfgException.<init>(CfgException.java:23)
	}

	/**
	 * Run the void setResult(Result) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testSetResult_1()
		throws Exception {
		CfgException fixture = new CfgException(9501, "o2p.configuration.controller.9501", new String[] {}, new Throwable());
		
		Result result = new Result(fixture.getResult());

		fixture.setResult(result);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.springframework.context.NoSuchMessageException: No message found under code '' for locale 'zh_CN'.
		//       at org.springframework.context.support.AbstractMessageSource.getMessage(AbstractMessageSource.java:159)
		//       at com.asiainfo.foundation.util.MessageSourceUtils.getMessage(MessageSourceUtils.java:41)
		//       at com.asiainfo.foundation.exception.BusinessException.getMessage(BusinessException.java:151)
		//       at com.asiainfo.foundation.exception.BusinessException.<init>(BusinessException.java:105)
		//       at com.asiainfo.integration.o2p.cfg.util.CfgException.<init>(CfgException.java:23)
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
		new org.junit.runner.JUnitCore().run(CfgExceptionTest.class);
	}
}
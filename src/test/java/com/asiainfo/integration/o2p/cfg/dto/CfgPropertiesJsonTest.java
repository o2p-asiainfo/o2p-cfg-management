package com.asiainfo.integration.o2p.cfg.dto;

import java.util.HashMap;
import java.util.Map;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>CfgPropertiesJsonTest</code> contains tests for the class <code>{@link CfgPropertiesJson}</code>.
 *
 * @generatedBy CodePro at 15-11-26 上午11:11
 * @author windy
 * @version $Revision: 1.0 $
 */
public class CfgPropertiesJsonTest {
	/**
	 * Run the CfgPropertiesJson(CfgProperties) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:11
	 */
	@Test
	public void testCfgPropertiesJson_1()
		throws Exception {
		CfgProperties cp = new CfgProperties();
		cp.setDescription("");
		cp.setProValueBuffer("");
		cp.setKey("");
		cp.setProType("");
		cp.setProDataType("");
		cp.setValue("");
		cp.setLock(1);
		cp.setProConstraint("");

		CfgPropertiesJson result = new CfgPropertiesJson(cp);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getValue());
		assertEquals("", result.getKey());
		assertEquals(1, result.getLock());
		assertEquals("", result.getDescription());
		assertEquals("", result.getProDataType());
		assertEquals("", result.getProConstraint());
		assertEquals("", result.getProType());
		assertEquals("", result.getProValueBuffer());
	}

	/**
	 * Run the CfgPropertiesJson(Map<String,Object>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:11
	 */
	@Test
	public void testCfgPropertiesJson_2()
		throws Exception {
		Map<String, Object> cp = new HashMap();

		CfgPropertiesJson result = new CfgPropertiesJson(cp);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getValue());
		assertEquals(null, result.getKey());
		assertEquals(null, result.getDescription());
		assertEquals(null, result.getProDataType());
		assertEquals(null, result.getProConstraint());
		assertEquals(null, result.getProType());
		assertEquals(null, result.getProValueBuffer());
	}

	/**
	 * Run the CfgPropertiesJson(Map<String,Object>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:11
	 */
	@Test
	public void testCfgPropertiesJson_3()
		throws Exception {
		Map<String, Object> cp = new HashMap();

		CfgPropertiesJson result = new CfgPropertiesJson(cp);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getValue());
		assertEquals(null, result.getKey());
		assertEquals(null, result.getDescription());
		assertEquals(null, result.getProDataType());
		assertEquals(null, result.getProConstraint());
		assertEquals(null, result.getProType());
		assertEquals(null, result.getProValueBuffer());
	}

	/**
	 * Run the CfgPropertiesJson(Map<String,Object>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:11
	 */
	@Test
	public void testCfgPropertiesJson_4()
		throws Exception {
		Map<String, Object> cp = new HashMap();

		CfgPropertiesJson result = new CfgPropertiesJson(cp);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getValue());
		assertEquals(null, result.getKey());
		assertEquals(null, result.getDescription());
		assertEquals(null, result.getProDataType());
		assertEquals(null, result.getProConstraint());
		assertEquals(null, result.getProType());
		assertEquals(null, result.getProValueBuffer());
	}

	/**
	 * Run the CfgPropertiesJson(Map<String,Object>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:11
	 */
	@Test
	public void testCfgPropertiesJson_5()
		throws Exception {
		Map<String, Object> cp = new HashMap();

		CfgPropertiesJson result = new CfgPropertiesJson(cp);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getValue());
		assertEquals(null, result.getKey());
		assertEquals(null, result.getDescription());
		assertEquals(null, result.getProDataType());
		assertEquals(null, result.getProConstraint());
		assertEquals(null, result.getProType());
		assertEquals(null, result.getProValueBuffer());
	}

	/**
	 * Run the String getDescription() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:11
	 */
	@Test
	public void testGetDescription_1()
		throws Exception {
		CfgProperties cfgProperties = new CfgProperties();
		cfgProperties.setDescription("");
		cfgProperties.setProValueBuffer("");
		cfgProperties.setKey("");
		cfgProperties.setProType("");
		cfgProperties.setProDataType("");
		cfgProperties.setValue("");
		cfgProperties.setLock(1);
		cfgProperties.setProConstraint("");
		CfgPropertiesJson fixture = new CfgPropertiesJson(cfgProperties);
		fixture.setLock(new Integer(1));
		fixture.setProConstraint("");
		fixture.setProDataType("");
		fixture.setProType("");
		fixture.setProValueBuffer("");
		fixture.setDescription("");
		fixture.setValue("");
		fixture.setKey("");

		String result = fixture.getDescription();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getKey() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:11
	 */
	@Test
	public void testGetKey_1()
		throws Exception {
		CfgProperties cfgProperties = new CfgProperties();
		cfgProperties.setDescription("");
		cfgProperties.setProValueBuffer("");
		cfgProperties.setKey("");
		cfgProperties.setProType("");
		cfgProperties.setProDataType("");
		cfgProperties.setValue("");
		cfgProperties.setLock(1);
		cfgProperties.setProConstraint("");
		CfgPropertiesJson fixture = new CfgPropertiesJson(cfgProperties);
		fixture.setLock(new Integer(1));
		fixture.setProConstraint("");
		fixture.setProDataType("");
		fixture.setProType("");
		fixture.setProValueBuffer("");
		fixture.setDescription("");
		fixture.setValue("");
		fixture.setKey("");

		String result = fixture.getKey();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the int getLock() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:11
	 */
	@Test
	public void testGetLock_1()
		throws Exception {
		CfgProperties cfgProperties = new CfgProperties();
		cfgProperties.setDescription("");
		cfgProperties.setProValueBuffer("");
		cfgProperties.setKey("");
		cfgProperties.setProType("");
		cfgProperties.setProDataType("");
		cfgProperties.setValue("");
		cfgProperties.setLock(1);
		cfgProperties.setProConstraint("");
		CfgPropertiesJson fixture = new CfgPropertiesJson(cfgProperties);
		fixture.setLock(new Integer(1));
		fixture.setProConstraint("");
		fixture.setProDataType("");
		fixture.setProType("");
		fixture.setProValueBuffer("");
		fixture.setDescription("");
		fixture.setValue("");
		fixture.setKey("");

		int result = fixture.getLock();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the String getProConstraint() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:11
	 */
	@Test
	public void testGetProConstraint_1()
		throws Exception {
		CfgProperties cfgProperties = new CfgProperties();
		cfgProperties.setDescription("");
		cfgProperties.setProValueBuffer("");
		cfgProperties.setKey("");
		cfgProperties.setProType("");
		cfgProperties.setProDataType("");
		cfgProperties.setValue("");
		cfgProperties.setLock(1);
		cfgProperties.setProConstraint("");
		CfgPropertiesJson fixture = new CfgPropertiesJson(cfgProperties);
		fixture.setLock(new Integer(1));
		fixture.setProConstraint("");
		fixture.setProDataType("");
		fixture.setProType("");
		fixture.setProValueBuffer("");
		fixture.setDescription("");
		fixture.setValue("");
		fixture.setKey("");

		String result = fixture.getProConstraint();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getProDataType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:11
	 */
	@Test
	public void testGetProDataType_1()
		throws Exception {
		CfgProperties cfgProperties = new CfgProperties();
		cfgProperties.setDescription("");
		cfgProperties.setProValueBuffer("");
		cfgProperties.setKey("");
		cfgProperties.setProType("");
		cfgProperties.setProDataType("");
		cfgProperties.setValue("");
		cfgProperties.setLock(1);
		cfgProperties.setProConstraint("");
		CfgPropertiesJson fixture = new CfgPropertiesJson(cfgProperties);
		fixture.setLock(new Integer(1));
		fixture.setProConstraint("");
		fixture.setProDataType("");
		fixture.setProType("");
		fixture.setProValueBuffer("");
		fixture.setDescription("");
		fixture.setValue("");
		fixture.setKey("");

		String result = fixture.getProDataType();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getProType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:11
	 */
	@Test
	public void testGetProType_1()
		throws Exception {
		CfgProperties cfgProperties = new CfgProperties();
		cfgProperties.setDescription("");
		cfgProperties.setProValueBuffer("");
		cfgProperties.setKey("");
		cfgProperties.setProType("");
		cfgProperties.setProDataType("");
		cfgProperties.setValue("");
		cfgProperties.setLock(1);
		cfgProperties.setProConstraint("");
		CfgPropertiesJson fixture = new CfgPropertiesJson(cfgProperties);
		fixture.setLock(new Integer(1));
		fixture.setProConstraint("");
		fixture.setProDataType("");
		fixture.setProType("");
		fixture.setProValueBuffer("");
		fixture.setDescription("");
		fixture.setValue("");
		fixture.setKey("");

		String result = fixture.getProType();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getProValueBuffer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:11
	 */
	@Test
	public void testGetProValueBuffer_1()
		throws Exception {
		CfgProperties cfgProperties = new CfgProperties();
		cfgProperties.setDescription("");
		cfgProperties.setProValueBuffer("");
		cfgProperties.setKey("");
		cfgProperties.setProType("");
		cfgProperties.setProDataType("");
		cfgProperties.setValue("");
		cfgProperties.setLock(1);
		cfgProperties.setProConstraint("");
		CfgPropertiesJson fixture = new CfgPropertiesJson(cfgProperties);
		fixture.setLock(new Integer(1));
		fixture.setProConstraint("");
		fixture.setProDataType("");
		fixture.setProType("");
		fixture.setProValueBuffer("");
		fixture.setDescription("");
		fixture.setValue("");
		fixture.setKey("");

		String result = fixture.getProValueBuffer();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:11
	 */
	@Test
	public void testGetValue_1()
		throws Exception {
		CfgProperties cfgProperties = new CfgProperties();
		cfgProperties.setDescription("");
		cfgProperties.setProValueBuffer("");
		cfgProperties.setKey("");
		cfgProperties.setProType("");
		cfgProperties.setProDataType("");
		cfgProperties.setValue("");
		cfgProperties.setLock(1);
		cfgProperties.setProConstraint("");
		CfgPropertiesJson fixture = new CfgPropertiesJson(cfgProperties);
		fixture.setLock(new Integer(1));
		fixture.setProConstraint("");
		fixture.setProDataType("");
		fixture.setProType("");
		fixture.setProValueBuffer("");
		fixture.setDescription("");
		fixture.setValue("");
		fixture.setKey("");

		String result = fixture.getValue();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the void setDescription(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:11
	 */
	@Test
	public void testSetDescription_1()
		throws Exception {
		CfgProperties cfgProperties = new CfgProperties();
		cfgProperties.setDescription("");
		cfgProperties.setProValueBuffer("");
		cfgProperties.setKey("");
		cfgProperties.setProType("");
		cfgProperties.setProDataType("");
		cfgProperties.setValue("");
		cfgProperties.setLock(1);
		cfgProperties.setProConstraint("");
		CfgPropertiesJson fixture = new CfgPropertiesJson(cfgProperties);
		fixture.setLock(new Integer(1));
		fixture.setProConstraint("");
		fixture.setProDataType("");
		fixture.setProType("");
		fixture.setProValueBuffer("");
		fixture.setDescription("");
		fixture.setValue("");
		fixture.setKey("");
		String description = "";

		fixture.setDescription(description);

		// add additional test code here
	}

	/**
	 * Run the void setKey(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:11
	 */
	@Test
	public void testSetKey_1()
		throws Exception {
		CfgProperties cfgProperties = new CfgProperties();
		cfgProperties.setDescription("");
		cfgProperties.setProValueBuffer("");
		cfgProperties.setKey("");
		cfgProperties.setProType("");
		cfgProperties.setProDataType("");
		cfgProperties.setValue("");
		cfgProperties.setLock(1);
		cfgProperties.setProConstraint("");
		CfgPropertiesJson fixture = new CfgPropertiesJson(cfgProperties);
		fixture.setLock(new Integer(1));
		fixture.setProConstraint("");
		fixture.setProDataType("");
		fixture.setProType("");
		fixture.setProValueBuffer("");
		fixture.setDescription("");
		fixture.setValue("");
		fixture.setKey("");
		String key = "";

		fixture.setKey(key);

		// add additional test code here
	}

	/**
	 * Run the void setLock(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:11
	 */
	@Test
	public void testSetLock_1()
		throws Exception {
		CfgProperties cfgProperties = new CfgProperties();
		cfgProperties.setDescription("");
		cfgProperties.setProValueBuffer("");
		cfgProperties.setKey("");
		cfgProperties.setProType("");
		cfgProperties.setProDataType("");
		cfgProperties.setValue("");
		cfgProperties.setLock(1);
		cfgProperties.setProConstraint("");
		CfgPropertiesJson fixture = new CfgPropertiesJson(cfgProperties);
		fixture.setLock(new Integer(1));
		fixture.setProConstraint("");
		fixture.setProDataType("");
		fixture.setProType("");
		fixture.setProValueBuffer("");
		fixture.setDescription("");
		fixture.setValue("");
		fixture.setKey("");
		int lock = 1;

		fixture.setLock(lock);

		// add additional test code here
	}

	/**
	 * Run the void setLock(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:11
	 */
	@Test
	public void testSetLock_2()
		throws Exception {
		CfgProperties cfgProperties = new CfgProperties();
		cfgProperties.setDescription("");
		cfgProperties.setProValueBuffer("");
		cfgProperties.setKey("");
		cfgProperties.setProType("");
		cfgProperties.setProDataType("");
		cfgProperties.setValue("");
		cfgProperties.setLock(1);
		cfgProperties.setProConstraint("");
		CfgPropertiesJson fixture = new CfgPropertiesJson(cfgProperties);
		fixture.setLock(new Integer(1));
		fixture.setProConstraint("");
		fixture.setProDataType("");
		fixture.setProType("");
		fixture.setProValueBuffer("");
		fixture.setDescription("");
		fixture.setValue("");
		fixture.setKey("");
		Integer lock = new Integer(1);

		fixture.setLock(lock);

		// add additional test code here
	}

	/**
	 * Run the void setProConstraint(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:11
	 */
	@Test
	public void testSetProConstraint_1()
		throws Exception {
		CfgProperties cfgProperties = new CfgProperties();
		cfgProperties.setDescription("");
		cfgProperties.setProValueBuffer("");
		cfgProperties.setKey("");
		cfgProperties.setProType("");
		cfgProperties.setProDataType("");
		cfgProperties.setValue("");
		cfgProperties.setLock(1);
		cfgProperties.setProConstraint("");
		CfgPropertiesJson fixture = new CfgPropertiesJson(cfgProperties);
		fixture.setLock(new Integer(1));
		fixture.setProConstraint("");
		fixture.setProDataType("");
		fixture.setProType("");
		fixture.setProValueBuffer("");
		fixture.setDescription("");
		fixture.setValue("");
		fixture.setKey("");
		String proConstraint = "";

		fixture.setProConstraint(proConstraint);

		// add additional test code here
	}

	/**
	 * Run the void setProDataType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:11
	 */
	@Test
	public void testSetProDataType_1()
		throws Exception {
		CfgProperties cfgProperties = new CfgProperties();
		cfgProperties.setDescription("");
		cfgProperties.setProValueBuffer("");
		cfgProperties.setKey("");
		cfgProperties.setProType("");
		cfgProperties.setProDataType("");
		cfgProperties.setValue("");
		cfgProperties.setLock(1);
		cfgProperties.setProConstraint("");
		CfgPropertiesJson fixture = new CfgPropertiesJson(cfgProperties);
		fixture.setLock(new Integer(1));
		fixture.setProConstraint("");
		fixture.setProDataType("");
		fixture.setProType("");
		fixture.setProValueBuffer("");
		fixture.setDescription("");
		fixture.setValue("");
		fixture.setKey("");
		String proDataType = "";

		fixture.setProDataType(proDataType);

		// add additional test code here
	}

	/**
	 * Run the void setProType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:11
	 */
	@Test
	public void testSetProType_1()
		throws Exception {
		CfgProperties cfgProperties = new CfgProperties();
		cfgProperties.setDescription("");
		cfgProperties.setProValueBuffer("");
		cfgProperties.setKey("");
		cfgProperties.setProType("");
		cfgProperties.setProDataType("");
		cfgProperties.setValue("");
		cfgProperties.setLock(1);
		cfgProperties.setProConstraint("");
		CfgPropertiesJson fixture = new CfgPropertiesJson(cfgProperties);
		fixture.setLock(new Integer(1));
		fixture.setProConstraint("");
		fixture.setProDataType("");
		fixture.setProType("");
		fixture.setProValueBuffer("");
		fixture.setDescription("");
		fixture.setValue("");
		fixture.setKey("");
		String proType = "";

		fixture.setProType(proType);

		// add additional test code here
	}

	/**
	 * Run the void setProValueBuffer(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:11
	 */
	@Test
	public void testSetProValueBuffer_1()
		throws Exception {
		CfgProperties cfgProperties = new CfgProperties();
		cfgProperties.setDescription("");
		cfgProperties.setProValueBuffer("");
		cfgProperties.setKey("");
		cfgProperties.setProType("");
		cfgProperties.setProDataType("");
		cfgProperties.setValue("");
		cfgProperties.setLock(1);
		cfgProperties.setProConstraint("");
		CfgPropertiesJson fixture = new CfgPropertiesJson(cfgProperties);
		fixture.setLock(new Integer(1));
		fixture.setProConstraint("");
		fixture.setProDataType("");
		fixture.setProType("");
		fixture.setProValueBuffer("");
		fixture.setDescription("");
		fixture.setValue("");
		fixture.setKey("");
		String proValueBuffer = "";

		fixture.setProValueBuffer(proValueBuffer);

		// add additional test code here
	}

	/**
	 * Run the void setValue(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:11
	 */
	@Test
	public void testSetValue_1()
		throws Exception {
		CfgProperties cfgProperties = new CfgProperties();
		cfgProperties.setDescription("");
		cfgProperties.setProValueBuffer("");
		cfgProperties.setKey("");
		cfgProperties.setProType("");
		cfgProperties.setProDataType("");
		cfgProperties.setValue("");
		cfgProperties.setLock(1);
		cfgProperties.setProConstraint("");
		CfgPropertiesJson fixture = new CfgPropertiesJson(cfgProperties);
		fixture.setLock(new Integer(1));
		fixture.setProConstraint("");
		fixture.setProDataType("");
		fixture.setProType("");
		fixture.setProValueBuffer("");
		fixture.setDescription("");
		fixture.setValue("");
		fixture.setKey("");
		String value = "";

		fixture.setValue(value);

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
		new org.junit.runner.JUnitCore().run(CfgPropertiesJsonTest.class);
	}
}
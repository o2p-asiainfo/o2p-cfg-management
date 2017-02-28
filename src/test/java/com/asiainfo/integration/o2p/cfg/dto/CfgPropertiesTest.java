package com.asiainfo.integration.o2p.cfg.dto;

import java.util.Date;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ConfPropertiesTest</code> contains tests for the class <code>{@link CfgProperties}</code>.
 *
 * @generatedBy CodePro at 15-11-26 上午11:12
 * @author windy
 * @version $Revision: 1.0 $
 */
public class CfgPropertiesTest {
	/**
	 * Run the ConfProperties() constructor test.
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testConfProperties_1()
		throws Exception {
		CfgProperties result = new CfgProperties();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the Object clone() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testClone_1()
		throws Exception {
		CfgProperties fixture = new CfgProperties();
		fixture.setDirId(new Integer(1));
		fixture.setLock(1);
		fixture.setState("");
		fixture.setModuleName("");
		fixture.setKey("");
		fixture.setProType("");
		fixture.setValue("");
		fixture.setProConstraint("");
		fixture.setDescription("");
		fixture.setProValueBuffer("");
		fixture.setId(new Integer(1));
		fixture.setProDataType("");
		fixture.setEffectZone("");
		fixture.setGroupDesc("");
		fixture.setGroup("");
		fixture.setSynStatus("");

		Object result = fixture.clone();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object clone() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testClone_2()
		throws Exception {
		CfgProperties fixture = new CfgProperties();
		fixture.setDirId(new Integer(1));
		fixture.setLock(1);
		fixture.setState("");
		fixture.setModuleName("");
		fixture.setKey("");
		fixture.setProType("");
		fixture.setValue("");
		fixture.setProConstraint("");
		fixture.setDescription("");
		fixture.setProValueBuffer("");
		fixture.setId(new Integer(1));
		fixture.setProDataType("");
		fixture.setEffectZone("");
		fixture.setGroupDesc("");
		fixture.setGroup("");
		fixture.setSynStatus("");

		Object result = fixture.clone();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Date getCreateDt() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testGetCreateDt_1()
		throws Exception {
		CfgProperties fixture = new CfgProperties();
		fixture.setDirId(new Integer(1));
		fixture.setLock(1);
		fixture.setState("");
		fixture.setModuleName("");
		fixture.setKey("");
		fixture.setProType("");
		fixture.setValue("");
		fixture.setProConstraint("");
		fixture.setDescription("");
		fixture.setProValueBuffer("");
		fixture.setId(new Integer(1));
		fixture.setProDataType("");
		fixture.setEffectZone("");
		fixture.setGroupDesc("");
		fixture.setGroup("");
		fixture.setSynStatus("");

		Date result = fixture.getCreateDt();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Date getCreateDt() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testGetCreateDt_2()
		throws Exception {
		CfgProperties fixture = new CfgProperties();
		fixture.setDirId(new Integer(1));
		fixture.setLock(1);
		fixture.setState("");
		fixture.setModuleName("");
		fixture.setKey("");
		fixture.setProType("");
		fixture.setValue("");
		fixture.setProConstraint("");
		fixture.setDescription("");
		fixture.setProValueBuffer("");
		fixture.setId(new Integer(1));
		fixture.setProDataType("");
		fixture.setEffectZone("");
		fixture.setGroupDesc("");
		fixture.setGroup("");
		fixture.setSynStatus("");

		Date result = fixture.getCreateDt();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getDescription() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testGetDescription_1()
		throws Exception {
		CfgProperties fixture = new CfgProperties();
		fixture.setDirId(new Integer(1));
		fixture.setLock(1);
		fixture.setState("");
		fixture.setModuleName("");
		fixture.setKey("");
		fixture.setProType("");
		fixture.setValue("");
		fixture.setProConstraint("");
		fixture.setDescription("");
		fixture.setProValueBuffer("");
		fixture.setId(new Integer(1));
		fixture.setProDataType("");
		fixture.setEffectZone("");
		fixture.setGroupDesc("");
		fixture.setGroup("");
		fixture.setSynStatus("");

		String result = fixture.getDescription();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the Integer getDirId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testGetDirId_1()
		throws Exception {
		CfgProperties fixture = new CfgProperties();
		fixture.setDirId(new Integer(1));
		fixture.setLock(1);
		fixture.setState("");
		fixture.setModuleName("");
		fixture.setKey("");
		fixture.setProType("");
		fixture.setValue("");
		fixture.setProConstraint("");
		fixture.setDescription("");
		fixture.setProValueBuffer("");
		fixture.setId(new Integer(1));
		fixture.setProDataType("");
		fixture.setEffectZone("");
		fixture.setGroupDesc("");
		fixture.setGroup("");
		fixture.setSynStatus("");

		Integer result = fixture.getDirId();

		// add additional test code here
		assertNotNull(result);
		assertEquals("1", result.toString());
		assertEquals((byte) 1, result.byteValue());
		assertEquals((short) 1, result.shortValue());
		assertEquals(1, result.intValue());
		assertEquals(1L, result.longValue());
		assertEquals(1.0f, result.floatValue(), 1.0f);
		assertEquals(1.0, result.doubleValue(), 1.0);
	}

	/**
	 * Run the String getEffectZone() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testGetEffectZone_1()
		throws Exception {
		CfgProperties fixture = new CfgProperties();
		fixture.setDirId(new Integer(1));
		fixture.setLock(1);
		fixture.setState("");
		fixture.setModuleName("");
		fixture.setKey("");
		fixture.setProType("");
		fixture.setValue("");
		fixture.setProConstraint("");
		fixture.setDescription("");
		fixture.setProValueBuffer("");
		fixture.setId(new Integer(1));
		fixture.setProDataType("");
		fixture.setEffectZone("");
		fixture.setGroupDesc("");
		fixture.setGroup("");
		fixture.setSynStatus("");

		String result = fixture.getEffectZone();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getGroup() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testGetGroup_1()
		throws Exception {
		CfgProperties fixture = new CfgProperties();
		fixture.setDirId(new Integer(1));
		fixture.setLock(1);
		fixture.setState("");
		fixture.setModuleName("");
		fixture.setKey("");
		fixture.setProType("");
		fixture.setValue("");
		fixture.setProConstraint("");
		fixture.setDescription("");
		fixture.setProValueBuffer("");
		fixture.setId(new Integer(1));
		fixture.setProDataType("");
		fixture.setEffectZone("");
		fixture.setGroupDesc("");
		fixture.setGroup("");
		fixture.setSynStatus("");

		String result = fixture.getGroup();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getGroupDesc() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testGetGroupDesc_1()
		throws Exception {
		CfgProperties fixture = new CfgProperties();
		fixture.setDirId(new Integer(1));
		fixture.setLock(1);
		fixture.setState("");
		fixture.setModuleName("");
		fixture.setKey("");
		fixture.setProType("");
		fixture.setValue("");
		fixture.setProConstraint("");
		fixture.setDescription("");
		fixture.setProValueBuffer("");
		fixture.setId(new Integer(1));
		fixture.setProDataType("");
		fixture.setEffectZone("");
		fixture.setGroupDesc("");
		fixture.setGroup("");
		fixture.setSynStatus("");

		String result = fixture.getGroupDesc();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the Integer getId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testGetId_1()
		throws Exception {
		CfgProperties fixture = new CfgProperties();
		fixture.setDirId(new Integer(1));
		fixture.setLock(1);
		fixture.setState("");
		fixture.setModuleName("");
		fixture.setKey("");
		fixture.setProType("");
		fixture.setValue("");
		fixture.setProConstraint("");
		fixture.setDescription("");
		fixture.setProValueBuffer("");
		fixture.setId(new Integer(1));
		fixture.setProDataType("");
		fixture.setEffectZone("");
		fixture.setGroupDesc("");
		fixture.setGroup("");
		fixture.setSynStatus("");

		Integer result = fixture.getId();

		// add additional test code here
		assertNotNull(result);
		assertEquals("1", result.toString());
		assertEquals((byte) 1, result.byteValue());
		assertEquals((short) 1, result.shortValue());
		assertEquals(1, result.intValue());
		assertEquals(1L, result.longValue());
		assertEquals(1.0f, result.floatValue(), 1.0f);
		assertEquals(1.0, result.doubleValue(), 1.0);
	}

	/**
	 * Run the String getKey() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testGetKey_1()
		throws Exception {
		CfgProperties fixture = new CfgProperties();
		fixture.setDirId(new Integer(1));
		fixture.setLock(1);
		fixture.setState("");
		fixture.setModuleName("");
		fixture.setKey("");
		fixture.setProType("");
		fixture.setValue("");
		fixture.setProConstraint("");
		fixture.setDescription("");
		fixture.setProValueBuffer("");
		fixture.setId(new Integer(1));
		fixture.setProDataType("");
		fixture.setEffectZone("");
		fixture.setGroupDesc("");
		fixture.setGroup("");
		fixture.setSynStatus("");

		String result = fixture.getKey();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the int getLock() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testGetLock_1()
		throws Exception {
		CfgProperties fixture = new CfgProperties();
		fixture.setDirId(new Integer(1));
		fixture.setLock(1);
		fixture.setState("");
		fixture.setModuleName("");
		fixture.setKey("");
		fixture.setProType("");
		fixture.setValue("");
		fixture.setProConstraint("");
		fixture.setDescription("");
		fixture.setProValueBuffer("");
		fixture.setId(new Integer(1));
		fixture.setProDataType("");
		fixture.setEffectZone("");
		fixture.setGroupDesc("");
		fixture.setGroup("");
		fixture.setSynStatus("");

		int result = fixture.getLock();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the Date getModifyDt() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testGetModifyDt_1()
		throws Exception {
		CfgProperties fixture = new CfgProperties();
		fixture.setDirId(new Integer(1));
		fixture.setLock(1);
		fixture.setState("");
		fixture.setModuleName("");
		fixture.setKey("");
		fixture.setProType("");
		fixture.setValue("");
		fixture.setProConstraint("");
		fixture.setDescription("");
		fixture.setProValueBuffer("");
		fixture.setId(new Integer(1));
		fixture.setProDataType("");
		fixture.setEffectZone("");
		fixture.setGroupDesc("");
		fixture.setGroup("");
		fixture.setSynStatus("");

		Date result = fixture.getModifyDt();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Date getModifyDt() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testGetModifyDt_2()
		throws Exception {
		CfgProperties fixture = new CfgProperties();
		fixture.setDirId(new Integer(1));
		fixture.setLock(1);
		fixture.setState("");
		fixture.setModuleName("");
		fixture.setKey("");
		fixture.setProType("");
		fixture.setValue("");
		fixture.setProConstraint("");
		fixture.setDescription("");
		fixture.setProValueBuffer("");
		fixture.setId(new Integer(1));
		fixture.setProDataType("");
		fixture.setEffectZone("");
		fixture.setGroupDesc("");
		fixture.setGroup("");
		fixture.setSynStatus("");

		Date result = fixture.getModifyDt();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getModuleName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testGetModuleName_1()
		throws Exception {
		CfgProperties fixture = new CfgProperties();
		fixture.setDirId(new Integer(1));
		fixture.setLock(1);
		fixture.setState("");
		fixture.setModuleName("");
		fixture.setKey("");
		fixture.setProType("");
		fixture.setValue("");
		fixture.setProConstraint("");
		fixture.setDescription("");
		fixture.setProValueBuffer("");
		fixture.setId(new Integer(1));
		fixture.setProDataType("");
		fixture.setEffectZone("");
		fixture.setGroupDesc("");
		fixture.setGroup("");
		fixture.setSynStatus("");

		String result = fixture.getModuleName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getProConstraint() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testGetProConstraint_1()
		throws Exception {
		CfgProperties fixture = new CfgProperties();
		fixture.setDirId(new Integer(1));
		fixture.setLock(1);
		fixture.setState("");
		fixture.setModuleName("");
		fixture.setKey("");
		fixture.setProType("");
		fixture.setValue("");
		fixture.setProConstraint("");
		fixture.setDescription("");
		fixture.setProValueBuffer("");
		fixture.setId(new Integer(1));
		fixture.setProDataType("");
		fixture.setEffectZone("");
		fixture.setGroupDesc("");
		fixture.setGroup("");
		fixture.setSynStatus("");

		String result = fixture.getProConstraint();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getProDataType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testGetProDataType_1()
		throws Exception {
		CfgProperties fixture = new CfgProperties();
		fixture.setDirId(new Integer(1));
		fixture.setLock(1);
		fixture.setState("");
		fixture.setModuleName("");
		fixture.setKey("");
		fixture.setProType("");
		fixture.setValue("");
		fixture.setProConstraint("");
		fixture.setDescription("");
		fixture.setProValueBuffer("");
		fixture.setId(new Integer(1));
		fixture.setProDataType("");
		fixture.setEffectZone("");
		fixture.setGroupDesc("");
		fixture.setGroup("");
		fixture.setSynStatus("");

		String result = fixture.getProDataType();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getProType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testGetProType_1()
		throws Exception {
		CfgProperties fixture = new CfgProperties();
		fixture.setDirId(new Integer(1));
		fixture.setLock(1);
		fixture.setState("");
		fixture.setModuleName("");
		fixture.setKey("");
		fixture.setProType("");
		fixture.setValue("");
		fixture.setProConstraint("");
		fixture.setDescription("");
		fixture.setProValueBuffer("");
		fixture.setId(new Integer(1));
		fixture.setProDataType("");
		fixture.setEffectZone("");
		fixture.setGroupDesc("");
		fixture.setGroup("");
		fixture.setSynStatus("");

		String result = fixture.getProType();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getProValueBuffer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testGetProValueBuffer_1()
		throws Exception {
		CfgProperties fixture = new CfgProperties();
		fixture.setDirId(new Integer(1));
		fixture.setLock(1);
		fixture.setState("");
		fixture.setModuleName("");
		fixture.setKey("");
		fixture.setProType("");
		fixture.setValue("");
		fixture.setProConstraint("");
		fixture.setDescription("");
		fixture.setProValueBuffer("");
		fixture.setId(new Integer(1));
		fixture.setProDataType("");
		fixture.setEffectZone("");
		fixture.setGroupDesc("");
		fixture.setGroup("");
		fixture.setSynStatus("");

		String result = fixture.getProValueBuffer();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getState() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testGetState_1()
		throws Exception {
		CfgProperties fixture = new CfgProperties();
		fixture.setDirId(new Integer(1));
		fixture.setLock(1);
		fixture.setState("");
		fixture.setModuleName("");
		fixture.setKey("");
		fixture.setProType("");
		fixture.setValue("");
		fixture.setProConstraint("");
		fixture.setDescription("");
		fixture.setProValueBuffer("");
		fixture.setId(new Integer(1));
		fixture.setProDataType("");
		fixture.setEffectZone("");
		fixture.setGroupDesc("");
		fixture.setGroup("");
		fixture.setSynStatus("");

		String result = fixture.getState();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getSynStatus() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testGetSynStatus_1()
		throws Exception {
		CfgProperties fixture = new CfgProperties();
		fixture.setDirId(new Integer(1));
		fixture.setLock(1);
		fixture.setState("");
		fixture.setModuleName("");
		fixture.setKey("");
		fixture.setProType("");
		fixture.setValue("");
		fixture.setProConstraint("");
		fixture.setDescription("");
		fixture.setProValueBuffer("");
		fixture.setId(new Integer(1));
		fixture.setProDataType("");
		fixture.setEffectZone("");
		fixture.setGroupDesc("");
		fixture.setGroup("");
		fixture.setSynStatus("");

		String result = fixture.getSynStatus();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testGetValue_1()
		throws Exception {
		CfgProperties fixture = new CfgProperties();
		fixture.setDirId(new Integer(1));
		fixture.setLock(1);
		fixture.setState("");
		fixture.setModuleName("");
		fixture.setKey("");
		fixture.setProType("");
		fixture.setValue("");
		fixture.setProConstraint("");
		fixture.setDescription("");
		fixture.setProValueBuffer("");
		fixture.setId(new Integer(1));
		fixture.setProDataType("");
		fixture.setEffectZone("");
		fixture.setGroupDesc("");
		fixture.setGroup("");
		fixture.setSynStatus("");

		String result = fixture.getValue();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the void setCreateDt(Date) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testSetCreateDt_1()
		throws Exception {
		CfgProperties fixture = new CfgProperties();
		fixture.setDirId(new Integer(1));
		fixture.setLock(1);
		fixture.setState("");
		fixture.setModuleName("");
		fixture.setKey("");
		fixture.setProType("");
		fixture.setValue("");
		fixture.setProConstraint("");
		fixture.setDescription("");
		fixture.setProValueBuffer("");
		fixture.setId(new Integer(1));
		fixture.setProDataType("");
		fixture.setEffectZone("");
		fixture.setGroupDesc("");
		fixture.setGroup("");
		fixture.setSynStatus("");
		Date createDt = null;

		fixture.setCreateDt(createDt);

		// add additional test code here
	}

	/**
	 * Run the void setCreateDt(Date) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testSetCreateDt_2()
		throws Exception {
		CfgProperties fixture = new CfgProperties();
		fixture.setDirId(new Integer(1));
		fixture.setLock(1);
		fixture.setState("");
		fixture.setModuleName("");
		fixture.setKey("");
		fixture.setProType("");
		fixture.setValue("");
		fixture.setProConstraint("");
		fixture.setDescription("");
		fixture.setProValueBuffer("");
		fixture.setId(new Integer(1));
		fixture.setProDataType("");
		fixture.setEffectZone("");
		fixture.setGroupDesc("");
		fixture.setGroup("");
		fixture.setSynStatus("");
		Date createDt = new Date();

		fixture.setCreateDt(createDt);

		// add additional test code here
	}

	/**
	 * Run the void setDescription(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testSetDescription_1()
		throws Exception {
		CfgProperties fixture = new CfgProperties();
		fixture.setDirId(new Integer(1));
		fixture.setLock(1);
		fixture.setState("");
		fixture.setModuleName("");
		fixture.setKey("");
		fixture.setProType("");
		fixture.setValue("");
		fixture.setProConstraint("");
		fixture.setDescription("");
		fixture.setProValueBuffer("");
		fixture.setId(new Integer(1));
		fixture.setProDataType("");
		fixture.setEffectZone("");
		fixture.setGroupDesc("");
		fixture.setGroup("");
		fixture.setSynStatus("");
		String description = "";

		fixture.setDescription(description);

		// add additional test code here
	}

	/**
	 * Run the void setDirId(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testSetDirId_1()
		throws Exception {
		CfgProperties fixture = new CfgProperties();
		fixture.setDirId(new Integer(1));
		fixture.setLock(1);
		fixture.setState("");
		fixture.setModuleName("");
		fixture.setKey("");
		fixture.setProType("");
		fixture.setValue("");
		fixture.setProConstraint("");
		fixture.setDescription("");
		fixture.setProValueBuffer("");
		fixture.setId(new Integer(1));
		fixture.setProDataType("");
		fixture.setEffectZone("");
		fixture.setGroupDesc("");
		fixture.setGroup("");
		fixture.setSynStatus("");
		Integer dirId = new Integer(1);

		fixture.setDirId(dirId);

		// add additional test code here
	}

	/**
	 * Run the void setEffectZone(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testSetEffectZone_1()
		throws Exception {
		CfgProperties fixture = new CfgProperties();
		fixture.setDirId(new Integer(1));
		fixture.setLock(1);
		fixture.setState("");
		fixture.setModuleName("");
		fixture.setKey("");
		fixture.setProType("");
		fixture.setValue("");
		fixture.setProConstraint("");
		fixture.setDescription("");
		fixture.setProValueBuffer("");
		fixture.setId(new Integer(1));
		fixture.setProDataType("");
		fixture.setEffectZone("");
		fixture.setGroupDesc("");
		fixture.setGroup("");
		fixture.setSynStatus("");
		String effectZone = "";

		fixture.setEffectZone(effectZone);

		// add additional test code here
	}

	/**
	 * Run the void setGroup(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testSetGroup_1()
		throws Exception {
		CfgProperties fixture = new CfgProperties();
		fixture.setDirId(new Integer(1));
		fixture.setLock(1);
		fixture.setState("");
		fixture.setModuleName("");
		fixture.setKey("");
		fixture.setProType("");
		fixture.setValue("");
		fixture.setProConstraint("");
		fixture.setDescription("");
		fixture.setProValueBuffer("");
		fixture.setId(new Integer(1));
		fixture.setProDataType("");
		fixture.setEffectZone("");
		fixture.setGroupDesc("");
		fixture.setGroup("");
		fixture.setSynStatus("");
		String group = "";

		fixture.setGroup(group);

		// add additional test code here
	}

	/**
	 * Run the void setGroupDesc(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testSetGroupDesc_1()
		throws Exception {
		CfgProperties fixture = new CfgProperties();
		fixture.setDirId(new Integer(1));
		fixture.setLock(1);
		fixture.setState("");
		fixture.setModuleName("");
		fixture.setKey("");
		fixture.setProType("");
		fixture.setValue("");
		fixture.setProConstraint("");
		fixture.setDescription("");
		fixture.setProValueBuffer("");
		fixture.setId(new Integer(1));
		fixture.setProDataType("");
		fixture.setEffectZone("");
		fixture.setGroupDesc("");
		fixture.setGroup("");
		fixture.setSynStatus("");
		String groupDesc = "";

		fixture.setGroupDesc(groupDesc);

		// add additional test code here
	}

	/**
	 * Run the void setId(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testSetId_1()
		throws Exception {
		CfgProperties fixture = new CfgProperties();
		fixture.setDirId(new Integer(1));
		fixture.setLock(1);
		fixture.setState("");
		fixture.setModuleName("");
		fixture.setKey("");
		fixture.setProType("");
		fixture.setValue("");
		fixture.setProConstraint("");
		fixture.setDescription("");
		fixture.setProValueBuffer("");
		fixture.setId(new Integer(1));
		fixture.setProDataType("");
		fixture.setEffectZone("");
		fixture.setGroupDesc("");
		fixture.setGroup("");
		fixture.setSynStatus("");
		Integer id = new Integer(1);

		fixture.setId(id);

		// add additional test code here
	}

	/**
	 * Run the void setKey(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testSetKey_1()
		throws Exception {
		CfgProperties fixture = new CfgProperties();
		fixture.setDirId(new Integer(1));
		fixture.setLock(1);
		fixture.setState("");
		fixture.setModuleName("");
		fixture.setKey("");
		fixture.setProType("");
		fixture.setValue("");
		fixture.setProConstraint("");
		fixture.setDescription("");
		fixture.setProValueBuffer("");
		fixture.setId(new Integer(1));
		fixture.setProDataType("");
		fixture.setEffectZone("");
		fixture.setGroupDesc("");
		fixture.setGroup("");
		fixture.setSynStatus("");
		String key = "";

		fixture.setKey(key);

		// add additional test code here
	}

	/**
	 * Run the void setLock(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testSetLock_1()
		throws Exception {
		CfgProperties fixture = new CfgProperties();
		fixture.setDirId(new Integer(1));
		fixture.setLock(1);
		fixture.setState("");
		fixture.setModuleName("");
		fixture.setKey("");
		fixture.setProType("");
		fixture.setValue("");
		fixture.setProConstraint("");
		fixture.setDescription("");
		fixture.setProValueBuffer("");
		fixture.setId(new Integer(1));
		fixture.setProDataType("");
		fixture.setEffectZone("");
		fixture.setGroupDesc("");
		fixture.setGroup("");
		fixture.setSynStatus("");
		int lock = 1;

		fixture.setLock(lock);

		// add additional test code here
	}

	/**
	 * Run the void setModifyDt(Date) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testSetModifyDt_1()
		throws Exception {
		CfgProperties fixture = new CfgProperties();
		fixture.setDirId(new Integer(1));
		fixture.setLock(1);
		fixture.setState("");
		fixture.setModuleName("");
		fixture.setKey("");
		fixture.setProType("");
		fixture.setValue("");
		fixture.setProConstraint("");
		fixture.setDescription("");
		fixture.setProValueBuffer("");
		fixture.setId(new Integer(1));
		fixture.setProDataType("");
		fixture.setEffectZone("");
		fixture.setGroupDesc("");
		fixture.setGroup("");
		fixture.setSynStatus("");
		Date modifyDt = null;

		fixture.setModifyDt(modifyDt);

		// add additional test code here
	}

	/**
	 * Run the void setModifyDt(Date) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testSetModifyDt_2()
		throws Exception {
		CfgProperties fixture = new CfgProperties();
		fixture.setDirId(new Integer(1));
		fixture.setLock(1);
		fixture.setState("");
		fixture.setModuleName("");
		fixture.setKey("");
		fixture.setProType("");
		fixture.setValue("");
		fixture.setProConstraint("");
		fixture.setDescription("");
		fixture.setProValueBuffer("");
		fixture.setId(new Integer(1));
		fixture.setProDataType("");
		fixture.setEffectZone("");
		fixture.setGroupDesc("");
		fixture.setGroup("");
		fixture.setSynStatus("");
		Date modifyDt = new Date();

		fixture.setModifyDt(modifyDt);

		// add additional test code here
	}

	/**
	 * Run the void setModuleName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testSetModuleName_1()
		throws Exception {
		CfgProperties fixture = new CfgProperties();
		fixture.setDirId(new Integer(1));
		fixture.setLock(1);
		fixture.setState("");
		fixture.setModuleName("");
		fixture.setKey("");
		fixture.setProType("");
		fixture.setValue("");
		fixture.setProConstraint("");
		fixture.setDescription("");
		fixture.setProValueBuffer("");
		fixture.setId(new Integer(1));
		fixture.setProDataType("");
		fixture.setEffectZone("");
		fixture.setGroupDesc("");
		fixture.setGroup("");
		fixture.setSynStatus("");
		String moduleName = "";

		fixture.setModuleName(moduleName);

		// add additional test code here
	}

	/**
	 * Run the void setProConstraint(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testSetProConstraint_1()
		throws Exception {
		CfgProperties fixture = new CfgProperties();
		fixture.setDirId(new Integer(1));
		fixture.setLock(1);
		fixture.setState("");
		fixture.setModuleName("");
		fixture.setKey("");
		fixture.setProType("");
		fixture.setValue("");
		fixture.setProConstraint("");
		fixture.setDescription("");
		fixture.setProValueBuffer("");
		fixture.setId(new Integer(1));
		fixture.setProDataType("");
		fixture.setEffectZone("");
		fixture.setGroupDesc("");
		fixture.setGroup("");
		fixture.setSynStatus("");
		String proConstraint = "";

		fixture.setProConstraint(proConstraint);

		// add additional test code here
	}

	/**
	 * Run the void setProDataType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testSetProDataType_1()
		throws Exception {
		CfgProperties fixture = new CfgProperties();
		fixture.setDirId(new Integer(1));
		fixture.setLock(1);
		fixture.setState("");
		fixture.setModuleName("");
		fixture.setKey("");
		fixture.setProType("");
		fixture.setValue("");
		fixture.setProConstraint("");
		fixture.setDescription("");
		fixture.setProValueBuffer("");
		fixture.setId(new Integer(1));
		fixture.setProDataType("");
		fixture.setEffectZone("");
		fixture.setGroupDesc("");
		fixture.setGroup("");
		fixture.setSynStatus("");
		String proDataType = "";

		fixture.setProDataType(proDataType);

		// add additional test code here
	}

	/**
	 * Run the void setProType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testSetProType_1()
		throws Exception {
		CfgProperties fixture = new CfgProperties();
		fixture.setDirId(new Integer(1));
		fixture.setLock(1);
		fixture.setState("");
		fixture.setModuleName("");
		fixture.setKey("");
		fixture.setProType("");
		fixture.setValue("");
		fixture.setProConstraint("");
		fixture.setDescription("");
		fixture.setProValueBuffer("");
		fixture.setId(new Integer(1));
		fixture.setProDataType("");
		fixture.setEffectZone("");
		fixture.setGroupDesc("");
		fixture.setGroup("");
		fixture.setSynStatus("");
		String proType = "";

		fixture.setProType(proType);

		// add additional test code here
	}

	/**
	 * Run the void setProValueBuffer(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testSetProValueBuffer_1()
		throws Exception {
		CfgProperties fixture = new CfgProperties();
		fixture.setDirId(new Integer(1));
		fixture.setLock(1);
		fixture.setState("");
		fixture.setModuleName("");
		fixture.setKey("");
		fixture.setProType("");
		fixture.setValue("");
		fixture.setProConstraint("");
		fixture.setDescription("");
		fixture.setProValueBuffer("");
		fixture.setId(new Integer(1));
		fixture.setProDataType("");
		fixture.setEffectZone("");
		fixture.setGroupDesc("");
		fixture.setGroup("");
		fixture.setSynStatus("");
		String proValueBuffer = "";

		fixture.setProValueBuffer(proValueBuffer);

		// add additional test code here
	}

	/**
	 * Run the void setState(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testSetState_1()
		throws Exception {
		CfgProperties fixture = new CfgProperties();
		fixture.setDirId(new Integer(1));
		fixture.setLock(1);
		fixture.setState("");
		fixture.setModuleName("");
		fixture.setKey("");
		fixture.setProType("");
		fixture.setValue("");
		fixture.setProConstraint("");
		fixture.setDescription("");
		fixture.setProValueBuffer("");
		fixture.setId(new Integer(1));
		fixture.setProDataType("");
		fixture.setEffectZone("");
		fixture.setGroupDesc("");
		fixture.setGroup("");
		fixture.setSynStatus("");
		String state = "";

		fixture.setState(state);

		// add additional test code here
	}

	/**
	 * Run the void setSynStatus(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testSetSynStatus_1()
		throws Exception {
		CfgProperties fixture = new CfgProperties();
		fixture.setDirId(new Integer(1));
		fixture.setLock(1);
		fixture.setState("");
		fixture.setModuleName("");
		fixture.setKey("");
		fixture.setProType("");
		fixture.setValue("");
		fixture.setProConstraint("");
		fixture.setDescription("");
		fixture.setProValueBuffer("");
		fixture.setId(new Integer(1));
		fixture.setProDataType("");
		fixture.setEffectZone("");
		fixture.setGroupDesc("");
		fixture.setGroup("");
		fixture.setSynStatus("");
		String synStatus = "";

		fixture.setSynStatus(synStatus);

		// add additional test code here
	}

	/**
	 * Run the void setValue(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testSetValue_1()
		throws Exception {
		CfgProperties fixture = new CfgProperties();
		fixture.setDirId(new Integer(1));
		fixture.setLock(1);
		fixture.setState("");
		fixture.setModuleName("");
		fixture.setKey("");
		fixture.setProType("");
		fixture.setValue("");
		fixture.setProConstraint("");
		fixture.setDescription("");
		fixture.setProValueBuffer("");
		fixture.setId(new Integer(1));
		fixture.setProDataType("");
		fixture.setEffectZone("");
		fixture.setGroupDesc("");
		fixture.setGroup("");
		fixture.setSynStatus("");
		String value = "";

		fixture.setValue(value);

		// add additional test code here
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testToString_1()
		throws Exception {
		CfgProperties fixture = new CfgProperties();
		fixture.setDirId(new Integer(1));
		fixture.setLock(1);
		fixture.setState("");
		fixture.setModuleName("");
		fixture.setKey("");
		fixture.setProType("");
		fixture.setValue("");
		fixture.setProConstraint("");
		fixture.setDescription("");
		fixture.setProValueBuffer("");
		fixture.setId(new Integer(1));
		fixture.setProDataType("");
		fixture.setEffectZone("");
		fixture.setGroupDesc("");
		fixture.setGroup("");
		fixture.setSynStatus("");

		String result = fixture.toString();

		// add additional test code here
		assertEquals("id:1,key:,proDataType=,value=,proValueBuffer=,proType=,proEncrypt=,moduleName=,groupName=,groupDesc=,effectZone=,createDt=,modifyDt=", result);
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
		new org.junit.runner.JUnitCore().run(CfgPropertiesTest.class);
	}
}
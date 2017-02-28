package com.asiainfo.integration.o2p.cfg.dto;

import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ZkPathTest</code> contains tests for the class <code>{@link ZkPath}</code>.
 *
 * @generatedBy CodePro at 15-11-26 上午11:11
 * @author windy
 * @version $Revision: 1.0 $
 */
public class ZkPathTest {
	/**
	 * Run the ZkPath() constructor test.
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:11
	 */
	@Test
	public void testZkPath_1()
		throws Exception {
		ZkPath result = new ZkPath();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the List<ZkPath> getChildren() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:11
	 */
	@Test
	public void testGetChildren_1()
		throws Exception {
		ZkPath fixture = new ZkPath();
		fixture.setType("");
		fixture.setDirType(new Integer(1));
		fixture.setChildren(new LinkedList());
		fixture.setDirState("");
		fixture.setId(1);
		fixture.setpId(1);
		fixture.setText("");
		fixture.setState(new HashMap());

		List<ZkPath> result = fixture.getChildren();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Date getDirCreateTime() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:11
	 */
	@Test
	public void testGetDirCreateTime_1()
		throws Exception {
		ZkPath fixture = new ZkPath();
		fixture.setType("");
		fixture.setDirType(new Integer(1));
		fixture.setChildren(new LinkedList());
		fixture.setDirState("");
		fixture.setId(1);
		fixture.setpId(1);
		fixture.setText("");
		fixture.setState(new HashMap());

		Date result = fixture.getDirCreateTime();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Date getDirCreateTime() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:11
	 */
	@Test
	public void testGetDirCreateTime_2()
		throws Exception {
		ZkPath fixture = new ZkPath();
		fixture.setType("");
		fixture.setDirType(new Integer(1));
		fixture.setChildren(new LinkedList());
		fixture.setDirState("");
		fixture.setId(1);
		fixture.setpId(1);
		fixture.setText("");
		fixture.setState(new HashMap());

		Date result = fixture.getDirCreateTime();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Date getDirLastestTime() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:11
	 */
	@Test
	public void testGetDirLastestTime_1()
		throws Exception {
		ZkPath fixture = new ZkPath();
		fixture.setType("");
		fixture.setDirType(new Integer(1));
		fixture.setChildren(new LinkedList());
		fixture.setDirState("");
		fixture.setId(1);
		fixture.setpId(1);
		fixture.setText("");
		fixture.setState(new HashMap());

		Date result = fixture.getDirLastestTime();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Date getDirLastestTime() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:11
	 */
	@Test
	public void testGetDirLastestTime_2()
		throws Exception {
		ZkPath fixture = new ZkPath();
		fixture.setType("");
		fixture.setDirType(new Integer(1));
		fixture.setChildren(new LinkedList());
		fixture.setDirState("");
		fixture.setId(1);
		fixture.setpId(1);
		fixture.setText("");
		fixture.setState(new HashMap());

		Date result = fixture.getDirLastestTime();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getDirState() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:11
	 */
	@Test
	public void testGetDirState_1()
		throws Exception {
		ZkPath fixture = new ZkPath();
		fixture.setType("");
		fixture.setDirType(new Integer(1));
		fixture.setChildren(new LinkedList());
		fixture.setDirState("");
		fixture.setId(1);
		fixture.setpId(1);
		fixture.setText("");
		fixture.setState(new HashMap());

		String result = fixture.getDirState();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the Integer getDirType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:11
	 */
	@Test
	public void testGetDirType_1()
		throws Exception {
		ZkPath fixture = new ZkPath();
		fixture.setType("");
		fixture.setDirType(new Integer(1));
		fixture.setChildren(new LinkedList());
		fixture.setDirState("");
		fixture.setId(1);
		fixture.setpId(1);
		fixture.setText("");
		fixture.setState(new HashMap());

		Integer result = fixture.getDirType();

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
	 * Run the int getId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:11
	 */
	@Test
	public void testGetId_1()
		throws Exception {
		ZkPath fixture = new ZkPath();
		fixture.setType("");
		fixture.setDirType(new Integer(1));
		fixture.setChildren(new LinkedList());
		fixture.setDirState("");
		fixture.setId(1);
		fixture.setpId(1);
		fixture.setText("");
		fixture.setState(new HashMap());

		int result = fixture.getId();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the Map<String, Object> getState() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:11
	 */
	@Test
	public void testGetState_1()
		throws Exception {
		ZkPath fixture = new ZkPath();
		fixture.setType("");
		fixture.setDirType(new Integer(1));
		fixture.setChildren(new LinkedList());
		fixture.setDirState("");
		fixture.setId(1);
		fixture.setpId(1);
		fixture.setText("");
		fixture.setState(new HashMap());

		Map<String, Object> result = fixture.getState();

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
		assertEquals(Boolean.TRUE, result.get("opened"));
	}

	/**
	 * Run the String getText() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:11
	 */
	@Test
	public void testGetText_1()
		throws Exception {
		ZkPath fixture = new ZkPath();
		fixture.setType("");
		fixture.setDirType(new Integer(1));
		fixture.setChildren(new LinkedList());
		fixture.setDirState("");
		fixture.setId(1);
		fixture.setpId(1);
		fixture.setText("");
		fixture.setState(new HashMap());

		String result = fixture.getText();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:11
	 */
	@Test
	public void testGetType_1()
		throws Exception {
		ZkPath fixture = new ZkPath();
		fixture.setType("");
		fixture.setDirType(new Integer(1));
		fixture.setChildren(new LinkedList());
		fixture.setDirState("");
		fixture.setId(1);
		fixture.setpId(1);
		fixture.setText("");
		fixture.setState(new HashMap());

		String result = fixture.getType();

		// add additional test code here
		assertEquals("properties directory", result);
	}

	/**
	 * Run the int getpId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:11
	 */
	@Test
	public void testGetpId_1()
		throws Exception {
		ZkPath fixture = new ZkPath();
		fixture.setType("");
		fixture.setDirType(new Integer(1));
		fixture.setChildren(new LinkedList());
		fixture.setDirState("");
		fixture.setId(1);
		fixture.setpId(1);
		fixture.setText("");
		fixture.setState(new HashMap());

		int result = fixture.getpId();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the void setChildren(List<ZkPath>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:11
	 */
	@Test
	public void testSetChildren_1()
		throws Exception {
		ZkPath fixture = new ZkPath();
		fixture.setType("");
		fixture.setDirType(new Integer(1));
		fixture.setChildren(new LinkedList());
		fixture.setDirState("");
		fixture.setId(1);
		fixture.setpId(1);
		fixture.setText("");
		fixture.setState(new HashMap());
		List<ZkPath> children = new LinkedList();

		fixture.setChildren(children);

		// add additional test code here
	}

	/**
	 * Run the void setDirCreateTime(Date) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:11
	 */
	@Test
	public void testSetDirCreateTime_1()
		throws Exception {
		ZkPath fixture = new ZkPath();
		fixture.setType("");
		fixture.setDirType(new Integer(1));
		fixture.setChildren(new LinkedList());
		fixture.setDirState("");
		fixture.setId(1);
		fixture.setpId(1);
		fixture.setText("");
		fixture.setState(new HashMap());
		Date dirCreateTime = null;

		fixture.setDirCreateTime(dirCreateTime);

		// add additional test code here
	}

	/**
	 * Run the void setDirCreateTime(Date) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:11
	 */
	@Test
	public void testSetDirCreateTime_2()
		throws Exception {
		ZkPath fixture = new ZkPath();
		fixture.setType("");
		fixture.setDirType(new Integer(1));
		fixture.setChildren(new LinkedList());
		fixture.setDirState("");
		fixture.setId(1);
		fixture.setpId(1);
		fixture.setText("");
		fixture.setState(new HashMap());
		Date dirCreateTime = new Date();

		fixture.setDirCreateTime(dirCreateTime);

		// add additional test code here
	}

	/**
	 * Run the void setDirLastestTime(Date) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:11
	 */
	@Test
	public void testSetDirLastestTime_1()
		throws Exception {
		ZkPath fixture = new ZkPath();
		fixture.setType("");
		fixture.setDirType(new Integer(1));
		fixture.setChildren(new LinkedList());
		fixture.setDirState("");
		fixture.setId(1);
		fixture.setpId(1);
		fixture.setText("");
		fixture.setState(new HashMap());
		Date dirLastestTime = null;

		fixture.setDirLastestTime(dirLastestTime);

		// add additional test code here
	}

	/**
	 * Run the void setDirLastestTime(Date) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:11
	 */
	@Test
	public void testSetDirLastestTime_2()
		throws Exception {
		ZkPath fixture = new ZkPath();
		fixture.setType("");
		fixture.setDirType(new Integer(1));
		fixture.setChildren(new LinkedList());
		fixture.setDirState("");
		fixture.setId(1);
		fixture.setpId(1);
		fixture.setText("");
		fixture.setState(new HashMap());
		Date dirLastestTime = new Date();

		fixture.setDirLastestTime(dirLastestTime);

		// add additional test code here
	}

	/**
	 * Run the void setDirState(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:11
	 */
	@Test
	public void testSetDirState_1()
		throws Exception {
		ZkPath fixture = new ZkPath();
		fixture.setType("");
		fixture.setDirType(new Integer(1));
		fixture.setChildren(new LinkedList());
		fixture.setDirState("");
		fixture.setId(1);
		fixture.setpId(1);
		fixture.setText("");
		fixture.setState(new HashMap());
		String dirState = "";

		fixture.setDirState(dirState);

		// add additional test code here
	}

	/**
	 * Run the void setDirType(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:11
	 */
	@Test
	public void testSetDirType_1()
		throws Exception {
		ZkPath fixture = new ZkPath();
		fixture.setType("");
		fixture.setDirType(new Integer(2));
		fixture.setChildren(new LinkedList());
		fixture.setDirState("");
		fixture.setId(1);
		fixture.setpId(1);
		fixture.setText("");
		fixture.setState(new HashMap());
		Integer dirType = new Integer(2);

		fixture.setDirType(dirType);

		// add additional test code here
	}

	/**
	 * Run the void setDirType(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:11
	 */
	@Test
	public void testSetDirType_2()
		throws Exception {
		ZkPath fixture = new ZkPath();
		fixture.setType("");
		fixture.setDirType(new Integer(1));
		fixture.setChildren(new LinkedList());
		fixture.setDirState("");
		fixture.setId(1);
		fixture.setpId(1);
		fixture.setText("");
		fixture.setState(new HashMap());
		Integer dirType = new Integer(1);

		fixture.setDirType(dirType);

		// add additional test code here
	}

	/**
	 * Run the void setId(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:11
	 */
	@Test
	public void testSetId_1()
		throws Exception {
		ZkPath fixture = new ZkPath();
		fixture.setType("");
		fixture.setDirType(new Integer(1));
		fixture.setChildren(new LinkedList());
		fixture.setDirState("");
		fixture.setId(1);
		fixture.setpId(1);
		fixture.setText("");
		fixture.setState(new HashMap());
		int id = 1;

		fixture.setId(id);

		// add additional test code here
	}

	/**
	 * Run the void setState(Map<String,Object>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:11
	 */
	@Test
	public void testSetState_1()
		throws Exception {
		ZkPath fixture = new ZkPath();
		fixture.setType("");
		fixture.setDirType(new Integer(1));
		fixture.setChildren(new LinkedList());
		fixture.setDirState("");
		fixture.setId(1);
		fixture.setpId(1);
		fixture.setText("");
		fixture.setState(new HashMap());
		Map<String, Object> state = new HashMap();

		fixture.setState(state);

		// add additional test code here
	}

	/**
	 * Run the void setText(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:11
	 */
	@Test
	public void testSetText_1()
		throws Exception {
		ZkPath fixture = new ZkPath();
		fixture.setType("");
		fixture.setDirType(new Integer(1));
		fixture.setChildren(new LinkedList());
		fixture.setDirState("");
		fixture.setId(1);
		fixture.setpId(1);
		fixture.setText("");
		fixture.setState(new HashMap());
		String text = "";

		fixture.setText(text);

		// add additional test code here
	}

	/**
	 * Run the void setType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:11
	 */
	@Test
	public void testSetType_1()
		throws Exception {
		ZkPath fixture = new ZkPath();
		fixture.setType("");
		fixture.setDirType(new Integer(1));
		fixture.setChildren(new LinkedList());
		fixture.setDirState("");
		fixture.setId(1);
		fixture.setpId(1);
		fixture.setText("");
		fixture.setState(new HashMap());
		String type = "";

		fixture.setType(type);

		// add additional test code here
	}

	/**
	 * Run the void setpId(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:11
	 */
	@Test
	public void testSetpId_1()
		throws Exception {
		ZkPath fixture = new ZkPath();
		fixture.setType("");
		fixture.setDirType(new Integer(1));
		fixture.setChildren(new LinkedList());
		fixture.setDirState("");
		fixture.setId(1);
		fixture.setpId(1);
		fixture.setText("");
		fixture.setState(new HashMap());
		int pId = 1;

		fixture.setpId(pId);

		// add additional test code here
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:11
	 */
	@Test
	public void testToString_1()
		throws Exception {
		ZkPath fixture = new ZkPath();
		fixture.setType("");
		fixture.setDirType(new Integer(1));
		fixture.setChildren(new LinkedList());
		fixture.setDirState("");
		fixture.setId(1);
		fixture.setpId(1);
		fixture.setText("");
		fixture.setState(new HashMap());

		String result = fixture.toString();

		// add additional test code here
		assertEquals("{\"id\":1,\"pId\":1,\"name\":\"\",\"dirType\":1,\"createTime\":\"\",\"state\":\"\",\"modifyTime\":\"\"}", result);
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
		new org.junit.runner.JUnitCore().run(ZkPathTest.class);
	}
}
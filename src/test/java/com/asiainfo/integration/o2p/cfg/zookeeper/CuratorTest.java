package com.asiainfo.integration.o2p.cfg.zookeeper;

import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.util.List;

import org.apache.curator.test.TestingServer;
import org.apache.zookeeper.data.Stat;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * The class <code>CuratorTest</code> contains tests for the class
 * <code>{@link Curator}</code>.
 * 
 * @generatedBy CodePro at 15-11-26 上午11:10
 * @author windy
 * @version $Revision: 1.0 $
 */
public class CuratorTest {
	private static TestingServer server;
	private static Curator fixture;

	@BeforeClass
	public static void setUp() throws Exception {
		server = new TestingServer();
		server.start();
		fixture = new Curator(server.getConnectString(), "cfg");
	}
	
	@Before
	public void before() throws Exception {
		if(fixture.existsZNode("/o2p") == null) {
			fixture.createZNode("/o2p");
		}
	}

	@AfterClass
	public static void tearDown() throws IOException {
		server.stop();
	}

	/**
	 * Run the Curator() constructor test.
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:10
	 */
	@Test
	public void testCurator_1() throws Exception {
		Curator result = new Curator(server.getConnectString(), "cfg");
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the void createZNode(String) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:10
	 */
	@Test
	public void testCreateZNode_1() throws Exception {

		String path = "/o2p";

		if (fixture.existsZNode(path) == null) {
			fixture.createZNode(path);
		}
		assertNotNull(fixture.existsZNode(path));
		// add additional test code here
	}

	/**
	 * Run the void createZNode(String) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:10
	 */
	@Test
	public void testCreateZNode_2() throws Exception {

		String path = "/o2p";

		if (fixture.existsZNode(path) == null) {
			fixture.createZNode(path);
		}

		// add additional test code here
	}

	/**
	 * Run the String createZNode(String,String) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:10
	 */
	@Test
	public void testCreateZNode_3() throws Exception {

		String path = "/o2p";
		String message = "o2p_message";

		String result = null;
		if (fixture.existsZNode(path) == null) {
			result = fixture.createZNode(path, message);
		} else {
			result = (String)fixture.getData(path);
		}

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String createZNode(String,String) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:10
	 */
	@Test
	public void testCreateZNode_4() throws Exception {

		String path = "/o2p";
		String message = "o2p_message";

		String result = null;
		if (fixture.existsZNode(path) == null) {
			result = fixture.createZNode(path, message);
		} else {
			result = (String)fixture.getData(path);
		}

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String createZNode(String,String) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:10
	 */
	@Test
	public void testCreateZNode_5() throws Exception {

		String path = "/o2p";
		String message = "o2p_message";

		String result = null;
		if (fixture.existsZNode(path) == null) {
			result = fixture.createZNode(path, message);
		} else {
			result = (String)fixture.getData(path);
		}

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String createZNode(String,String) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:10
	 */
	@Test
	public void testCreateZNode_6() throws Exception {

		String path = "/o2p";
		String message = "o2p_message";

		String result = null;
		if (fixture.existsZNode(path) == null) {
			result = fixture.createZNode(path, message);
		} else {
			result = (String)fixture.getData(path);
		}

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String createZNode(String,String) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:10
	 */
	@Test
	public void testCreateZNode_7() throws Exception {

		String path = "/o2p";
		String message = "o2p_message";

		String result = null;
		if (fixture.existsZNode(path) == null) {
			result = fixture.createZNode(path, message);
		} else {
			result = (String)fixture.getData(path);
		}

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void deleteZNode(String) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:10
	 */
	@Test
	public void testDeleteZNode_1() throws Exception {

		String path = "/o2p";

		fixture.deleteZNode(path);

		// add additional test code here
	}

	/**
	 * Run the void deleteZNode(String) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:10
	 */
	@Test
	public void testDeleteZNode_2() throws Exception {

		String path = "/o2p";
		if(fixture.existsZNode(path) != null) {
			fixture.deleteZNode(path);
			fixture.createZNode(path);
		}

		// add additional test code here
	}

	/**
	 * Run the void deleteZNode(String) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:10
	 */
	@Test
	public void testDeleteZNode_3() throws Exception {

		String path = "/o2p";

		if(fixture.existsZNode(path) != null) {
			fixture.deleteZNode(path);
			fixture.createZNode(path);
		}

		// add additional test code here
	}

	/**
	 * Run the void deleteZNode(String) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:10
	 */
	@Test
	public void testDeleteZNode_4() throws Exception {

		String path = "/o2p";

		if(fixture.existsZNode(path) != null) {
			fixture.deleteZNode(path);
			fixture.createZNode(path);
		}

		// add additional test code here
	}

	/**
	 * Run the void deleteZNode(String) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:10
	 */
	@Test
	public void testDeleteZNode_5() throws Exception {

		String path = "/o2p";

		if(fixture.existsZNode(path) != null) {
			fixture.deleteZNode(path);
			fixture.createZNode(path);
		}

		// add additional test code here
	}

	/**
	 * Run the void deleteZNode(String) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:10
	 */
	@Test
	public void testDeleteZNode_6() throws Exception {

		String path = "/o2p";

		if(fixture.existsZNode(path) != null) {
			fixture.deleteZNode(path);
			fixture.createZNode(path);
		}

		// add additional test code here
	}

	/**
	 * Run the void deletingChildrenIfNeededZNode(String) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:10
	 */
	@Test
	public void testDeletingChildrenIfNeededZNode_1() throws Exception {

		String path = "/o2p";

		fixture.deletingChildrenIfNeededZNode(path);

		// add additional test code here
	}

	/**
	 * Run the void deletingChildrenIfNeededZNode(String) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:10
	 */
	@Test
	public void testDeletingChildrenIfNeededZNode_2() throws Exception {

		String path = "/o2p";

		fixture.deletingChildrenIfNeededZNode(path);

		// add additional test code here
	}

	/**
	 * Run the void deletingChildrenIfNeededZNode(String) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:10
	 */
	@Test
	public void testDeletingChildrenIfNeededZNode_3() throws Exception {

		String path = "/o2p";

		fixture.deletingChildrenIfNeededZNode(path);

		// add additional test code here
	}

	/**
	 * Run the Stat existsZNode(String) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:10
	 */
	@Test
	public void testExistsZNode_1() throws Exception {

		String path = "/o2p";

		Stat result = fixture.existsZNode(path);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Stat existsZNode(String) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:10
	 */
	@Test
	public void testExistsZNode_2() throws Exception {

		String path = "/o2p";

		Stat result = fixture.existsZNode(path);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the List<String> getChildren(String) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:10
	 */
	@Test
	public void testGetChildren_1() throws Exception {

		String path = "/o2p";

		List<String> result = fixture.getChildren(path);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the List<String> getChildren(String) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:10
	 */
	@Test
	public void testGetChildren_2() throws Exception {

		String path = "/o2p";

		List<String> result = fixture.getChildren(path);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getData(String) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:10
	 */
	@Test
	public void testGetData_1() throws Exception {

		String path = "/o2p";

		Object result = fixture.getData(path);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getData(String) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:10
	 */
	@Test
	public void testGetData_2() throws Exception {

		String path = "/o2p";

		Object result = fixture.getData(path);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getData(String) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:10
	 */
	@Test
	public void testGetData_3() throws Exception {

		String path = "/o2p";

		Object result = fixture.getData(path);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getData(String) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:10
	 */
	@Test
	public void testGetData_4() throws Exception {

		String path = "/o2p";

		Object result = fixture.getData(path);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getData(String) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:10
	 */
	@Test
	public void testGetData_5() throws Exception {

		String path = "/o2p";

		Object result = fixture.getData(path);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getData(String) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:10
	 */
	@Test
	public void testGetData_6() throws Exception {

		String path = "/o2p";

		Object result = fixture.getData(path);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getData(String) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:10
	 */
	@Test
	public void testGetData_7() throws Exception {

		String path = "/o2p";

		Object result = fixture.getData(path);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getData(String) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:10
	 */
	@Test
	public void testGetData_8() throws Exception {

		String path = "/o2p";

		Object result = fixture.getData(path);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getData(String) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:10
	 */
	@Test
	public void testGetData_9() throws Exception {

		String path = "/o2p";

		Object result = fixture.getData(path);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void updateData(String,String) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:10
	 */
	@Test
	public void testUpdateData_1() throws Exception {

		String path = "/o2p";
		String message = null;

		if (fixture.existsZNode(path) != null) {
			fixture.updateData(path, message);
		} else {
			if (fixture.existsZNode(path) == null) {
				fixture.createZNode(path);
			}
		}
		fixture.updateData(path, message);

		// add additional test code here
	}

	/**
	 * Run the void updateData(String,String) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:10
	 */
	@Test
	public void testUpdateData_2() throws Exception {

		String path = "/o2p";
		String message = "o2p_message";

		if (fixture.existsZNode(path) != null) {
			fixture.updateData(path, message);
		} else {
			if (fixture.existsZNode(path) == null) {
				fixture.createZNode(path);
			}
		}
		fixture.updateData(path, message);

		// add additional test code here
	}

	/**
	 * Run the void updateData(String,String) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:10
	 */
	@Test
	public void testUpdateData_3() throws Exception {

		String path = "/o2p";
		String message = "o2p_message";

		if (fixture.existsZNode(path) != null) {
			fixture.updateData(path, message);
		} else {
			if (fixture.existsZNode(path) == null) {
				fixture.createZNode(path);
			}
		}
		fixture.updateData(path, message);

		// add additional test code here
	}

	/**
	 * Run the void updateData(String,String) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:10
	 */
	@Test
	public void testUpdateData_4() throws Exception {

		String path = "/o2p";
		String message = "o2p_message";

		if (fixture.existsZNode(path) != null) {
			fixture.updateData(path, message);
		} else {
			if (fixture.existsZNode(path) == null) {
				fixture.createZNode(path);
			}
		}
		fixture.updateData(path, message);

		// add additional test code here
	}

	/**
	 * Run the void updateData(String,String) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:10
	 */
	@Test
	public void testUpdateData_5() throws Exception {

		String path = "/o2p";
		String message = null;

		if (fixture.existsZNode(path) != null) {
			fixture.updateData(path, message);
		} else {
			if (fixture.existsZNode(path) == null) {
				fixture.createZNode(path);
			}
		}
		fixture.updateData(path, message);

		// add additional test code here
	}

	/**
	 * Run the void updateData(String,String) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:10
	 */
	@Test
	public void testUpdateData_6() throws Exception {

		String path = "/o2p";
		String message = "o2p_message";
		if (fixture.existsZNode(path) != null) {
			fixture.updateData(path, message);
		} else {
			if (fixture.existsZNode(path) == null) {
				fixture.createZNode(path);
			}
		}
		fixture.updateData(path, message);

		// add additional test code here
	}

	/**
	 * Launch the test.
	 * 
	 * @param args
	 *            the command line arguments
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:10
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(CuratorTest.class);
	}
}
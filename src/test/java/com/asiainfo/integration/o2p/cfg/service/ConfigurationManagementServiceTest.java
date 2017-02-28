package com.asiainfo.integration.o2p.cfg.service;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.sql.Connection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.curator.test.TestingServer;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

import com.asiainfo.integration.o2p.cfg.dao.ConfigurationManagementDAO;
import com.asiainfo.integration.o2p.cfg.dto.CfgProperties;
import com.asiainfo.integration.o2p.cfg.dto.OperateProcess;
import com.asiainfo.integration.o2p.cfg.dto.ZkPath;
import com.asiainfo.integration.o2p.cfg.zookeeper.Curator;
import com.ibatis.common.jdbc.ScriptRunner;
import com.ibatis.common.resources.Resources;

/**
 * The class <code>ConfigurationManagementServiceTest</code> contains tests for
 * the class <code>{@link ConfigurationManagementService}</code>.
 * 
 * @generatedBy CodePro at 15-11-26 上午11:12
 * @author windy
 * @version $Revision: 1.0 $
 */
@Configuration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/spring-cfg.xml")
public class ConfigurationManagementServiceTest {
	private static TestingServer server;
	private static Curator curator;
	private static boolean isInit = false;
	@Autowired
	ConfigurationManagementService fixture;
	@Resource(name = "configurationSqlSessionFactory")
	public SqlSessionFactory configurationSqlSessionFactory;

	@BeforeClass
	public static void setUp() throws Exception {
		server = new TestingServer();
		server.start();
		curator = new Curator(server.getConnectString(), "cfg");
	}

	@Before
	public void before() throws Exception {
		if (!isInit) {
			SqlSession session = configurationSqlSessionFactory.openSession();
			Connection conn = session.getConnection();
			Reader reader = Resources.getResourceAsReader("cfg.sql");
			ScriptRunner runner = new ScriptRunner(conn, true, true);
			runner.setLogWriter(null);
			runner.runScript(reader);
			reader.close();
			session.close();
			isInit = true;
		}
		fixture.setCurator(curator);
	}

	@AfterClass
	public static void tearDown() throws IOException {
		server.stop();
	}

	/**
	 * Run the List<Map<String, Object>> checkConfExist(String,int) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testCheckConfExist_1() throws Exception {

		String ids = "";
		int namespaceId = 1;

		List<Map<String, Object>> result = fixture.checkConfExist(ids,
				namespaceId);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<Map<String, Object>> checkConfExist(String,int) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testCheckConfExist_2() throws Exception {

		String ids = "";
		int namespaceId = 1;

		List<Map<String, Object>> result = fixture.checkConfExist(ids,
				namespaceId);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the void
	 * copyOldConfToNewConf(OperateProcess,Map<String,Object>,ZkPath) method
	 * test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testCopyOldConfToNewConf_1() throws Exception {

		OperateProcess operateProcess = new OperateProcess();
		Map<String, Object> param = new HashMap();
		ZkPath zkpath = new ZkPath();
		zkpath.setId(3);
		String[] ids = { "1" };
		param.put("id", ids);

		fixture.copyOldConfToNewConf(operateProcess, param, zkpath);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.NullPointerException
		// at
		// com.asiainfo.integration.o2p.cfg.dao.ConfigurationManagementDAO.getConfById(ConfigurationManagementDAO.java:90)
		// at
		// com.asiainfo.integration.o2p.cfg.service.ConfigurationManagementService.copyOldConfToNewConf(ConfigurationManagementService.java:639)
	}

	/**
	 * Run the void
	 * copyOldConfToNewConf(OperateProcess,Map<String,Object>,ZkPath) method
	 * test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testCopyOldConfToNewConf_2() throws Exception {

		OperateProcess operateProcess = new OperateProcess();
		Map<String, Object> param = new HashMap();
		ZkPath zkpath = new ZkPath();
		zkpath.setId(3);
		String[] ids = { "1" };
		param.put("id", ids);

		fixture.copyOldConfToNewConf(operateProcess, param, zkpath);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.NullPointerException
		// at
		// com.asiainfo.integration.o2p.cfg.dao.ConfigurationManagementDAO.getConfById(ConfigurationManagementDAO.java:90)
		// at
		// com.asiainfo.integration.o2p.cfg.service.ConfigurationManagementService.copyOldConfToNewConf(ConfigurationManagementService.java:639)
	}

	/**
	 * Run the void
	 * copyOldConfToNewConf(OperateProcess,Map<String,Object>,ZkPath) method
	 * test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testCopyOldConfToNewConf_3() throws Exception {

		OperateProcess operateProcess = new OperateProcess();
		Map<String, Object> param = new HashMap();
		ZkPath zkpath = new ZkPath();
		zkpath.setId(3);
		String[] ids = { "1" };
		param.put("id", ids);

		fixture.copyOldConfToNewConf(operateProcess, param, zkpath);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.NullPointerException
		// at
		// com.asiainfo.integration.o2p.cfg.dao.ConfigurationManagementDAO.getConfById(ConfigurationManagementDAO.java:90)
		// at
		// com.asiainfo.integration.o2p.cfg.service.ConfigurationManagementService.copyOldConfToNewConf(ConfigurationManagementService.java:639)
	}

	/**
	 * Run the void
	 * copyOldConfToNewConf(OperateProcess,Map<String,Object>,ZkPath) method
	 * test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testCopyOldConfToNewConf_4() throws Exception {

		OperateProcess operateProcess = new OperateProcess();
		Map<String, Object> param = new HashMap();
		ZkPath zkpath = new ZkPath();
		zkpath.setId(3);
		String[] ids = { "1" };
		param.put("id", ids);

		fixture.copyOldConfToNewConf(operateProcess, param, zkpath);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.NullPointerException
		// at
		// com.asiainfo.integration.o2p.cfg.dao.ConfigurationManagementDAO.getConfById(ConfigurationManagementDAO.java:90)
		// at
		// com.asiainfo.integration.o2p.cfg.service.ConfigurationManagementService.copyOldConfToNewConf(ConfigurationManagementService.java:639)
	}

	/**
	 * Run the void
	 * copyOldConfToNewConf(OperateProcess,Map<String,Object>,ZkPath) method
	 * test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testCopyOldConfToNewConf_5() throws Exception {

		OperateProcess operateProcess = new OperateProcess();
		Map<String, Object> param = new HashMap();
		ZkPath zkpath = new ZkPath();
		zkpath.setId(3);
		String[] ids = { "1" };
		param.put("id", ids);

		fixture.copyOldConfToNewConf(operateProcess, param, zkpath);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.NullPointerException
		// at
		// com.asiainfo.integration.o2p.cfg.dao.ConfigurationManagementDAO.getConfById(ConfigurationManagementDAO.java:90)
		// at
		// com.asiainfo.integration.o2p.cfg.service.ConfigurationManagementService.copyOldConfToNewConf(ConfigurationManagementService.java:639)
	}

	/**
	 * Run the void
	 * copyOldConfToNewConf(OperateProcess,Map<String,Object>,ZkPath) method
	 * test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testCopyOldConfToNewConf_6() throws Exception {

		OperateProcess operateProcess = new OperateProcess();
		Map<String, Object> param = new HashMap();
		ZkPath zkpath = new ZkPath();
		zkpath.setId(3);
		String[] ids = { "1" };
		param.put("id", ids);

		fixture.copyOldConfToNewConf(operateProcess, param, zkpath);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.NullPointerException
		// at
		// com.asiainfo.integration.o2p.cfg.dao.ConfigurationManagementDAO.getConfById(ConfigurationManagementDAO.java:90)
		// at
		// com.asiainfo.integration.o2p.cfg.service.ConfigurationManagementService.copyOldConfToNewConf(ConfigurationManagementService.java:639)
	}

	/**
	 * Run the void
	 * copyOldConfToNewConf(OperateProcess,Map<String,Object>,ZkPath) method
	 * test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testCopyOldConfToNewConf_7() throws Exception {

		OperateProcess operateProcess = new OperateProcess();
		Map<String, Object> param = new HashMap();
		ZkPath zkpath = new ZkPath();
		zkpath.setId(3);
		String[] ids = { "1" };
		param.put("id", ids);

		fixture.copyOldConfToNewConf(operateProcess, param, zkpath);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.NullPointerException
		// at
		// com.asiainfo.integration.o2p.cfg.dao.ConfigurationManagementDAO.getConfById(ConfigurationManagementDAO.java:90)
		// at
		// com.asiainfo.integration.o2p.cfg.service.ConfigurationManagementService.copyOldConfToNewConf(ConfigurationManagementService.java:639)
	}

	/**
	 * Run the void
	 * copyOldConfToNewConf(OperateProcess,Map<String,Object>,ZkPath) method
	 * test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testCopyOldConfToNewConf_8() throws Exception {

		OperateProcess operateProcess = new OperateProcess();
		Map<String, Object> param = new HashMap();
		ZkPath zkpath = new ZkPath();
		zkpath.setId(3);
		String[] ids = { "1" };
		param.put("id", ids);

		fixture.copyOldConfToNewConf(operateProcess, param, zkpath);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.NullPointerException
		// at
		// com.asiainfo.integration.o2p.cfg.dao.ConfigurationManagementDAO.getConfById(ConfigurationManagementDAO.java:90)
		// at
		// com.asiainfo.integration.o2p.cfg.service.ConfigurationManagementService.copyOldConfToNewConf(ConfigurationManagementService.java:639)
	}

	/**
	 * Run the void
	 * copyOldConfToNewConf(OperateProcess,Map<String,Object>,ZkPath) method
	 * test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testCopyOldConfToNewConf_9() throws Exception {

		OperateProcess operateProcess = new OperateProcess();
		Map<String, Object> param = new HashMap();
		ZkPath zkpath = new ZkPath();
		zkpath.setId(3);
		String[] ids = { "1" };
		param.put("id", ids);

		fixture.copyOldConfToNewConf(operateProcess, param, zkpath);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.NullPointerException
		// at
		// com.asiainfo.integration.o2p.cfg.dao.ConfigurationManagementDAO.getConfById(ConfigurationManagementDAO.java:90)
		// at
		// com.asiainfo.integration.o2p.cfg.service.ConfigurationManagementService.copyOldConfToNewConf(ConfigurationManagementService.java:639)
	}

	/**
	 * Run the void
	 * copyOldConfToNewConf(OperateProcess,Map<String,Object>,ZkPath) method
	 * test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testCopyOldConfToNewConf_10() throws Exception {

		OperateProcess operateProcess = new OperateProcess();
		Map<String, Object> param = new HashMap();
		ZkPath zkpath = new ZkPath();
		zkpath.setId(3);
		String[] ids = { "1" };
		param.put("id", ids);

		fixture.copyOldConfToNewConf(operateProcess, param, zkpath);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.NullPointerException
		// at
		// com.asiainfo.integration.o2p.cfg.dao.ConfigurationManagementDAO.getConfById(ConfigurationManagementDAO.java:90)
		// at
		// com.asiainfo.integration.o2p.cfg.service.ConfigurationManagementService.copyOldConfToNewConf(ConfigurationManagementService.java:639)
	}

	/**
	 * Run the void
	 * copyOldConfToNewConf(OperateProcess,Map<String,Object>,ZkPath) method
	 * test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testCopyOldConfToNewConf_11() throws Exception {

		OperateProcess operateProcess = new OperateProcess();
		Map<String, Object> param = new HashMap();
		ZkPath zkpath = new ZkPath();
		zkpath.setId(3);
		String[] ids = { "1" };
		param.put("id", ids);

		fixture.copyOldConfToNewConf(operateProcess, param, zkpath);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.NullPointerException
		// at
		// com.asiainfo.integration.o2p.cfg.dao.ConfigurationManagementDAO.getConfById(ConfigurationManagementDAO.java:90)
		// at
		// com.asiainfo.integration.o2p.cfg.service.ConfigurationManagementService.copyOldConfToNewConf(ConfigurationManagementService.java:639)
	}

	/**
	 * Run the void
	 * copyOldConfToNewConf(OperateProcess,Map<String,Object>,ZkPath) method
	 * test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testCopyOldConfToNewConf_12() throws Exception {

		OperateProcess operateProcess = new OperateProcess();
		Map<String, Object> param = new HashMap();
		ZkPath zkpath = new ZkPath();
		zkpath.setId(3);
		String[] ids = { "1" };
		param.put("id", ids);

		fixture.copyOldConfToNewConf(operateProcess, param, zkpath);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.NullPointerException
		// at
		// com.asiainfo.integration.o2p.cfg.dao.ConfigurationManagementDAO.getConfById(ConfigurationManagementDAO.java:90)
		// at
		// com.asiainfo.integration.o2p.cfg.service.ConfigurationManagementService.copyOldConfToNewConf(ConfigurationManagementService.java:639)
	}

	/**
	 * Run the void
	 * copyOldConfToNewConf(OperateProcess,Map<String,Object>,ZkPath) method
	 * test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testCopyOldConfToNewConf_13() throws Exception {

		OperateProcess operateProcess = new OperateProcess();
		Map<String, Object> param = new HashMap();
		ZkPath zkpath = new ZkPath();
		zkpath.setId(3);
		String[] ids = { "1" };
		param.put("id", ids);

		fixture.copyOldConfToNewConf(operateProcess, param, zkpath);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.NullPointerException
		// at
		// com.asiainfo.integration.o2p.cfg.dao.ConfigurationManagementDAO.getConfById(ConfigurationManagementDAO.java:90)
		// at
		// com.asiainfo.integration.o2p.cfg.service.ConfigurationManagementService.copyOldConfToNewConf(ConfigurationManagementService.java:639)
	}

	/**
	 * Run the void
	 * copyOldConfToNewConf(OperateProcess,Map<String,Object>,ZkPath) method
	 * test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testCopyOldConfToNewConf_14() throws Exception {

		OperateProcess operateProcess = new OperateProcess();
		Map<String, Object> param = new HashMap();
		ZkPath zkpath = new ZkPath();
		zkpath.setId(3);
		String[] ids = { "1" };
		param.put("id", ids);

		fixture.copyOldConfToNewConf(operateProcess, param, zkpath);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.NullPointerException
		// at
		// com.asiainfo.integration.o2p.cfg.dao.ConfigurationManagementDAO.getConfById(ConfigurationManagementDAO.java:90)
		// at
		// com.asiainfo.integration.o2p.cfg.service.ConfigurationManagementService.copyOldConfToNewConf(ConfigurationManagementService.java:639)
	}

	/**
	 * Run the void
	 * copyOldConfToNewConf(OperateProcess,Map<String,Object>,ZkPath) method
	 * test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testCopyOldConfToNewConf_15() throws Exception {

		OperateProcess operateProcess = new OperateProcess();
		Map<String, Object> param = new HashMap();
		ZkPath zkpath = new ZkPath();
		zkpath.setId(3);
		String[] ids = { "1" };
		param.put("id", ids);

		fixture.copyOldConfToNewConf(operateProcess, param, zkpath);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.NullPointerException
		// at
		// com.asiainfo.integration.o2p.cfg.dao.ConfigurationManagementDAO.getConfById(ConfigurationManagementDAO.java:90)
		// at
		// com.asiainfo.integration.o2p.cfg.service.ConfigurationManagementService.copyOldConfToNewConf(ConfigurationManagementService.java:639)
	}

	/**
	 * Run the void
	 * copyOldConfToNewConf(OperateProcess,Map<String,Object>,ZkPath) method
	 * test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testCopyOldConfToNewConf_16() throws Exception {

		OperateProcess operateProcess = new OperateProcess();
		Map<String, Object> param = new HashMap();
		ZkPath zkpath = new ZkPath();
		zkpath.setId(3);
		String[] ids = { "1" };
		param.put("id", ids);

		fixture.copyOldConfToNewConf(operateProcess, param, zkpath);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.NullPointerException
		// at
		// com.asiainfo.integration.o2p.cfg.dao.ConfigurationManagementDAO.getConfById(ConfigurationManagementDAO.java:90)
		// at
		// com.asiainfo.integration.o2p.cfg.service.ConfigurationManagementService.copyOldConfToNewConf(ConfigurationManagementService.java:639)
	}

	/**
	 * Run the String createProp(OperateProcess,ConfProperties) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testCreateProp_1() throws Exception {

		OperateProcess operateProcess = new OperateProcess();
		CfgProperties addCp = new CfgProperties();
		addCp.setKey("o2pkey");
		addCp.setDirId(new Integer(1));

		String result = fixture.createProp(operateProcess, addCp);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// <exception><code>9504</code><msg>命名空间创建或更新异常,原因：{0}
		// StackTrace:java.lang.NullPointerException
		// at
		// com.asiainfo.integration.o2p.cfg.dao.ConfigurationManagementDAO.getZkPath(ConfigurationManagementDAO.java:154)
		// at
		// com.asiainfo.integration.o2p.cfg.service.ConfigurationManagementService.getPathByZKPathId(ConfigurationManagementService.java:433)
		// at
		// com.asiainfo.integration.o2p.cfg.service.ConfigurationManagementService.createProp(ConfigurationManagementService.java:521)
		assertNull(result);
	}

	/**
	 * Run the String createProp(OperateProcess,ConfProperties) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testCreateProp_2() throws Exception {

		OperateProcess operateProcess = new OperateProcess();
		operateProcess.setOperatorObjList(new LinkedList());
		CfgProperties addCp = new CfgProperties();
		addCp.setDescription("");
		addCp.setKey("o2pkey");
		addCp.setProConstraint("");
		addCp.setProDataType("");
		addCp.setGroup("");
		addCp.setDirId(new Integer(1));
		addCp.setLock(1);
		addCp.setValue("o2pvalue");

		String result = fixture.createProp(operateProcess, addCp);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// <exception><code>9504</code><msg>命名空间创建或更新异常,原因：{0}
		// StackTrace:java.lang.NullPointerException
		// at
		// com.asiainfo.integration.o2p.cfg.dao.ConfigurationManagementDAO.getZkPath(ConfigurationManagementDAO.java:154)
		// at
		// com.asiainfo.integration.o2p.cfg.service.ConfigurationManagementService.getPathByZKPathId(ConfigurationManagementService.java:433)
		// at
		// com.asiainfo.integration.o2p.cfg.service.ConfigurationManagementService.createProp(ConfigurationManagementService.java:521)
		assertNotNull(result);
	}

	/**
	 * Run the String createProp(OperateProcess,ConfProperties) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testCreateProp_3() throws Exception {

		OperateProcess operateProcess = null;
		CfgProperties addCp = new CfgProperties();
		addCp.setDescription("");
		addCp.setKey("o2pkey");
		addCp.setProConstraint("");
		addCp.setProDataType("");
		addCp.setGroup("");
		addCp.setDirId(new Integer(1));
		addCp.setLock(1);
		addCp.setValue("o2pvalue");

		String result = fixture.createProp(operateProcess, addCp);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// <exception><code>9504</code><msg>命名空间创建或更新异常,原因：{0}
		// StackTrace:java.lang.NullPointerException
		// at
		// com.asiainfo.integration.o2p.cfg.dao.ConfigurationManagementDAO.getZkPath(ConfigurationManagementDAO.java:154)
		// at
		// com.asiainfo.integration.o2p.cfg.service.ConfigurationManagementService.getPathByZKPathId(ConfigurationManagementService.java:433)
		// at
		// com.asiainfo.integration.o2p.cfg.service.ConfigurationManagementService.createProp(ConfigurationManagementService.java:521)
		assertNotNull(result);
	}

	/**
	 * Run the String createProp(OperateProcess,ConfProperties) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testCreateProp_4() throws Exception {

		OperateProcess operateProcess = null;
		CfgProperties addCp = new CfgProperties();
		addCp.setDescription("");
		addCp.setKey("o2pkey");
		addCp.setProConstraint("");
		addCp.setProDataType("");
		addCp.setGroup("");
		addCp.setDirId(new Integer(1));
		addCp.setLock(1);
		addCp.setValue("o2pvalue");

		String result = fixture.createProp(operateProcess, addCp);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// <exception><code>9504</code><msg>命名空间创建或更新异常,原因：{0}
		// StackTrace:java.lang.NullPointerException
		// at
		// com.asiainfo.integration.o2p.cfg.dao.ConfigurationManagementDAO.getZkPath(ConfigurationManagementDAO.java:154)
		// at
		// com.asiainfo.integration.o2p.cfg.service.ConfigurationManagementService.getPathByZKPathId(ConfigurationManagementService.java:433)
		// at
		// com.asiainfo.integration.o2p.cfg.service.ConfigurationManagementService.createProp(ConfigurationManagementService.java:521)
		assertNotNull(result);
	}

	/**
	 * Run the void createZkPath(OperateProcess,Integer,String,String) method
	 * test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testCreateZkPath_1() throws Exception {

		OperateProcess operateProcess = new OperateProcess();
		operateProcess.setOperatorObjList(new LinkedList());
		Integer parentId = new Integer(1);
		String dirType = "1";
		String dirName = "a";

		fixture.createZkPath(operateProcess, parentId, dirType, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// <exception><code>9504</code><msg>命名空间创建或更新异常,原因：{0}
		// StackTrace:java.lang.NullPointerException
		// at
		// com.asiainfo.integration.o2p.cfg.dao.ConfigurationManagementDAO.getZkPath(ConfigurationManagementDAO.java:137)
		// at
		// com.asiainfo.integration.o2p.cfg.service.ConfigurationManagementService.createZkPath(ConfigurationManagementService.java:454)
	}

	/**
	 * Run the void createZkPath(OperateProcess,Integer,String,String) method
	 * test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testCreateZkPath_2() throws Exception {

		OperateProcess operateProcess = new OperateProcess();
		operateProcess.setOperatorObjList(new LinkedList());
		Integer parentId = new Integer(1);
		String dirType = "1";
		String dirName = "a";

		fixture.createZkPath(operateProcess, parentId, dirType, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// <exception><code>9504</code><msg>命名空间创建或更新异常,原因：{0}
		// StackTrace:java.lang.NullPointerException
		// at
		// com.asiainfo.integration.o2p.cfg.dao.ConfigurationManagementDAO.getZkPath(ConfigurationManagementDAO.java:137)
		// at
		// com.asiainfo.integration.o2p.cfg.service.ConfigurationManagementService.createZkPath(ConfigurationManagementService.java:454)
	}

	/**
	 * Run the void createZkPath(OperateProcess,Integer,String,String) method
	 * test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testCreateZkPath_3() throws Exception {

		OperateProcess operateProcess = new OperateProcess();
		operateProcess.setOperatorObjList(new LinkedList());
		Integer parentId = new Integer(1);
		String dirType = "1";
		String dirName = "a";

		fixture.createZkPath(operateProcess, parentId, dirType, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// <exception><code>9504</code><msg>命名空间创建或更新异常,原因：{0}
		// StackTrace:java.lang.NullPointerException
		// at
		// com.asiainfo.integration.o2p.cfg.dao.ConfigurationManagementDAO.getZkPath(ConfigurationManagementDAO.java:137)
		// at
		// com.asiainfo.integration.o2p.cfg.service.ConfigurationManagementService.createZkPath(ConfigurationManagementService.java:454)
	}

	/**
	 * Run the void createZkPath(OperateProcess,Integer,String,String) method
	 * test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testCreateZkPath_4() throws Exception {

		OperateProcess operateProcess = new OperateProcess();
		operateProcess.setOperatorObjList(new LinkedList());
		Integer parentId = new Integer(1);
		String dirType = "1";
		String dirName = "a";

		fixture.createZkPath(operateProcess, parentId, dirType, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// <exception><code>9504</code><msg>命名空间创建或更新异常,原因：{0}
		// StackTrace:java.lang.NullPointerException
		// at
		// com.asiainfo.integration.o2p.cfg.dao.ConfigurationManagementDAO.getZkPath(ConfigurationManagementDAO.java:137)
		// at
		// com.asiainfo.integration.o2p.cfg.service.ConfigurationManagementService.createZkPath(ConfigurationManagementService.java:454)
	}

	/**
	 * Run the void createZkPath(OperateProcess,Integer,String,String) method
	 * test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testCreateZkPath_5() throws Exception {

		OperateProcess operateProcess = new OperateProcess();
		operateProcess.setOperatorObjList(new LinkedList());
		Integer parentId = new Integer(1);
		String dirType = "1";
		String dirName = "a";

		fixture.createZkPath(operateProcess, parentId, dirType, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// <exception><code>9504</code><msg>命名空间创建或更新异常,原因：{0}
		// StackTrace:java.lang.NullPointerException
		// at
		// com.asiainfo.integration.o2p.cfg.dao.ConfigurationManagementDAO.getZkPath(ConfigurationManagementDAO.java:137)
		// at
		// com.asiainfo.integration.o2p.cfg.service.ConfigurationManagementService.createZkPath(ConfigurationManagementService.java:454)
	}

	/**
	 * Run the void createZkPath(OperateProcess,Integer,String,String) method
	 * test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testCreateZkPath_6() throws Exception {

		OperateProcess operateProcess = new OperateProcess();
		operateProcess.setOperatorObjList(new LinkedList());
		Integer parentId = new Integer(1);
		String dirType = "1";
		String dirName = "a";

		fixture.createZkPath(operateProcess, parentId, dirType, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// <exception><code>9504</code><msg>命名空间创建或更新异常,原因：{0}
		// StackTrace:java.lang.NullPointerException
		// at
		// com.asiainfo.integration.o2p.cfg.dao.ConfigurationManagementDAO.getZkPath(ConfigurationManagementDAO.java:137)
		// at
		// com.asiainfo.integration.o2p.cfg.service.ConfigurationManagementService.createZkPath(ConfigurationManagementService.java:454)
	}

	/**
	 * Run the void createZkPath(OperateProcess,Integer,String,String) method
	 * test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testCreateZkPath_7() throws Exception {

		OperateProcess operateProcess = null;
		Integer parentId = new Integer(1);
		String dirType = "1";
		String dirName = "a";

		fixture.createZkPath(operateProcess, parentId, dirType, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// <exception><code>9504</code><msg>命名空间创建或更新异常,原因：{0}
		// StackTrace:java.lang.NullPointerException
		// at
		// com.asiainfo.integration.o2p.cfg.dao.ConfigurationManagementDAO.getZkPath(ConfigurationManagementDAO.java:137)
		// at
		// com.asiainfo.integration.o2p.cfg.service.ConfigurationManagementService.createZkPath(ConfigurationManagementService.java:454)
	}

	/**
	 * Run the void createZkPath(OperateProcess,Integer,String,String) method
	 * test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testCreateZkPath_8() throws Exception {

		OperateProcess operateProcess = null;
		Integer parentId = new Integer(1);
		String dirType = "1";
		String dirName = "a";

		fixture.createZkPath(operateProcess, parentId, dirType, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// <exception><code>9504</code><msg>命名空间创建或更新异常,原因：{0}
		// StackTrace:java.lang.NullPointerException
		// at
		// com.asiainfo.integration.o2p.cfg.dao.ConfigurationManagementDAO.getZkPath(ConfigurationManagementDAO.java:137)
		// at
		// com.asiainfo.integration.o2p.cfg.service.ConfigurationManagementService.createZkPath(ConfigurationManagementService.java:454)
	}

	/**
	 * Run the void createZkPath(OperateProcess,Integer,String,String) method
	 * test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testCreateZkPath_9() throws Exception {

		OperateProcess operateProcess = null;
		Integer parentId = new Integer(1);
		String dirType = "1";
		String dirName = "a";

		fixture.createZkPath(operateProcess, parentId, dirType, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// <exception><code>9504</code><msg>命名空间创建或更新异常,原因：{0}
		// StackTrace:java.lang.NullPointerException
		// at
		// com.asiainfo.integration.o2p.cfg.dao.ConfigurationManagementDAO.getZkPath(ConfigurationManagementDAO.java:137)
		// at
		// com.asiainfo.integration.o2p.cfg.service.ConfigurationManagementService.createZkPath(ConfigurationManagementService.java:454)
	}

	/**
	 * Run the void createZkPath(OperateProcess,Integer,String,String) method
	 * test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testCreateZkPath_10() throws Exception {

		OperateProcess operateProcess = null;
		Integer parentId = new Integer(1);
		String dirType = "1";
		String dirName = "a";

		fixture.createZkPath(operateProcess, parentId, dirType, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// <exception><code>9504</code><msg>命名空间创建或更新异常,原因：{0}
		// StackTrace:java.lang.NullPointerException
		// at
		// com.asiainfo.integration.o2p.cfg.dao.ConfigurationManagementDAO.getZkPath(ConfigurationManagementDAO.java:137)
		// at
		// com.asiainfo.integration.o2p.cfg.service.ConfigurationManagementService.createZkPath(ConfigurationManagementService.java:454)
	}

	/**
	 * Run the void deleteConf(OperateProcess,String) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testDeleteConf_1() throws Exception {

		OperateProcess operateProcess = new OperateProcess();
		String id = "1";

		fixture.deleteConf(operateProcess, id);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// <exception><code>9504</code><msg>命名空间创建或更新异常,原因：{0}
		// StackTrace:java.lang.NullPointerException
		// at
		// com.asiainfo.integration.o2p.cfg.dao.ConfigurationManagementDAO.getConfById(ConfigurationManagementDAO.java:90)
		// at
		// com.asiainfo.integration.o2p.cfg.service.ConfigurationManagementService.deleteConf(ConfigurationManagementService.java:368)
	}

	/**
	 * Run the void deleteConf(OperateProcess,String) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testDeleteConf_2() throws Exception {

		OperateProcess operateProcess = new OperateProcess();
		operateProcess.setOperatorObjList(new LinkedList());
		String id = "1";

		fixture.deleteConf(operateProcess, id);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// <exception><code>9504</code><msg>命名空间创建或更新异常,原因：{0}
		// StackTrace:java.lang.NullPointerException
		// at
		// com.asiainfo.integration.o2p.cfg.dao.ConfigurationManagementDAO.getConfById(ConfigurationManagementDAO.java:90)
		// at
		// com.asiainfo.integration.o2p.cfg.service.ConfigurationManagementService.deleteConf(ConfigurationManagementService.java:368)
	}

	/**
	 * Run the void deleteConf(OperateProcess,String) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testDeleteConf_3() throws Exception {

		OperateProcess operateProcess = new OperateProcess();
		operateProcess.setOperatorObjList(new LinkedList());
		String id = "1";

		fixture.deleteConf(operateProcess, id);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// <exception><code>9504</code><msg>命名空间创建或更新异常,原因：{0}
		// StackTrace:java.lang.NullPointerException
		// at
		// com.asiainfo.integration.o2p.cfg.dao.ConfigurationManagementDAO.getConfById(ConfigurationManagementDAO.java:90)
		// at
		// com.asiainfo.integration.o2p.cfg.service.ConfigurationManagementService.deleteConf(ConfigurationManagementService.java:368)
	}

	/**
	 * Run the void deleteConf(OperateProcess,String) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testDeleteConf_4() throws Exception {

		OperateProcess operateProcess = new OperateProcess();
		String id = "1";

		fixture.deleteConf(operateProcess, id);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// <exception><code>9504</code><msg>命名空间创建或更新异常,原因：{0}
		// StackTrace:java.lang.NullPointerException
		// at
		// com.asiainfo.integration.o2p.cfg.dao.ConfigurationManagementDAO.getConfById(ConfigurationManagementDAO.java:90)
		// at
		// com.asiainfo.integration.o2p.cfg.service.ConfigurationManagementService.deleteConf(ConfigurationManagementService.java:368)
	}

	/**
	 * Run the void deleteConf(OperateProcess,String) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testDeleteConf_5() throws Exception {

		OperateProcess operateProcess = new OperateProcess();
		String id = "1";

		fixture.deleteConf(operateProcess, id);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// <exception><code>9504</code><msg>命名空间创建或更新异常,原因：{0}
		// StackTrace:java.lang.NullPointerException
		// at
		// com.asiainfo.integration.o2p.cfg.dao.ConfigurationManagementDAO.getConfById(ConfigurationManagementDAO.java:90)
		// at
		// com.asiainfo.integration.o2p.cfg.service.ConfigurationManagementService.deleteConf(ConfigurationManagementService.java:368)
	}

	/**
	 * Run the void deleteZkpath(OperateProcess,String) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testDeleteZkpath_1() throws Exception {

		OperateProcess operateProcess = new OperateProcess();
		String id = "4";

		fixture.deleteZkpath(operateProcess, id);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// <exception><code>9507</code><msg>命名空间删除异常
		// StackTrace:java.lang.NumberFormatException: For input string: ""
		// at java.lang.NumberFormatException.forInputString(Unknown Source)
		// at java.lang.Integer.parseInt(Unknown Source)
		// at java.lang.Integer.valueOf(Unknown Source)
		// at
		// com.asiainfo.integration.o2p.cfg.service.ConfigurationManagementService.deleteZkpath(ConfigurationManagementService.java:399)
	}

	/**
	 * Run the void deleteZkpath(OperateProcess,String) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testDeleteZkpath_2() throws Exception {

		OperateProcess operateProcess = new OperateProcess();
		String id = "4";

		fixture.deleteZkpath(operateProcess, id);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// <exception><code>9507</code><msg>命名空间删除异常
		// StackTrace:java.lang.NumberFormatException: For input string: ""
		// at java.lang.NumberFormatException.forInputString(Unknown Source)
		// at java.lang.Integer.parseInt(Unknown Source)
		// at java.lang.Integer.valueOf(Unknown Source)
		// at
		// com.asiainfo.integration.o2p.cfg.service.ConfigurationManagementService.deleteZkpath(ConfigurationManagementService.java:399)
	}

	/**
	 * Run the void deleteZkpath(OperateProcess,String) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testDeleteZkpath_3() throws Exception {

		OperateProcess operateProcess = new OperateProcess();
		String id = "4";

		fixture.deleteZkpath(operateProcess, id);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// <exception><code>9507</code><msg>命名空间删除异常
		// StackTrace:java.lang.NumberFormatException: For input string: ""
		// at java.lang.NumberFormatException.forInputString(Unknown Source)
		// at java.lang.Integer.parseInt(Unknown Source)
		// at java.lang.Integer.valueOf(Unknown Source)
		// at
		// com.asiainfo.integration.o2p.cfg.service.ConfigurationManagementService.deleteZkpath(ConfigurationManagementService.java:399)
	}

	/**
	 * Run the List<ConfProperties> getConf(Map<String,Object>) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testGetConf_1() throws Exception {

		Map<String, Object> param = new HashMap();

		List<CfgProperties> result = fixture.getConf(param);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.NullPointerException
		// at
		// com.asiainfo.integration.o2p.cfg.dao.ConfigurationManagementDAO.getConf(ConfigurationManagementDAO.java:84)
		// at
		// com.asiainfo.integration.o2p.cfg.service.ConfigurationManagementService.getConf(ConfigurationManagementService.java:748)
		assertNotNull(result);
	}

	/**
	 * Run the List<ConfProperties> getConf(String,String) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testGetConf_2() throws Exception {

		String path = "";
		String proKey = "";

		List<CfgProperties> result = fixture.getConf(path, proKey);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.NullPointerException
		// at
		// com.asiainfo.integration.o2p.cfg.dao.ConfigurationManagementDAO.getConf(ConfigurationManagementDAO.java:78)
		// at
		// com.asiainfo.integration.o2p.cfg.service.ConfigurationManagementService.getConf(ConfigurationManagementService.java:736)
		assertNotNull(result);
	}

	/**
	 * Run the List<ConfProperties> getConf(String,String) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testGetConf_3() throws Exception {

		String path = "";
		String proKey = "";

		List<CfgProperties> result = fixture.getConf(path, proKey);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.NullPointerException
		// at
		// com.asiainfo.integration.o2p.cfg.dao.ConfigurationManagementDAO.getConf(ConfigurationManagementDAO.java:78)
		// at
		// com.asiainfo.integration.o2p.cfg.service.ConfigurationManagementService.getConf(ConfigurationManagementService.java:736)
		assertNotNull(result);
	}

	/**
	 * Run the List<ConfProperties> getConfById(Map<String,Object>) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testGetConfById_1() throws Exception {

		Map<String, Object> param = new HashMap();

		List<CfgProperties> result = fixture.getConfById(param);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.NullPointerException
		// at
		// com.asiainfo.integration.o2p.cfg.dao.ConfigurationManagementDAO.getConfById(ConfigurationManagementDAO.java:90)
		// at
		// com.asiainfo.integration.o2p.cfg.service.ConfigurationManagementService.getConfById(ConfigurationManagementService.java:740)
		assertNotNull(result);
	}

	/**
	 * Run the Curator getCurator() method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testGetCurator_1() throws Exception {

		Curator result = fixture.getCurator();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the List<ZkPath> getParentZkPathById(Map<String,Object>) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testGetParentZkPathById_1() throws Exception {

		Map<String, Object> param = new HashMap();

		List<ZkPath> result = fixture.getParentZkPathById(param);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.NullPointerException
		// at
		// com.asiainfo.integration.o2p.cfg.dao.ConfigurationManagementDAO.getParentZkPathById(ConfigurationManagementDAO.java:149)
		// at
		// com.asiainfo.integration.o2p.cfg.service.ConfigurationManagementService.getParentZkPathById(ConfigurationManagementService.java:756)
		assertNotNull(result);
	}

	/**
	 * Run the String getPathByZKPathId(Integer) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testGetPathByZKPathId_1() throws Exception {

		Integer id = new Integer(1);

		String result = fixture.getPathByZKPathId(id);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.NullPointerException
		// at
		// com.asiainfo.integration.o2p.cfg.dao.ConfigurationManagementDAO.getZkPath(ConfigurationManagementDAO.java:154)
		// at
		// com.asiainfo.integration.o2p.cfg.service.ConfigurationManagementService.getPathByZKPathId(ConfigurationManagementService.java:433)
		assertNotNull(result);
	}

	/**
	 * Run the String getPathByZKPathId(Integer) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testGetPathByZKPathId_2() throws Exception {

		Integer id = new Integer(1);

		String result = fixture.getPathByZKPathId(id);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.NullPointerException
		// at
		// com.asiainfo.integration.o2p.cfg.dao.ConfigurationManagementDAO.getZkPath(ConfigurationManagementDAO.java:154)
		// at
		// com.asiainfo.integration.o2p.cfg.service.ConfigurationManagementService.getPathByZKPathId(ConfigurationManagementService.java:433)
		assertNotNull(result);
	}

	/**
	 * Run the String getPathByZKPathId(Integer) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testGetPathByZKPathId_3() throws Exception {

		Integer id = new Integer(1);

		String result = fixture.getPathByZKPathId(id);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.NullPointerException
		// at
		// com.asiainfo.integration.o2p.cfg.dao.ConfigurationManagementDAO.getZkPath(ConfigurationManagementDAO.java:154)
		// at
		// com.asiainfo.integration.o2p.cfg.service.ConfigurationManagementService.getPathByZKPathId(ConfigurationManagementService.java:433)
		assertNotNull(result);
	}

	/**
	 * Run the List<ZkPath> getZkPath() method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testGetZkPath_1() throws Exception {

		List<ZkPath> result = fixture.getZkPath();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.NullPointerException
		// at
		// com.asiainfo.integration.o2p.cfg.dao.ConfigurationManagementDAO.getZkPath(ConfigurationManagementDAO.java:132)
		// at
		// com.asiainfo.integration.o2p.cfg.service.ConfigurationManagementService.getZkPath(ConfigurationManagementService.java:744)
		assertNotNull(result);
	}

	/**
	 * Run the List<ZkPath> getZkPathById(Map<String,Object>) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testGetZkPathById_1() throws Exception {

		Map<String, Object> param = new HashMap();

		List<ZkPath> result = fixture.getZkPathById(param);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.NullPointerException
		// at
		// com.asiainfo.integration.o2p.cfg.dao.ConfigurationManagementDAO.getZkPathById(ConfigurationManagementDAO.java:143)
		// at
		// com.asiainfo.integration.o2p.cfg.service.ConfigurationManagementService.getZkPathById(ConfigurationManagementService.java:752)
		assertNotNull(result);
	}

	/**
	 * Run the void recursionDelete(OperateProcess,ZkPath) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testRecursionDelete_1() throws Exception {

		OperateProcess operateProcess = new OperateProcess();
		ZkPath path = new ZkPath();
		path.setId(4);
		path.setChildren(new LinkedList());

		fixture.recursionDelete(operateProcess, path);

		// add additional test code here
	}

	/**
	 * Run the void recursionDelete(OperateProcess,ZkPath) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testRecursionDelete_2() throws Exception {

		OperateProcess operateProcess = new OperateProcess();
		operateProcess.setOperatorObjList(new LinkedList());
		ZkPath path = new ZkPath();
		path.setId(4);
		path.setChildren(new LinkedList());

		fixture.recursionDelete(operateProcess, path);

		// add additional test code here
	}

	/**
	 * Run the void recursionDelete(OperateProcess,ZkPath) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testRecursionDelete_3() throws Exception {

		OperateProcess operateProcess = new OperateProcess();
		operateProcess.setOperatorObjList(new LinkedList());
		ZkPath path = new ZkPath();
		path.setId(4);
		path.setChildren(new LinkedList());

		fixture.recursionDelete(operateProcess, path);

		// add additional test code here
	}

	/**
	 * Run the void recursionDelete(OperateProcess,ZkPath) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testRecursionDelete_4() throws Exception {

		OperateProcess operateProcess = null;
		ZkPath path = new ZkPath();
		path.setId(4);
		path.setChildren(new LinkedList());

		fixture.recursionDelete(operateProcess, path);

		// add additional test code here
	}

	/**
	 * Run the void setCurator(Curator) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testSetCurator_1() throws Exception {

		Curator curator = new Curator();

		fixture.setCurator(curator);

		// add additional test code here
	}

	/**
	 * Run the Map<String, Object> syncDbToZookeeper(OperateProcess) method
	 * test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testSyncDbToZookeeper_1() throws Exception {

		OperateProcess operateProcess = new OperateProcess();

		Map<String, Object> result = fixture.syncDbToZookeeper(operateProcess);

		// add additional test code here
		assertNull(result);
	}

	/**
	 * Run the Map<String, Object> syncDbToZookeeper(OperateProcess) method
	 * test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testSyncDbToZookeeper_2() throws Exception {

		OperateProcess operateProcess = new OperateProcess();

		Map<String, Object> result = fixture.syncDbToZookeeper(operateProcess);

		// add additional test code here
		assertNull(result);
	}

	/**
	 * Run the Map<String, Object> syncDbToZookeeper(OperateProcess) method
	 * test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testSyncDbToZookeeper_3() throws Exception {

		OperateProcess operateProcess = new OperateProcess();

		Map<String, Object> result = fixture.syncDbToZookeeper(operateProcess);

		// add additional test code here
		assertNull(result);
	}

	/**
	 * Run the Map<String, Object> syncDbToZookeeper(OperateProcess) method
	 * test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testSyncDbToZookeeper_4() throws Exception {

		OperateProcess operateProcess = new OperateProcess();

		Map<String, Object> result = fixture.syncDbToZookeeper(operateProcess);

		// add additional test code here
		assertNull(result);
	}

	/**
	 * Run the Map<String, Object> syncDbToZookeeper(OperateProcess) method
	 * test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testSyncDbToZookeeper_5() throws Exception {

		OperateProcess operateProcess = new OperateProcess();

		Map<String, Object> result = fixture.syncDbToZookeeper(operateProcess);

		// add additional test code here
		assertNull(result);
	}

	/**
	 * Run the Map<String, Object> syncDbToZookeeper(OperateProcess) method
	 * test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testSyncDbToZookeeper_6() throws Exception {

		OperateProcess operateProcess = new OperateProcess();

		Map<String, Object> result = fixture.syncDbToZookeeper(operateProcess);

		// add additional test code here
		assertNull(result);
	}

	/**
	 * Run the Map<String, Object> syncDbToZookeeper(OperateProcess) method
	 * test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testSyncDbToZookeeper_7() throws Exception {

		OperateProcess operateProcess = new OperateProcess();

		Map<String, Object> result = fixture.syncDbToZookeeper(operateProcess);

		// add additional test code here
		assertNull(result);
	}

	/**
	 * Run the Map<String, Object> syncDbToZookeeper(OperateProcess) method
	 * test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testSyncDbToZookeeper_8() throws Exception {

		OperateProcess operateProcess = new OperateProcess();

		Map<String, Object> result = fixture.syncDbToZookeeper(operateProcess);

		// add additional test code here
		assertNull(result);
	}

	/**
	 * Run the Map<String, Object> syncDbToZookeeper(OperateProcess) method
	 * test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testSyncDbToZookeeper_9() throws Exception {

		OperateProcess operateProcess = new OperateProcess();

		Map<String, Object> result = fixture.syncDbToZookeeper(operateProcess);

		// add additional test code here
		assertNull(result);
	}

	/**
	 * Run the Map<String, Object> syncDbToZookeeper(OperateProcess) method
	 * test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testSyncDbToZookeeper_10() throws Exception {

		OperateProcess operateProcess = new OperateProcess();

		Map<String, Object> result = fixture.syncDbToZookeeper(operateProcess);

		// add additional test code here
		assertNull(result);
	}

	/**
	 * Run the Map<String, Object> syncDbToZookeeper(OperateProcess) method
	 * test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testSyncDbToZookeeper_11() throws Exception {

		OperateProcess operateProcess = new OperateProcess();

		Map<String, Object> result = fixture.syncDbToZookeeper(operateProcess);

		// add additional test code here
		assertNull(result);
	}

	/**
	 * Run the Map<String, Object> syncDbToZookeeper(OperateProcess) method
	 * test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testSyncDbToZookeeper_12() throws Exception {

		OperateProcess operateProcess = new OperateProcess();

		Map<String, Object> result = fixture.syncDbToZookeeper(operateProcess);

		// add additional test code here
		assertNull(result);
	}

	/**
	 * Run the void updateConf(OperateProcess,List<ConfProperties>) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testUpdateConf_1() throws Exception {

		OperateProcess operateProcess = new OperateProcess();
		List<CfgProperties> cpList = null;

		fixture.updateConf(operateProcess, cpList);

		// add additional test code here
	}

	/**
	 * Run the void updateConf(OperateProcess,List<ConfProperties>) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testUpdateConf_2() throws Exception {

		OperateProcess operateProcess = new OperateProcess();
		List<CfgProperties> cpList = new LinkedList();

		fixture.updateConf(operateProcess, cpList);

		// add additional test code here
	}

	/**
	 * Run the void updateConf(OperateProcess,List<ConfProperties>) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testUpdateConf_3() throws Exception {

		OperateProcess operateProcess = new OperateProcess();
		List<CfgProperties> cpList = new LinkedList();

		fixture.updateConf(operateProcess, cpList);

		// add additional test code here
	}

	/**
	 * Run the void updateConf(OperateProcess,List<ConfProperties>) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testUpdateConf_4() throws Exception {

		OperateProcess operateProcess = new OperateProcess();
		List<CfgProperties> cpList = new LinkedList();

		fixture.updateConf(operateProcess, cpList);

		// add additional test code here
	}

	/**
	 * Run the void updateConf(OperateProcess,List<ConfProperties>) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testUpdateConf_5() throws Exception {

		OperateProcess operateProcess = new OperateProcess();
		List<CfgProperties> cpList = new LinkedList();

		fixture.updateConf(operateProcess, cpList);

		// add additional test code here
	}

	/**
	 * Run the void updateConf(OperateProcess,List<ConfProperties>) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testUpdateConf_6() throws Exception {

		OperateProcess operateProcess = new OperateProcess();
		operateProcess.setOperatorObjList(new LinkedList());
		List<CfgProperties> cpList = new LinkedList();

		fixture.updateConf(operateProcess, cpList);

		// add additional test code here
	}

	/**
	 * Run the void updateConf(OperateProcess,List<ConfProperties>) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testUpdateConf_7() throws Exception {

		OperateProcess operateProcess = new OperateProcess();
		operateProcess.setOperatorObjList(new LinkedList());
		List<CfgProperties> cpList = new LinkedList();

		fixture.updateConf(operateProcess, cpList);

		// add additional test code here
	}

	/**
	 * Run the void updateConf(OperateProcess,List<ConfProperties>) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testUpdateConf_8() throws Exception {

		OperateProcess operateProcess = new OperateProcess();
		List<CfgProperties> cpList = new LinkedList();

		fixture.updateConf(operateProcess, cpList);

		// add additional test code here
	}

	/**
	 * Run the void updateConf(OperateProcess,List<ConfProperties>) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testUpdateConf_9() throws Exception {

		OperateProcess operateProcess = new OperateProcess();
		List<CfgProperties> cpList = new LinkedList();

		fixture.updateConf(operateProcess, cpList);

		// add additional test code here
	}

	/**
	 * Run the void updateConf(OperateProcess,List<ConfProperties>) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testUpdateConf_10() throws Exception {

		OperateProcess operateProcess = new OperateProcess();
		List<CfgProperties> cpList = new LinkedList();

		fixture.updateConf(operateProcess, cpList);

		// add additional test code here
	}

	/**
	 * Run the void updateConf(OperateProcess,List<ConfProperties>) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testUpdateConf_11() throws Exception {

		OperateProcess operateProcess = new OperateProcess();
		List<CfgProperties> cpList = new LinkedList();

		fixture.updateConf(operateProcess, cpList);

		// add additional test code here
	}

	/**
	 * Run the void updateConf(OperateProcess,List<ConfProperties>) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testUpdateConf_12() throws Exception {

		OperateProcess operateProcess = new OperateProcess();
		operateProcess.setOperatorObjList(new LinkedList());
		List<CfgProperties> cpList = new LinkedList();

		fixture.updateConf(operateProcess, cpList);

		// add additional test code here
	}

	/**
	 * Run the void updateConf(OperateProcess,List<ConfProperties>) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testUpdateConf_13() throws Exception {

		OperateProcess operateProcess = new OperateProcess();
		operateProcess.setOperatorObjList(new LinkedList());
		List<CfgProperties> cpList = new LinkedList();

		fixture.updateConf(operateProcess, cpList);

		// add additional test code here
	}

	/**
	 * Run the void updateConf(OperateProcess,List<ConfProperties>) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testUpdateConf_14() throws Exception {

		OperateProcess operateProcess = new OperateProcess();
		List<CfgProperties> cpList = new LinkedList();

		fixture.updateConf(operateProcess, cpList);

		// add additional test code here
	}

	/**
	 * Run the void updateConf(OperateProcess,List<ConfProperties>) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testUpdateConf_15() throws Exception {

		OperateProcess operateProcess = new OperateProcess();
		List<CfgProperties> cpList = new LinkedList();

		fixture.updateConf(operateProcess, cpList);

		// add additional test code here
	}

	/**
	 * Run the void updateConf(OperateProcess,List<ConfProperties>) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testUpdateConf_16() throws Exception {

		OperateProcess operateProcess = new OperateProcess();
		List<CfgProperties> cpList = new LinkedList();

		fixture.updateConf(operateProcess, cpList);

		// add additional test code here
	}

	/**
	 * Run the void updateZkPath(OperateProcess,Integer,String,String) method
	 * test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testUpdateZkPath_1() throws Exception {

		OperateProcess operateProcess = new OperateProcess();
		Integer dirId = new Integer(2);
		String dirType = "1";
		String dirName = "serviceAgent";
		if (curator.existsZNode("/serviceAgent") == null) {
			curator.createZNode("/serviceAgent");
		}
		if (curator.existsZNode("/serviceAgent") == null) {
			curator.createZNode("/serviceAgent");
		}
		fixture.updateZkPath(operateProcess, dirId, dirType, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.NullPointerException
		// at
		// com.asiainfo.integration.o2p.cfg.dao.ConfigurationManagementDAO.getConf(ConfigurationManagementDAO.java:84)
		// at
		// com.asiainfo.integration.o2p.cfg.service.ConfigurationManagementService.updateZkPath(ConfigurationManagementService.java:492)
	}

	/**
	 * Run the void updateZkPath(OperateProcess,Integer,String,String) method
	 * test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testUpdateZkPath_2() throws Exception {

		OperateProcess operateProcess = new OperateProcess();
		operateProcess.setOperatorObjList(new LinkedList());
		Integer dirId = new Integer(2);
		String dirType = "1";
		String dirName = "serviceAgent";
		if (curator.existsZNode("/serviceAgent") == null) {
			curator.createZNode("/serviceAgent");
		}

		fixture.updateZkPath(operateProcess, dirId, dirType, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.NullPointerException
		// at
		// com.asiainfo.integration.o2p.cfg.dao.ConfigurationManagementDAO.getConf(ConfigurationManagementDAO.java:84)
		// at
		// com.asiainfo.integration.o2p.cfg.service.ConfigurationManagementService.updateZkPath(ConfigurationManagementService.java:492)
	}

	/**
	 * Run the void updateZkPath(OperateProcess,Integer,String,String) method
	 * test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testUpdateZkPath_3() throws Exception {

		OperateProcess operateProcess = new OperateProcess();
		operateProcess.setOperatorObjList(new LinkedList());
		Integer dirId = new Integer(2);
		String dirType = "1";
		String dirName = "serviceAgent";
		if (curator.existsZNode("/serviceAgent") == null) {
			curator.createZNode("/serviceAgent");
		}

		fixture.updateZkPath(operateProcess, dirId, dirType, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.NullPointerException
		// at
		// com.asiainfo.integration.o2p.cfg.dao.ConfigurationManagementDAO.getConf(ConfigurationManagementDAO.java:84)
		// at
		// com.asiainfo.integration.o2p.cfg.service.ConfigurationManagementService.updateZkPath(ConfigurationManagementService.java:492)
	}

	/**
	 * Run the void updateZkPath(OperateProcess,Integer,String,String) method
	 * test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testUpdateZkPath_4() throws Exception {

		OperateProcess operateProcess = null;
		Integer dirId = new Integer(2);
		String dirType = "1";
		String dirName = "serviceAgent";
		if (curator.existsZNode("/serviceAgent") == null) {
			curator.createZNode("/serviceAgent");
		}

		fixture.updateZkPath(operateProcess, dirId, dirType, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.NullPointerException
		// at
		// com.asiainfo.integration.o2p.cfg.dao.ConfigurationManagementDAO.getConf(ConfigurationManagementDAO.java:84)
		// at
		// com.asiainfo.integration.o2p.cfg.service.ConfigurationManagementService.updateZkPath(ConfigurationManagementService.java:492)
	}

	/**
	 * Run the void updateZkPath(OperateProcess,Integer,String,String) method
	 * test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testUpdateZkPath_5() throws Exception {

		OperateProcess operateProcess = null;
		Integer dirId = new Integer(2);
		String dirType = "1";
		String dirName = "serviceAgent";
		if (curator.existsZNode("/serviceAgent") == null) {
			curator.createZNode("/serviceAgent");
		}

		fixture.updateZkPath(operateProcess, dirId, dirType, dirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.NullPointerException
		// at
		// com.asiainfo.integration.o2p.cfg.dao.ConfigurationManagementDAO.getConf(ConfigurationManagementDAO.java:84)
		// at
		// com.asiainfo.integration.o2p.cfg.service.ConfigurationManagementService.updateZkPath(ConfigurationManagementService.java:492)
	}

	/**
	 * Run the void updateZkPath(OperateProcess,Integer,String,String) method
	 * test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testUpdateZkPath_6() throws Exception {

		OperateProcess operateProcess = new OperateProcess();
		Integer dirId = new Integer(2);
		String dirType = "1";
		String dirName = "serviceAgent";
		if (curator.existsZNode("/serviceAgent") == null) {
			curator.createZNode("/serviceAgent");
		}

		fixture.updateZkPath(operateProcess, dirId, dirType, dirName);

		// add additional test code here
	}

	/**
	 * Launch the test.
	 * 
	 * @param args
	 *            the command line arguments
	 * 
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore()
				.run(ConfigurationManagementServiceTest.class);
	}
}
package com.asiainfo.integration.o2p.cfg.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.Reader;
import java.sql.Connection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.asiainfo.integration.o2p.cfg.dto.CfgProperties;
import com.asiainfo.integration.o2p.cfg.dto.ZkPath;
import com.ibatis.common.jdbc.ScriptRunner;
import com.ibatis.common.resources.Resources;

/**
 * The class <code>ConfigurationManagementDAOTest</code> contains tests for the class <code>{@link ConfigurationManagementDAO}</code>.
 *
 * @generatedBy CodePro at 15-11-26 上午11:12
 * @author windy
 * @version $Revision: 1.0 $
 */
@Configuration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/spring-cfg.xml")
public class ConfigurationManagementDAOTest {
	@Autowired
	ConfigurationManagementDAO fixture;
	private static boolean isInit = false;
	@Resource(name = "configurationSqlSessionFactory")
	public SqlSessionFactory configurationSqlSessionFactory;

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
	}
	
	/**
	 * Run the ConfigurationManagementDAO() constructor test.
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testConfigurationManagementDAO_1()
		throws Exception {
		ConfigurationManagementDAO result = new ConfigurationManagementDAO();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the int addConf(Map<String,Object>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testAddConf_1()
		throws Exception {
		
		
		Map<String, Object> param = new HashMap();

		int result = fixture.addConf(param);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.mybatis.spring.SqlSessionTemplate.<init>(SqlSessionTemplate.java:106)
		//       at org.mybatis.spring.SqlSessionTemplate.<init>(SqlSessionTemplate.java:93)
		assertEquals(1, result);
	}

	/**
	 * Run the List<Map<String, Object>> checkKeyExistBySrcId(String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testCheckKeyExistBySrcId_1()
		throws Exception {
		
		
		String ids = "3";
		int namespaceId = 1;

		List<Map<String, Object>> result = fixture.checkKeyExistBySrcId(ids, namespaceId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.mybatis.spring.SqlSessionTemplate.<init>(SqlSessionTemplate.java:106)
		//       at org.mybatis.spring.SqlSessionTemplate.<init>(SqlSessionTemplate.java:93)
		assertNotNull(result);
	}

	/**
	 * Run the void createZkPath(ZkPath) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testCreateZkPath_1()
		throws Exception {
		
		
		ZkPath zkPath = new ZkPath();

		fixture.createZkPath(zkPath);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.mybatis.spring.SqlSessionTemplate.<init>(SqlSessionTemplate.java:106)
		//       at org.mybatis.spring.SqlSessionTemplate.<init>(SqlSessionTemplate.java:93)
	}

	/**
	 * Run the int deleteConf(Map<String,Object>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testDeleteConf_1()
		throws Exception {
		
		
		Map<String, Object> param = new HashMap();

		int result = fixture.deleteConf(param);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.mybatis.spring.SqlSessionTemplate.<init>(SqlSessionTemplate.java:106)
		//       at org.mybatis.spring.SqlSessionTemplate.<init>(SqlSessionTemplate.java:93)
		assertEquals(0, result);
	}

	/**
	 * Run the int deleteConfById(Map<String,Object>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testDeleteConfById_1()
		throws Exception {
		
		
		Map<String, Object> param = new HashMap();
		param.put("id", new String[]{"4"});

		int result = fixture.deleteConfById(param);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.mybatis.spring.SqlSessionTemplate.<init>(SqlSessionTemplate.java:106)
		//       at org.mybatis.spring.SqlSessionTemplate.<init>(SqlSessionTemplate.java:93)
		assertEquals(0, result);
	}

	/**
	 * Run the void deleteConfByZkpathId(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testDeleteConfByZkpathId_1()
		throws Exception {
		
		
		Integer id = new Integer(1);

		fixture.deleteConfByZkpathId(id);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.mybatis.spring.SqlSessionTemplate.<init>(SqlSessionTemplate.java:106)
		//       at org.mybatis.spring.SqlSessionTemplate.<init>(SqlSessionTemplate.java:93)
	}

	/**
	 * Run the void deleteZkpathById(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testDeleteZkpathById_1()
		throws Exception {
		
		
		int id = 1;

		fixture.deleteZkpathById(id);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.mybatis.spring.SqlSessionTemplate.<init>(SqlSessionTemplate.java:106)
		//       at org.mybatis.spring.SqlSessionTemplate.<init>(SqlSessionTemplate.java:93)
	}

	/**
	 * Run the List<CfgProperties> getConf() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testGetConf_1()
		throws Exception {
		
		

		List<CfgProperties> result = fixture.getConf();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.mybatis.spring.SqlSessionTemplate.<init>(SqlSessionTemplate.java:106)
		//       at org.mybatis.spring.SqlSessionTemplate.<init>(SqlSessionTemplate.java:93)
		assertNotNull(result);
	}

	/**
	 * Run the List<CfgProperties> getConf(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testGetConf_2()
		throws Exception {
		
		
		String proKey = "";

		List<CfgProperties> result = fixture.getConf(proKey);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.mybatis.spring.SqlSessionTemplate.<init>(SqlSessionTemplate.java:106)
		//       at org.mybatis.spring.SqlSessionTemplate.<init>(SqlSessionTemplate.java:93)
		assertNotNull(result);
	}

	/**
	 * Run the List<CfgProperties> getConf(Map<String,Object>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testGetConf_3()
		throws Exception {
		
		
		Map<String, Object> param = new HashMap();

		List<CfgProperties> result = fixture.getConf(param);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.mybatis.spring.SqlSessionTemplate.<init>(SqlSessionTemplate.java:106)
		//       at org.mybatis.spring.SqlSessionTemplate.<init>(SqlSessionTemplate.java:93)
		assertNotNull(result);
	}

	/**
	 * Run the List<CfgProperties> getConf(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testGetConf_4()
		throws Exception {
		
		
		String path = "";
		String proKey = "";

		List<CfgProperties> result = fixture.getConf(path, proKey);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.mybatis.spring.SqlSessionTemplate.<init>(SqlSessionTemplate.java:106)
		//       at org.mybatis.spring.SqlSessionTemplate.<init>(SqlSessionTemplate.java:93)
		assertNotNull(result);
	}

	/**
	 * Run the List<CfgProperties> getConf(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testGetConf_5()
		throws Exception {
		
		
		String path = "";
		String proKey = "";

		List<CfgProperties> result = fixture.getConf(path, proKey);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.mybatis.spring.SqlSessionTemplate.<init>(SqlSessionTemplate.java:106)
		//       at org.mybatis.spring.SqlSessionTemplate.<init>(SqlSessionTemplate.java:93)
		assertNotNull(result);
	}

	/**
	 * Run the List<CfgProperties> getConf(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testGetConf_6()
		throws Exception {
		
		
		String path = "";
		String proKey = null;

		List<CfgProperties> result = fixture.getConf(path, proKey);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.mybatis.spring.SqlSessionTemplate.<init>(SqlSessionTemplate.java:106)
		//       at org.mybatis.spring.SqlSessionTemplate.<init>(SqlSessionTemplate.java:93)
		assertNotNull(result);
	}

	/**
	 * Run the List<CfgProperties> getConf(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testGetConf_7()
		throws Exception {
		
		
		String effectZone = "";
		String moduleName = "";
		String proKey = "";

		List<CfgProperties> result = fixture.getConf(effectZone, moduleName, proKey);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.mybatis.spring.SqlSessionTemplate.<init>(SqlSessionTemplate.java:106)
		//       at org.mybatis.spring.SqlSessionTemplate.<init>(SqlSessionTemplate.java:93)
		assertNotNull(result);
	}

	/**
	 * Run the List<CfgProperties> getConfById(Map<String,Object>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testGetConfById_1()
		throws Exception {
		
		
		Map<String, Object> param = new HashMap();

		List<CfgProperties> result = fixture.getConfById(param);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.mybatis.spring.SqlSessionTemplate.<init>(SqlSessionTemplate.java:106)
		//       at org.mybatis.spring.SqlSessionTemplate.<init>(SqlSessionTemplate.java:93)
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
	public void testGetParentZkPathById_1()
		throws Exception {
		
		
		Map<String, Object> param = new HashMap();

		List<ZkPath> result = fixture.getParentZkPathById(param);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.mybatis.spring.SqlSessionTemplate.<init>(SqlSessionTemplate.java:106)
		//       at org.mybatis.spring.SqlSessionTemplate.<init>(SqlSessionTemplate.java:93)
		assertNotNull(result);
	}

	/**
	 * Run the SqlSessionTemplate getSqlSessionTemplate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testGetSqlSessionTemplate_1()
		throws Exception {
		
		

		SqlSessionTemplate result = fixture.getSqlSessionTemplate();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.mybatis.spring.SqlSessionTemplate.<init>(SqlSessionTemplate.java:106)
		//       at org.mybatis.spring.SqlSessionTemplate.<init>(SqlSessionTemplate.java:93)
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
	public void testGetZkPath_1()
		throws Exception {
		
		

		List<ZkPath> result = fixture.getZkPath();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.mybatis.spring.SqlSessionTemplate.<init>(SqlSessionTemplate.java:106)
		//       at org.mybatis.spring.SqlSessionTemplate.<init>(SqlSessionTemplate.java:93)
		assertNotNull(result);
	}

	/**
	 * Run the ZkPath getZkPath(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testGetZkPath_2()
		throws Exception {
		
		
		Integer id = new Integer(1);

		ZkPath result = fixture.getZkPath(id);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.mybatis.spring.SqlSessionTemplate.<init>(SqlSessionTemplate.java:106)
		//       at org.mybatis.spring.SqlSessionTemplate.<init>(SqlSessionTemplate.java:93)
		assertNotNull(result);
	}

	/**
	 * Run the List<ZkPath> getZkPath(Map<String,Object>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testGetZkPath_3()
		throws Exception {
		
		
		Map<String, Object> param = new HashMap();

		List<ZkPath> result = fixture.getZkPath(param);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.mybatis.spring.SqlSessionTemplate.<init>(SqlSessionTemplate.java:106)
		//       at org.mybatis.spring.SqlSessionTemplate.<init>(SqlSessionTemplate.java:93)
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
	public void testGetZkPathById_1()
		throws Exception {
		
		
		Map<String, Object> param = new HashMap();

		List<ZkPath> result = fixture.getZkPathById(param);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.mybatis.spring.SqlSessionTemplate.<init>(SqlSessionTemplate.java:106)
		//       at org.mybatis.spring.SqlSessionTemplate.<init>(SqlSessionTemplate.java:93)
		assertNotNull(result);
	}

	/**
	 * Run the int updateConf(CfgProperties) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testUpdateConf_1()
		throws Exception {
		
		
		CfgProperties cp = new CfgProperties();

		int result = fixture.updateConf(cp);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.mybatis.spring.SqlSessionTemplate.<init>(SqlSessionTemplate.java:106)
		//       at org.mybatis.spring.SqlSessionTemplate.<init>(SqlSessionTemplate.java:93)
		assertEquals(0, result);
	}

	/**
	 * Run the int updateConf(Map<String,Object>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testUpdateConf_2()
		throws Exception {
		
		
		CfgProperties cp = new CfgProperties();

		int result = fixture.updateConf(cp);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.mybatis.spring.SqlSessionTemplate.<init>(SqlSessionTemplate.java:106)
		//       at org.mybatis.spring.SqlSessionTemplate.<init>(SqlSessionTemplate.java:93)
		assertEquals(0, result);
	}

	/**
	 * Run the void updateZkPath(ZkPath) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	@Test
	public void testUpdateZkPath_1()
		throws Exception {
		
		
		ZkPath zkPath = new ZkPath();

		fixture.updateZkPath(zkPath);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.mybatis.spring.SqlSessionTemplate.<init>(SqlSessionTemplate.java:106)
		//       at org.mybatis.spring.SqlSessionTemplate.<init>(SqlSessionTemplate.java:93)
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ConfigurationManagementDAOTest.class);
	}
}
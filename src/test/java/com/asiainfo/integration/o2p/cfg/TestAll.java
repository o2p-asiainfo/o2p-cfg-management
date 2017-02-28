package com.asiainfo.integration.o2p.cfg;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * The class <code>TestAll</code> builds a suite that can be used to run all
 * of the tests within its package as well as within any subpackages of its
 * package.
 *
 * @generatedBy CodePro at 15-11-26 上午11:12
 * @author windy
 * @version $Revision: 1.0 $
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
	com.asiainfo.integration.o2p.cfg.dao.TestAll.class,
	com.asiainfo.integration.o2p.cfg.dto.TestAll.class,
	com.asiainfo.integration.o2p.cfg.service.TestAll.class,
	com.asiainfo.integration.o2p.cfg.util.TestAll.class,
	com.asiainfo.integration.o2p.cfg.zookeeper.TestAll.class
})
public class TestAll {

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 15-11-26 上午11:12
	 */
	public static void main(String[] args) {
		JUnitCore.runClasses(new Class[] { TestAll.class });
	}
}

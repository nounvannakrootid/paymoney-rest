package com.appsaradev.paymoney;

import java.sql.Connection;
import java.sql.SQLException;

import com.appsaradev.paymoney.account.auth.SignIn;
import com.appsaradev.paymoney.account.auth.Verify;
import com.appsaradev.paymoney.account.transfer.Transfer;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	public AppTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(AppTest.class);
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp() {
		assertTrue(true);
	}

	public void testConnection() {
		Connection connection = com.appsaradev.paymoney.singleton.Connection.getSingleConnection();
	}

	public void testRandom() {
		System.out.println(Verify.doGenerateSecurityCode());
	}
	public void testLogin(){
		System.out.println(SignIn.isLogin("vann", "38dsiiw84"));
	}
	
	public void testCashToRecievier(){
		Transfer.setCashToReciever("rete", "hjfklshfks", 258.6);
	}
}

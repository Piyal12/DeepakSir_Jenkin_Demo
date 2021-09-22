package com.concast.Contact;

import org.testng.annotations.Test;

public class ContactTest {
	@Test(groups = "SmokeTest")
	public void createContactTest() {
		System.out.println("execute create contact");
	}

	@Test(groups = "RegressionTest")
	public void createContactWithOrgTest() {
		System.out.println("execute createContactWithOrgTest");
	}

	@Test(groups = "RegionalRegressionTest")
	public void deleteContactTest() {
		System.out.println("execute deleteContactTest");
	}
}

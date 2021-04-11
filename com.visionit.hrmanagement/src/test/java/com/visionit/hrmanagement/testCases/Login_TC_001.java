package com.visionit.hrmanagement.testCases;

import org.testng.annotations.Test;

import com.visionit.hrmanagement.pageObjects.LoginPage;
import com.visionit.hrmanagement.testBase.TestBase;

public class Login_TC_001 extends TestBase{

	@Test(priority=1)
	public void laoginTest001() {
		LoginPage login_page = new LoginPage(driver);		
		login_page.setUsername("Admin");
		login_page.setpassword("admin123");
		login_page.clickOnLoginBtn();
	}
	
	@Test(priority=2)
	public void laoginTest002() {
		LoginPage login_page = new LoginPage(driver);		
		login_page.setUsername("Admin#");
		login_page.setpassword("admin123");
		login_page.clickOnLoginBtn();
	}
	
}

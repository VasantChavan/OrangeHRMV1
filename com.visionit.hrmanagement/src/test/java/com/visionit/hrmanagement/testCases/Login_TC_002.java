package com.visionit.hrmanagement.testCases;

import org.testng.annotations.Test;

import com.visionit.hrmanagement.pageObjects.LoginPage;
import com.visionit.hrmanagement.testBase.TestBase;

public class Login_TC_002 extends TestBase {

	@Test
	public void loginTest002() {
		LoginPage login_page = new LoginPage(driver);		
		
		login_page.setUsername(configData.getUserName());
		login_page.setpassword(configData.getPassword());
		login_page.clickOnLoginBtn(); 
	}
}

package com.visionit.hrmanagement.testCases;

import org.testng.annotations.Test;

import com.visionit.hrmanagement.pageObjects.Homepage;
import com.visionit.hrmanagement.pageObjects.LoginPage;
import com.visionit.hrmanagement.testBase.TestBase;

public class Homepage_TC_001 extends TestBase {

	
	@Test
	public void navigateToAddNewUserTest() {
		
		LoginPage login_page = new LoginPage(driver);		
		login_page.setUsername("Admin");
		login_page.setpassword("admin123");
		login_page.clickOnLoginBtn();
		
		Homepage hp =new Homepage(driver);
		hp.navigateToAddNewUserPage();
	}
	
}

package com.visionit.hrmanagement.testCases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.visionit.hrmanagement.pageObjects.AddNewUserPage;
import com.visionit.hrmanagement.pageObjects.Homepage;
import com.visionit.hrmanagement.pageObjects.LoginPage;
import com.visionit.hrmanagement.testBase.TestBase;

public class AddNewUserTC_001 extends TestBase{

	
	@Test
	public void addNewUserTest() {
		

		LoginPage login_page = new LoginPage(driver);		
		login_page.setUsername("Admin");
		login_page.setpassword("admin123");
		login_page.clickOnLoginBtn();
		
		Homepage hp =new Homepage(driver);
		hp.navigateToAddNewUserPage();
		
		AddNewUserPage anu = new AddNewUserPage(driver);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		anu.selectUserRole();
		anu.setEmpName();
		anu.setUserName();
		anu.selectStatus();
		anu.setPassword();
		anu.setConfirmPassword();		
		anu.clickOnCancelBtn();
	}
}

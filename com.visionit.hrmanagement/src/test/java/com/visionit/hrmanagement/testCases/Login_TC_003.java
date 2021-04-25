package com.visionit.hrmanagement.testCases;

import org.testng.annotations.Test;

import com.visionit.hrmanagement.pageObjects.LoginPage;
import com.visionit.hrmanagement.testBase.TestBase;

public class Login_TC_003 extends TestBase {

	
	@Test
	public void loginTest003() {
		LoginPage lp = new LoginPage(driver);
		lp.setUsername(excelData.getStringCellData("login", 1, 0));
		lp.setpassword(excelData.getStringCellData("login", 1, 1));
		lp.clickOnLoginBtn();
	}
	
	@Test
	public void loginTest004() {
		LoginPage lp = new LoginPage(driver);
		lp.setUsername(excelData.getStringCellData(0, 1, 0));
		lp.setpassword(excelData.getStringCellData(0, 1, 1));
		lp.clickOnLoginBtn();
	}
	
}

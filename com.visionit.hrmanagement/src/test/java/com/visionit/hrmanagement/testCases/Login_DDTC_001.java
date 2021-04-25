package com.visionit.hrmanagement.testCases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.visionit.hrmanagement.pageObjects.LoginPage;
import com.visionit.hrmanagement.testBase.TestBase;

public class Login_DDTC_001 extends TestBase {

	@DataProvider
	public Object[][] getExcelData() {
		Object[][] data = excelData.getExcelData("dt_login");
		return data;
	}
	
	@Test(dataProvider ="getExcelData")
	public void loginDataDrivenTC_001(String user, String pass) {
	
		LoginPage lp = new LoginPage(driver);
		lp.setUsername(user);
		lp.setpassword(pass);
		lp.clickOnLoginBtn();
	}
}

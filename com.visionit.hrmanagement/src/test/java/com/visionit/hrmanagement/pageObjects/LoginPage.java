package com.visionit.hrmanagement.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class LoginPage {

	WebDriver driver = null;
	// Page layer : Object repository at page level

	@FindBy(name = "txtUsername")
	WebElement username_txt;

	@FindBy(name = "txtPassword")
	WebElement password_txt;

	@FindBy(id = "btnLogin")
	WebElement loginBtn;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void setUsername(String username) {
		username_txt.clear();
		username_txt.sendKeys(username);
	}
	public void setpassword(String password) {
		password_txt.clear();
		password_txt.sendKeys(password);
	}
	public void clickOnLoginBtn() {
		loginBtn.click();
		// boolean status = driver.getPageSource().contains("LOGIN Panel");
		// System.out.println(status);
		if (driver.getPageSource().contains("LOGIN Panel")) {
			Assert.assertTrue("TC failed expected  LOGIN Panel in the source page but not found", false );
		} 
		else if (driver.findElement(By.xpath("//*[text()='Performance']")).isDisplayed()) {
			// boolean status1 =
			// driver.findElement(By.xpath("//*[text()='Performance']")).isDisplayed();
			// System.out.println(status1);
			Assert.assertTrue(true);
		}
	}
}

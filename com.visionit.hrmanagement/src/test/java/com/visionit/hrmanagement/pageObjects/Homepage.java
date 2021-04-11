package com.visionit.hrmanagement.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.visionit.hrmanagement.utility.Helper;

public class Homepage {

	WebDriver driver;

	@FindBy(id = "menu_admin_viewAdminModule")
	WebElement admin;

	@FindBy(id = "menu_admin_UserManagement")
	WebElement user_Management;

	@FindBy(id = "menu_admin_viewSystemUsers")
	WebElement user;

	@FindBy(name = "btnAdd")
	WebElement addbtn;

	@FindBy(name = "btnDelete")
	WebElement deleteBtn;

	public Homepage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void navigateToAddNewUserPage() {

		Helper.moveToElementAndClick(driver, admin, user_Management, user);
		addbtn.click();
	}

}

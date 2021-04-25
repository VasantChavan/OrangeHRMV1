package com.visionit.hrmanagement.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.visionit.hrmanagement.utility.Helper;

public class AddNewUserPage {

	WebDriver driver;

	@FindBy(id = "systemUser_userType")
	WebElement userRole_DD;

	@FindBy(id = "systemUser_employeeName_empId")
	WebElement empName_EditBox;

	@FindBy(id = "systemUser_userName")
	WebElement userNameEditBox;

	@FindBy(id = "systemUser_status")
	WebElement status_DD;

	@FindBy(id = "systemUser_password")
	WebElement passwordEditBox;

	@FindBy(id = "systemUser_confirmPassword")
	WebElement confirmPasswordEditBox;

	@FindBy(id = "btnSave")
	WebElement saveBtn;

	@FindBy(id = "btnCancel")
	WebElement cancelBtn;

	public AddNewUserPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void selectUserRole() {
		Helper.selectDropdownvalue(userRole_DD, "ESS");
	}

	public void setEmpName() {
		empName_EditBox.sendKeys("vasant");
	}

	public void setUserName() {
		userNameEditBox.sendKeys("Vasant");
	}

	public void selectStatus() {
		Helper.selectDropdownvalue(status_DD, "Disabled");
	}

	public void setPassword() {
		passwordEditBox.sendKeys("Vasant@223$");
	}

	public void setConfirmPassword() {
		confirmPasswordEditBox.sendKeys("Vasant@223$");
	}

	public void clickOnCancelBtn() {
		cancelBtn.click();
	}

}

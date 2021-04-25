package com.visionit.hrmanagement.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Helper {

	// Add Function Library

	// 1. handle Window
	// 2.. Handle Frame
	// 3. handle Alert
	// 4. Capture screenshots
	// 5. Perform mouse activity usisng Action Class.

	public static void moveToElementAndClick(WebDriver driver, WebElement ele1, WebElement ele2, WebElement ele3) {
		Actions action = new Actions(driver);
		action.moveToElement(ele1).moveToElement(ele2).moveToElement(ele3).click().build().perform();

	}

	public static void selectDropdownvalue(WebElement ele,String visibleText) {
		new Select(ele).selectByVisibleText(visibleText);
	}
}

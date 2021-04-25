package com.visionit.hrmanagement.testBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.visionit.hrmanagement.utility.ConfigDataProvider;
import com.visionit.hrmanagement.utility.ExcelDataProvider;

public class TestBase {

	public WebDriver driver = null;
	public ConfigDataProvider configData = null;
	public ExcelDataProvider excelData = null;
	
	@BeforeSuite
	public void init() {
		configData =new ConfigDataProvider();
		excelData = new ExcelDataProvider();
	}

	@BeforeMethod
	@Parameters("browser")
	public void setUp(@Optional("chrome") String browser) {

		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if (browser.equals("ie")) {
			System.setProperty("webdriver.ie.driver", "./Driver/IEDRiverServer.exe");
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		//driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.get(configData.getAppUrl());
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}

}

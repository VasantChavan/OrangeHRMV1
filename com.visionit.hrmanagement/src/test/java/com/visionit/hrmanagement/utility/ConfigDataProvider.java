package com.visionit.hrmanagement.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {

	public Properties prop = null;

	public ConfigDataProvider() {
		try {
			File fis = new File("./Config/config.properties");
			FileInputStream fins = new FileInputStream(fis);
			prop = new Properties();
			prop.load(fins);
		} catch (Exception e) {
			System.out.println("File not found :" + e);
		}
	}

	public String searchKey(String key) {
		return prop.getProperty(key);
	}

	public String getBrowser(String browserName) {

		return prop.getProperty(browserName);
	}

	public String getAppUrl() {
		return prop.getProperty("url");
	}

	public String getUserName() {
		return prop.getProperty("user");
	}

	public String getPassword() {
		return prop.getProperty("pass");
	}
}

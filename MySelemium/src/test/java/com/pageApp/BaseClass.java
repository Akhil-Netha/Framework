package com.pageApp;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


import com.utilties.BrowserFactory;

public class BaseClass {

	public WebDriver driver;
	public static Logger logger;
	
	@BeforeClass
	public void SetUp() {
		driver = BrowserFactory.StartingApplication(driver, "Chrome", "http://sampleapp.tricentis.com/101/" );
	
		logger = Logger.getLogger("MYSelenium");
		PropertyConfigurator.configure("log4j.properties");
		logger.info("Browser open");
	}
	@AfterClass
	public void TearDown() {
		BrowserFactory.quitBrowser(driver);
		logger.info("browser closed");
	}
	
}

package com.utilties;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowserFactory {

	public static WebDriver StartingApplication(WebDriver driver,String browserName,String appurl) {
		if(browserName.equalsIgnoreCase("Chrome")) {
		    System.setProperty("webdriver.chrome.driver","E:\\Users\\satyam\\eclipse-workspace\\MySelemium\\Driver\\chromedriver.exe");
		  //  System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		    driver = new ChromeDriver();
		    
		   
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			
		}
		else if(browserName.equalsIgnoreCase("IE")) {
			
		}
		else {
			System.out.println("We do not support this browser");
		}
		
		driver.manage().window().maximize();
		driver.get(appurl);
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		return driver;	
	}
	public static WebDriver quitBrowser(WebDriver driver) {
		driver.quit();
		return driver;
	}

}

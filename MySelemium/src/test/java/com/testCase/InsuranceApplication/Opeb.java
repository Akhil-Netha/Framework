package com.testCase.InsuranceApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.utilties.BrowserFactory;

public class Opeb{

	
	WebDriver driver;
	@Test
	public void open() {
		System.setProperty("webdriver.chrome.driver","E:\\Users\\satyam\\eclipse-workspace\\MySelemium\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://sampleapp.tricentis.com/101/#");
	//	BrowserFactory.StartingApplication(driver, "Chrome","http://sampleapp.tricentis.com/101/#");
		
		driver.findElement(By.xpath("//body[1]/div[1]/header[1]/div[2]/div[1]/div[1]/ul[1]/li[3]/a[1]")).click();
	}
}

package com.pageApp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePageObjects{
	
	WebDriver ldriver;
	
	//const
	public HomePageObjects(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
		@FindBy(id="nav_automobile") WebElement link_Automobile;
		
		@FindBy(id="nav_truck") WebElement link_truck;
		
		@FindBy(xpath="//body[1]/div[1]/header[1]/div[2]/div[1]/div[1]/ul[1]/li[3]/a[1]") WebElement link_motorcycle;
		
		@FindBy(id="nav_camper") WebElement link_camper;
	
            public void ClickOnMotorCycle(){
            link_motorcycle.click();
            
			}
            
           
		
}
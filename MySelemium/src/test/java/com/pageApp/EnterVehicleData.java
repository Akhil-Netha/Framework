package com.pageApp;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class EnterVehicleData {
	WebDriver ldriver;
	
	public EnterVehicleData(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
}
	
	@FindBy(id="make") WebElement dd_Make;
	@FindBy(id="model") WebElement dd_model;
	@FindBy(id="cylindercapacity") WebElement dd_cylindercapacity;
	
	@FindBy(xpath="//input[@id='cylindercapacity']/following-sibling::span[@class='error']") WebElement Error_dd_Cylindercapacity;
	
	@FindBy(xpath="//input[@id='cylindercapacity']/following-sibling::span[@class='error']") WebElement Empty_cylinder_errorMssg;
	
	@FindBy(id="engineperformance") WebElement dd_engineperformance;
	@FindBy(id="dateofmanufacture") WebElement dd_dateofmanufacture;
	@FindBy(id="numberofseatsmotorcycle") WebElement dd_numberofseatsmotorcycle;
	@FindBy(id="listprice") WebElement dd_listprice;
	@FindBy(id="annualmileage") WebElement dd_annualmileage;
	@FindBy(id="nextenterinsurantdata") WebElement dd_nextenterinsurantdata;
	

	public void Enter_DD_Make() {
		Select make = new Select(dd_Make);
		
		List<WebElement> make_dd_list = make.getOptions();
		int total_make_dd = make_dd_list.size();
		Assert.assertEquals(total_make_dd , 16);
		System.out.println("Total make dropdown list"+ total_make_dd);
		for(WebElement ele: make_dd_list) {
			String make_dd_num = ele.getText();
			System.out.println(make_dd_num);
		}
		
		make.selectByValue("BMW");
		}
	
	public void Enter_DD_Model() {
		Select model = new Select(dd_model);
		
		List<WebElement> model_dd_list = model.getOptions();
		int total_model_dd = model_dd_list.size();
		Assert.assertEquals(total_model_dd, 5);
		System.out.println("Total Model DropDown count " + total_model_dd);
		for (WebElement ele : model_dd_list) {
			String model_dd_num=ele.getText();
			System.out.println(model_dd_num);
		}
		model.selectByValue("Three-Wheeler");
		}
	
	public void Txt_Cylindercapacity(String txt_cylinder) {
		dd_cylindercapacity.sendKeys(txt_cylinder);
	}
	//Invalid data error message
	public String get_ErrorMessage_CylindreCapacity() {
		return Error_dd_Cylindercapacity.getText();
		
	}
	
	//Empty data error message 
	 public String Empty_cylondercapacity() {
		return Empty_cylinder_errorMssg.getText();
	 }

	public void Txt_EnginePerformance(String txt_engine) {
		dd_engineperformance.sendKeys(txt_engine);
	}
	
	
	public void DateOfManufacture(int mm,int dd,int yy) {
		dd_dateofmanufacture.sendKeys(String.valueOf(mm));
		dd_dateofmanufacture.sendKeys(String.valueOf(dd));
		dd_dateofmanufacture.sendKeys(String.valueOf(yy));
	}

	
}
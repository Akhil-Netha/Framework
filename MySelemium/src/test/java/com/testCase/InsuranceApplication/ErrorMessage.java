package com.testCase.InsuranceApplication;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageApp.BaseClass;
import com.pageApp.EnterVehicleData;
import com.pageApp.HomePageObjects;

public class ErrorMessage extends BaseClass {  
	@Test
	public void ErrorMssg_MotorCycle_link() throws Exception {
		
	HomePageObjects MotorCycle_link = new HomePageObjects(driver);
	MotorCycle_link.ClickOnMotorCycle();
	
	EnterVehicleData EnterVehicleData_errormssg = new EnterVehicleData(driver);
	EnterVehicleData_errormssg.Txt_Cylindercapacity("7777");
	
	//verifing cylinder error message 
	
	String actualerror = EnterVehicleData_errormssg.get_ErrorMessage_CylindreCapacity();
	String expectederror = "Must be a number between 1 and 2000";
	Assert.assertEquals(actualerror, expectederror);
	System.out.println(actualerror);
	Thread.sleep(3000);
	}
	
	@Test
	public void EmptyCylinderErrormssg() {
	HomePageObjects MotorCycle_link = new HomePageObjects(driver);
	MotorCycle_link.ClickOnMotorCycle();
	
	EnterVehicleData EnterVehicleData_errormssg = new EnterVehicleData(driver);
	EnterVehicleData_errormssg.Txt_Cylindercapacity("");
	String actualemptyerror = EnterVehicleData_errormssg.get_ErrorMessage_CylindreCapacity();
	String expectedEmptymessg = "This field is mandatory";
	System.out.println(actualemptyerror);
	Assert.assertEquals(actualemptyerror, expectedEmptymessg);
	
	
	
	
	}
	
	

}

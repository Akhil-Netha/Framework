package com.testCase.InsuranceApplication;

import org.testng.annotations.Test;
import com.pageApp.BaseClass;
import com.pageApp.EnterVehicleData;
import com.pageApp.HomePageObjects;
public class EndToEndTest extends BaseClass{
      @Test
      public void motorCycle() throws Exception {
    	  
      HomePageObjects motorcycle_link = new HomePageObjects(driver);
      motorcycle_link.ClickOnMotorCycle();
      
      logger.info("Open motorcycle_link page object ");
      Thread.sleep(2000);
      
      EnterVehicleData MotorCycle_Data = new EnterVehicleData(driver);
    	  
      MotorCycle_Data.Enter_DD_Make();
      logger.info("DD_Make is seleted");
 
      logger.info("Total Model_dd_List :");
      MotorCycle_Data.Enter_DD_Model();
      logger.info("DD_Model is selected");
      
      MotorCycle_Data.Txt_Cylindercapacity("123");
      logger.info("Txt_Cylindercapacity");
     
      MotorCycle_Data.Txt_EnginePerformance("125");
      logger.info("Txt_EnginePerformance");
      
      MotorCycle_Data.DateOfManufacture(1, 12, 1997);
      logger.info("DateOfManufacture");
      
      Thread.sleep(2000);
      
      }   	 
      
      
    	
      }


     
	
	
    



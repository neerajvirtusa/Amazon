package com.test.demo;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;
import Action.LoginScriptAmz;

public class LoginTest extends BaseTemplate {
		@Test
		/*public void test(){
			ReadProperties readProp = new ReadProperties();
			StartUpInitilize initilize = new StartUpInitilize();
			System.out.println("---------------My Test-----------"+readProp.getProperties("userName")+ initilize.getDriver().getCurrentUrl());
			
			System.out.println(ReadJson.getJsonValue("$.AdminCredentials.username"));}*/
			
		public void AmazonLogin(){
			logger.log(LogStatus.PASS, "User login in to the system");
			LoginScriptAmz action1=new LoginScriptAmz();
			action1.login();
			logger.log(LogStatus.PASS, "User successfully logged in to the system");
		}
		
		/*public void AmazonLogin2(){
			logger.log(LogStatus.PASS, "User login in to the system");
			LoginScriptAmz action2=new LoginScriptAmz();
			action2.logout();
			logger.log(LogStatus.PASS, "User successfully logged in to the system");
		}*/
		
  
  }


package com.mindtree.xceltesting.Demo_HybridFramework;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mindtree.Utility.ExcelUtils;
import com.mindtree.Utility.Screenshot_util;
import com.mindtree.executionclass.ActionExecutor;
import com.mindtree.executionclass.ActionKeywords;
import com.mindtree.pageObject.HomePage;
import com.mindtree.pageObject.LoginPage;
import com.mindtree.reusablecomponents.CommonComponents;


public class TestEngine {
	WebDriver driver;
	/*WebDriver driver;
	Properties config_properties = new Properties();*/
	Logger logger = Logger.getRootLogger();
	
	/*@BeforeTest
	public void initenv() {
		driver = CommonComponents.loaddriver();
		
		
		
		HomePage homepage = new HomePage();
		
		homepage.readingHomepage();
		Screenshot_util.takeScreenshot(driver);
		logger.debug("Opened the site");
	}*/
	
	@Test
	public void test_main() {
		
		
		ExcelUtils.read_workbook();
		int i =1;
		
		
		
		while(i<=ExcelUtils.get_Last_Row_Num("Test Scenario")) {
			String status = ExcelUtils.read_celldata("Test Scenario", i, 3);
			System.out.println(status+" "+i);
			String testScenario = "";
			int j=1;
			
			if(status.equals("YY")) {
				testScenario = ExcelUtils.read_celldata("Test Scenario", i, 0);
				//System.out.println(testScenario);
				
				while(j<=ExcelUtils.get_Last_Row_Num(testScenario)) {
					
					String action = ExcelUtils.read_celldata(testScenario, j, 2);
					String value = ExcelUtils.read_celldata(testScenario, j, 3);
					
					
					try {
						//System.out.println("action executor called");
						
						ActionExecutor.execute(action, value);
						
					} catch (NoSuchMethodException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (SecurityException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					/*
					if(action.equals("click_signin_btn")) {
						ActionKeywords.click_btn(HomePage.getSignUp_btn(driver));
						Screenshot_util.takeScreenshot(driver);
					}
					else if(action.equals("input_username_text")) {
						String value = ExcelUtils.read_celldata(testScenario, j, 3);
						ActionKeywords.input_username_text(LoginPage.getUsernamebar(driver), value);
						Screenshot_util.takeScreenshot(driver);
					}
					else if(action.equals("input_password_text")) {
						String value = ExcelUtils.read_celldata(testScenario, j, 3);
						ActionKeywords.input_password_text(LoginPage.getPasswordbar(driver), value);
						Screenshot_util.takeScreenshot(driver);
					}
					else if(action.equals("click_login_btn")) {
						
						ActionKeywords.click_btn(LoginPage.getloginbutton(driver));
						Screenshot_util.takeScreenshot(driver);
					}*/
					
					j++;				
					
				}// j loop ends here
			}
			i++;			
		}
		
		
		
	}
	
	
}

package com.mindtree.executionclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.Utility.ExcelUtils;
import com.mindtree.pageObject.HomePage;
import com.mindtree.pageObject.LoginPage;
import com.mindtree.reusablecomponents.CommonComponents;



public class ActionKeywords {
	static WebDriver driver;	
	//make a common driver here, use the driver in all cases
	//need to work on this , use this in testEngine, and bring loadDriver() here along with browser name 
	public static void open_browser(String value) {	
		if(value.equals("chrome")) {
			driver = CommonComponents.loaddriver();
		}
		else if(value.equals("firefox")) {
			
		}
		
		
	}
	
	
	public static void navigate(String url) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		
	}
	
	public static void click_signin_btn() {
		
		HomePage.getSignUp_btn(driver).click();
	}
	
	public static void input_username_text(String value) {
		
		LoginPage.getUsernamebar(driver).sendKeys(value);
	}
	
	public static void input_password_text(String value) {
		
		LoginPage.getPasswordbar(driver).sendKeys(value);
	}
		
	public static void click_login_btn() {
		LoginPage.getloginbutton(driver).click();
	}
	
	public static void wait(String time) {
		double timein = Double.parseDouble(time);
		int timeinsec = (int)timein;
		//int timeinsec = Integer.parseInt(time);
		driver.manage().timeouts().implicitlyWait(timeinsec, TimeUnit.SECONDS);
		
	}
}

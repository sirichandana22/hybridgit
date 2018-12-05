package com.mindtree.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.UIstore.LoginPageUI;

public class LoginPage {
	
	static WebElement element;
	
	public static WebElement getUsernamebar(WebDriver driver) {
		LoginPageUI loginpg = new LoginPageUI();
		element = driver.findElement(loginpg.get_usernametxtbox());
		return element;
	}
	
	public static WebElement getPasswordbar(WebDriver driver) {
		LoginPageUI loginpg = new LoginPageUI();
		element = driver.findElement(loginpg.get_passwordtxtbox());
		return element;
		
	}
	
	public static WebElement getloginbutton(WebDriver driver) {
		LoginPageUI loginpg = new LoginPageUI();
		element = driver.findElement(loginpg.get_login_btn());
		return element;
		
	}
}

package com.mindtree.UIstore;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;

public class LoginPageUI {
	
	static By Elementid;
	
	
	
	static Properties locator_property;
	public LoginPageUI() {
		locator_property = new Properties();
		
		try {
			FileInputStream propertyfile = new FileInputStream(new File("D:\\M1049187\\myhybridframework\\locator.properties"));
			locator_property.load(propertyfile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	} 
	
	public static By get_usernametxtbox() {
		
		Elementid = By.id(locator_property.getProperty("username_txtbox"));
		return Elementid;
	}
	public static By get_passwordtxtbox() {
		
		Elementid = By.id(locator_property.getProperty("password_txtbox"));
		return Elementid;
	}
	
	public static By get_login_btn() {
		
		Elementid = By.id(locator_property.getProperty("login_button"));
		return Elementid;
	}
}

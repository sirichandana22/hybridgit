package com.mindtree.UIstore;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;

import com.mindtree.reusablecomponents.CommonComponents;

public class HomePageUI {
	
	public static By Search_bar  = By.id("twotabsearchtextbox");
	
	public static By Prime_Exclusive_text = By.xpath("//h2[contains(text(),'Prime Exclusives')]");
	
	public static By Signin_btn;
	
	static Properties locator_property;
	
	public HomePageUI() {
		locator_property = new Properties();
		
		try {
			FileInputStream propertyfile = new FileInputStream(new File("D:\\M1049187\\myhybridframework\\locator.properties"));
			locator_property.load(propertyfile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	} 
	
	public static By get_signinbtn() {
		
		Signin_btn = By.id(locator_property.getProperty("Sign_in_button"));
		return Signin_btn;
	}
	
	
}

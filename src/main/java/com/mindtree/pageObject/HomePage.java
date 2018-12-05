package com.mindtree.pageObject;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.UIstore.HomePageUI;
import com.mindtree.reusablecomponents.CommonComponents;

public class HomePage {
	
	//WebDriver driver;
		
	static WebElement element;
	
	public void readingHomepage() {
			
		CommonComponents.opensite();
			
	}	
		
	public static WebElement setSearchbar(WebDriver driver) {
		
		element = driver.findElement(HomePageUI.Search_bar);
		return element;
		
	}
	
	public static WebElement getSignUp_btn(WebDriver driver) {
		HomePageUI homeUI = new HomePageUI();
		element = driver.findElement(HomePageUI.get_signinbtn());
		return element;
	}
}

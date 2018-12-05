package com.mindtree.reusablecomponents;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/**
 * @author M1049187
 *
 */
public class CommonComponents {
	public static Properties configproperty = new Properties(); 
	public static WebDriver driver;
	
	public static void getconfig_properties() {
		FileInputStream readconfig;
		
		try {
			readconfig = new FileInputStream(new File("D:\\M1049187\\myhybridframework\\config.properties"));
			configproperty.load(readconfig);
			readconfig.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
	
	//@author:Sirichandana
	//@date:11/30/2018
	//@purpose: Setting the browser and opening it
	public static WebDriver loaddriver() {
		
		//CommonComponents.getconfig_properties();
		
		String chromepath = configproperty.getProperty("Chrome_driver");
		//System.out.println(configproperty.getProperty("Chrome_driver"));
		//System.out.println(chromepath);
		System.setProperty("webdriver.chrome.driver", chromepath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		return driver;
		
	}
	
	/**
	 * 
	 */
	public static void opensite() {
		driver.get(configproperty.getProperty("site_url"));
	}
	
	public void closingbrowser() {
		driver.close();
	}
	
	
	
}

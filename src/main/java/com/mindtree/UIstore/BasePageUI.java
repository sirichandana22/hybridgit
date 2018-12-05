package com.mindtree.UIstore;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BasePageUI {
	static Properties locator_property;
	
	public BasePageUI() {
		locator_property = new Properties();
		try {
			FileInputStream propertyfile = new FileInputStream(new File("D:\\M1049187\\myhybridframework\\locator.properties"));
			locator_property.load(propertyfile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public BasePageUI(Properties someproperty) {
		locator_property = someproperty;		
	}
	
}

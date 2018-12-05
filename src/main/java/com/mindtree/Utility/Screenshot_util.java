package com.mindtree.Utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot_util {
	static int count =0;
	
	public static void takeScreenshot(WebDriver driver) {
		
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		File screenshotfile = screenshot.getScreenshotAs(OutputType.FILE);
		String filepath = "D:\\M1049187\\myhybridframework\\Screenshot\\img"+count+".png";
		
		try {
			FileUtils.copyFile(screenshotfile, new File(filepath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		count++;
	}
	
}

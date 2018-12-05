package com.mindtree.executionclass;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActionExecutor {
	
	public static void execute(String actionname,String value) throws NoSuchMethodException, SecurityException {
			
		ActionKeywords ak_obj = new ActionKeywords();	
		
		Class cls = ak_obj.getClass();
		Method methodcall;
		try {
			if(actionname.equalsIgnoreCase("navigate")||actionname.equalsIgnoreCase("wait")) {
				methodcall = cls.getDeclaredMethod(actionname, String.class);
				methodcall.invoke(ak_obj, value);
				
			}
			else if(value.equals("")) {
				//System.out.println("clicking methods");
				methodcall = cls.getDeclaredMethod(actionname);
				methodcall.invoke(ak_obj);
			}
			else {
				methodcall = cls.getDeclaredMethod(actionname, String.class);
				methodcall.invoke(ak_obj, value);
			} 
					
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();			
		}
	}
}

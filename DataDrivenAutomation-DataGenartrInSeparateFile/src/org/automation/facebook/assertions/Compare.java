package org.automation.facebook.assertions;

import org.openqa.selenium.WebDriver;

public class Compare {

//expected URL we are expecting from the TC	
//to work on a page, we need driver
// we are asking to provide us WebDriver driver	
	public static boolean validatePageURL(WebDriver driver, String expURL) {
		
		boolean flag=false;
		if (driver.getCurrentUrl().equalsIgnoreCase(expURL)) {
			flag=true;
		}
		return flag;
		
	}
	
	

	public static boolean validatePageTitle(WebDriver driver, String expTitle) {
		
		boolean flag=false;
		
		if (driver.getTitle().equalsIgnoreCase(expTitle)) {
			flag=true;
			
		}
		return flag;
	}
	
}

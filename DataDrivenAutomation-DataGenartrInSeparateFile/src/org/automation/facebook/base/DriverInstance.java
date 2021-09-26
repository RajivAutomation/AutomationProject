package org.automation.facebook.base;

import java.io.IOException;

import org.automation.facebook.utility.Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class DriverInstance {

	
	public WebDriver driver;
	
	@BeforeMethod
	public void initiateDriverInstance() throws IOException {
//We will read the data like browser name from Config file and accordingly create the Driver obj
		
		if(Utility.fetchPropertyValue("browserName").toString().equalsIgnoreCase("chrome")) {
			
			System.setProperty("WebDriver.chrome.driver", "./Driver/chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		
		else if(Utility.fetchPropertyValue("browserName").toString().equalsIgnoreCase("firefox"))
		{
//if its firefox browser,then create firefox driver object
		
			System.setProperty("WebDriver.gecko.driver", "./Driver/geckodriver.exe");
			driver = new FirefoxDriver();
			
		}
		else if(Utility.fetchPropertyValue("browserName").toString().equalsIgnoreCase("IE"))
		{
//if its firefox browser,then create firefox driver object
			System.setProperty("WebDriver.ie.driver", "./Driver/internetexplorerdriver.exe");
			driver = new InternetExplorerDriver();
	
			
			
		}
		else 
		{

			//System.setProperty("WebDriver.chrome.driver", "./Driver/chromedriver.exe");
			System.setProperty("WebDriver.gecko.driver", "./Driver/geckodriver.exe");
			driver = new ChromeDriver();
			
		}

		
//Now, start the URL, for this we use "Utility.fetchPropertyValue()"
// we are passing 'Key' and will return the url as value. Since Utility file returns
// an object, so we are usgin 'toString()' to convert it into the String		
		driver.get(Utility.fetchPropertyValue("applicationURL").toString());
	}
	
	@AfterMethod
	public void closeDriverInstance() {
		
		driver.quit();
		
	}
}

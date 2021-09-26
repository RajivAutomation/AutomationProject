package org.automation.facebook.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Utility {
	
// To Read the data from the Utility file, we are creating the below method
	
	public static Object fetchPropertyValue(Object key) throws IOException { // making it static as we will use it in multiple places
		
//connecting with the 'FileInputStream' file
		FileInputStream file = new FileInputStream("./Config/config.properties");
//To read the property file we have a class - Properties
		Properties property = new Properties();
//First we need to load the file. For loading the file, we use ".load()" method
		property.load(file);
// which data you want to read, 'Key is passed'
//Whoever will use this 'fetchPropertyValue()' method will pass the 'key' to below method
//and it will return the Object.		
		return property.get(key);
		
	}
	
//We will create another Utility Method to fetch the Key Value from the Element Property file
	
	public static String fetchLocatorValue(String key) throws IOException { // making it static as we will use it in multiple places
		
		//connecting with the 'FileInputStream' file
				FileInputStream file = new FileInputStream("./Config/Element.properties");
		//To read the property file we have a class - Properties
				Properties property = new Properties();
		//First we need to load the file. For loading the file, we use ".loading()" method
				property.load(file);
		// which data you want to read, 'Key is passed'
		//Whoever will use this 'fetchPropertyValue()' method will pass the 'key' to below method
		//and it will return the Object. So, we typecasted it using toString() to get all returning values in String		
				return property.get(key).toString();
				
			}
	
	
	
	
	
}


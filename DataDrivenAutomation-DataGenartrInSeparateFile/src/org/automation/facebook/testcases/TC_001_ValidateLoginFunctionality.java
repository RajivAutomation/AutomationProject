package org.automation.facebook.testcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.automation.facebook.base.DriverInstance;
import org.automation.facebook.datagenerators.DataGenerator;
import org.automation.facebook.pages.LoginPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC_001_ValidateLoginFunctionality extends DriverInstance{

	
//When we write @Test Annotation, it will look for @BeforeMethod and @AfterMethod
//Since, we do not have it here, we can extend the Class where we have written those methods	
	
//To use data generated, we need to tell from where the data is coming i.e. DataProvder with name	
//Also, we need to provide the name of the 'dataProviderClass' Name (which has that Method) in @Test Annotation

	
	/*
	 * When We are picking the 'dataProvider' from the different class, then we need to make two changes:->
	 * 1) We need to make dataProvider Method as 'Static'
	 * 2) When we are using that DataGenerator() Method in our TestCase, In front of the 
	 * @Test (annotation) we need to provide the 'Name of the Class' where you have 
	 * provided DataGenerator Method i.e.
	 * @Test(dataProvider="Excel", dataProviderClass=DataGenerator.class)
	 */
	
	
	@Test(dataProvider="Excel", dataProviderClass=DataGenerator.class)
	public void TC_001_Login_Functionality(String uname, String pass) throws IOException {
	 
		LoginPage login = new LoginPage(driver);//this driver object is coming from Parent Class
		login.enterUsername(uname);
		login.enterPassword(pass);
		login.clickSignin();
	}
	
	
	
	
}

package org.automation.facebook.testcases;

import java.io.IOException;

import org.automation.facebook.base.DriverInstance;
import org.automation.facebook.pages.LoginPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC_001_ValidateLoginFunctionality extends DriverInstance{

	
//When we write @Test Annotation, it will look for @BeforeMethod and @AfterMethod
//Since, we do not have it here, we can extend the Class where we have written those methods	
	
//To use data generated, we need to tell from where the data is coming i.e. DataProvder with name	
	@Test(dataProvider="Static")
	public void TC_001_Login_Functionality(String uname, String pass) throws IOException {
	 
		LoginPage login = new LoginPage(driver);//this driver object is coming from Parent Class
		login.enterUsername(uname);
		login.enterPassword(pass);
		login.clickSignin();
	}
	
	
@DataProvider(name="Static")//We can give any DataProvider name in the Parenthesis next to it
//here we create 2 dim Array	
	public Object [][] testDataGenerator() {
//creating 2 Dim Object Array. All Classes Parent is Object. String Class Parent is Object
	
	//3 Rows and 2 Columns. We are passing the data to Object Array
	Object data [][] = {{"Unam1", "Pass1"}, {"Unam2", "Pass2"}, {"Unam3", "Pass3"}}; // Row x Col
		return data;
	}
	
	
}

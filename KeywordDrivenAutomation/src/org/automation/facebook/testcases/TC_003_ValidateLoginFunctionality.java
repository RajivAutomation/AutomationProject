package org.automation.facebook.testcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.automation.facebook.base.DriverInstance;
import org.automation.facebook.pages.LoginPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC_003_ValidateLoginFunctionality extends DriverInstance{

	
//When we write @Test Annotation, it will look for @BeforeMethod and @AfterMethod
//Since, we do not have it here, we can extend the Class where we have written those methods	
	
//To use data generated, we need to tell from where the data is coming i.e. DataProvder with name	
//
	@Test(dataProvider="Excel")	
	public void TC_001_Login_Functionality(String uname, String pass) throws IOException {
	 
		LoginPage login = new LoginPage(driver);//this driver object is coming from Parent Class
		login.enterUsername(uname);
		login.enterPassword(pass);
		login.clickSignin();
	}
	
	
@DataProvider(name="Excel")//We can give any DataProvider name in the Parenthesis next to it
//here we create 2 dim Array	
	public Object [][] testDataGenerator() throws IOException {
//we will read Data from Excel Sheet now by using APACHE POI

	
//Making connection with the File
	FileInputStream file = new FileInputStream("./TestData/TestData.xlsx");

//To Read Data from File
	XSSFWorkbook workbook = new XSSFWorkbook(file); // pass file object. Move to Workbook level 

//move to Sheet Level
	XSSFSheet loginSheet = workbook.getSheet("Login");
	int numberOfData = loginSheet.getPhysicalNumberOfRows(); // return how many rows in excelsheet
	
//we need to enter all the data in the Object [][] Array
	Object [][] testData = new Object[numberOfData][2];// 2 columns are there in sheet; and rows = numberOfData
	
// Read the Data from ExcelSheet to capture in 2D Array. We use for each loop
	
	for (int i=0; i<numberOfData; i++) {// Running Loop for each row i.e. 4 rows i.e. 0 to 3 index
		
		XSSFRow row = loginSheet.getRow(i);//object of the 0thRow
		XSSFCell username = row.getCell(0);//Cell at row [0 th to 3] and Columb [0]
		XSSFCell password = row.getCell(1);//Cell at row [0 th to 3] and Columb [1]
//Create 2 Dim Object Array
		testData[i][0]=username.getStringCellValue(); //Picking the cell data and storing in Array
		testData[i][1] = password.getStringCellValue();
		
		
		
	}
	
	return testData;
	}
	
	
}

package startingpoint;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

public class MainMethod {

	public static void main(String[] args) throws IOException {
		
		XmlSuite s1 = new XmlSuite();
		s1.setName("Suite1");
		
		XmlTest t1 = new XmlTest(s1);
		t1.setName("Test1");
		
		FileInputStream fis = new FileInputStream("./TestData/TestData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("keyword");
		int noOfRows = sheet.getPhysicalNumberOfRows(); // will return number of data rows in sheet
		
		ArrayList<XmlClass> Ac = new ArrayList<XmlClass>();
		for(int i=1; i<noOfRows; i++) {
			
			XSSFRow row = sheet.getRow(i);//object of the 0thRow
			XSSFCell username = row.getCell(4);//Cell at row [1 th to 3] and Columb [4]
			
			if (username.getStringCellValue().equalsIgnoreCase("Y")) {
				

				
				XSSFCell pkg = row.getCell(2);
				XSSFCell clas = row.getCell(3);
				
				
				String cname = pkg.getStringCellValue()+"."+clas.getStringCellValue();
				XmlClass ck= new XmlClass(cname);	
				Ac.add(ck);
		}
			
			t1.setClasses(Ac);
			
			ArrayList<XmlTest> At = new ArrayList<XmlTest>();
			At.add(t1);
			
			s1.setTests(At); // put all set in suits
			
			ArrayList<XmlSuite> As = new ArrayList<XmlSuite>();
			As.add(s1);
			
			TestNG tn = new TestNG();
			tn.setXmlSuites(As);

			tn.run();
			

			
			
		}
		
	}
	
}

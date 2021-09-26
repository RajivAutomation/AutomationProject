package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//import StepDefinitions.LoginDemoSteps;
import StepDefinitions.LoginDemoSteps_POM;


public class LoginPage  {

	WebDriver driver;
	
	By lnk_SignIn_name = By.className("login");
	
	By txtbx_EmailAdd_id = By.id("email");
	
	By txtbx_Pswrd_id = By.cssSelector("input#passwd");
	
	By btn_Signin_xpath = By.xpath("//span[normalize-space()='Sign in']");
	
	By btn_SignOut_xpath = By.xpath("//p[contains(text(), 'Welcome to your account')]"); 
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		
		String j = driver.getTitle();
		System.out.println("The Title of the Page = " +j) ;
		
		System.out.println("Current URL = " + driver.getCurrentUrl());
	
		/*
		 * if (! driver.getTitle().equals("Login - My Store")) {
		 * 
		 * throw new IllegalStateException
		 * ("This is not the Login Page. The current page is: "+
		 * driver.getCurrentUrl());
		 * 
		 * }
		 */	}
	
	public void clckSignInLink() {
		
		driver.findElement(lnk_SignIn_name).click();
	}
	
	public void enterUserName(String username) {
				
		driver.findElement(txtbx_EmailAdd_id).sendKeys(username);
		
	}
	
	
	public void enterPasswrd(String password) {
		
		driver.findElement(txtbx_Pswrd_id).sendKeys(password);
		
	}
	
	public void clickSignInButton() {
		
		driver.findElement(btn_Signin_xpath).click();
	}
	
	public void validateSignOutIsDispalyed() {
		driver.findElement(btn_SignOut_xpath).isDisplayed();
	
	}

	
	
	
}

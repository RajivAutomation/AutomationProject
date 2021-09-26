package pageFactory;

import org.hamcrest.Factory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PF {

	@FindBy(id = "name")
	WebElement txtbox_username;
	
	@FindBy(id="password")
	WebElement txtbox_password;
	
	
	@FindBy (xpath = "//button[normaliz-space()='btn btn-primary tp-button tp-blue']")
	WebElement btn_Login;
	
	
	
	public void enterUserNM(String username) {
		
		txtbox_username.sendKeys("username");
	}
	
	
	public void enterPassword(String password) {
		
		txtbox_password.sendKeys(password);
	}
	
	public void clck_Login() {
		
		btn_Login.click();
	}
	
	
	WebDriver driver;
	
	public LoginPage_PF(WebDriver driver) {
		this.driver=driver;
	//PageFactory.initElements(driver, this); // this or write "LoginPage_PF.class"
	  PageFactory.initElements(driver, LoginPage_PF.this);	
		
	}
	
}

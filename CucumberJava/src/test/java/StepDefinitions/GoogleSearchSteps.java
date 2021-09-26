package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

import static org.junit.Assert.assertEquals;

import java.awt.RenderingHints.Key;
import java.awt.desktop.SystemSleepEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.core.cli.Main;

public class GoogleSearchSteps {

	WebDriver driver = null;
	
	
	
	
	@Given("Broswer is open")
	public void broswer_is_open() {

		System.out.println("Inside Step - browser is open"); 
		
//to get the path of the Project Dir
		String projectPath = System.getProperty("user.dir");
		System.out.println("The Path of the Project Directory is = " + projectPath);
		
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//pageload timeout if page is slow to load
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}

	@And("user is on Google Search page")
	public void user_is_on_google_search_page() {
		System.out.println("Inside Step - user is on GoogleSearch page");
		driver.get("https://www.google.com/");
		System.out.println("User is landed on Search Page ");
	}

	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box() {
		System.out.println("Inside Step - User Entered text in Search Box");
		
		driver.findElement(By.name("q")).sendKeys("webdriver.io");
	}

	@And("hits enter button")
	public void hits_enter_button() {
		System.out.println("Inside Step - User has hit Enter Button");
		
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("user is navigated to the search results")
	public void user_is_navigated_to_the_search_results() {
		System.out.println("Inside Step - User is on Search Results");

		//WebElement ActualTitle = driver.findElement(By.xpath("//a[contains(text(), 'How to setup WebdriverIO')]"));
		//String ExpectedTitle = "How to setup WebdriverIO";
		//Assert.assertEquals(ExpectedTitle, ActualTitle);
		
		//Assert.assertEquals("How to setup WebdriverIO", "//a[contains(text(), 'How to setup WebdriverIO')]");
		//assertEquals("//a[contains(text(), 'How to setup WebdriverIO')]", "How to setup WebdriverIO");
		
		driver.getPageSource().contains("How to setup WebdriverIO");
		
		driver.close();
		driver.quit();
	
			
		
	}

}

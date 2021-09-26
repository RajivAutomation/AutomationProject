package StepDefinitions;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/*
 * public class LoginDemoSteps {
 * 
 * WebDriver driver;
 * 
 * @Given("application browser is open") public void
 * application_browser_is_open() {
 * 
 * System.out.println("Inside Step - Browser is open"); String projectDirPath =
 * System.getProperty("user.dir");
 * System.out.println("Project Directory Path = " + projectDirPath);
 * 
 * System.setProperty("webdriver.chrome.driver",
 * "./src/test/resources/drivers/chromedriver.exe"); driver = new
 * ChromeDriver();
 * 
 * driver.manage().window().maximize();
 * driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
 * driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 * 
 * }
 * 
 * @And("application user is on login page") public void
 * application_user_is_on_login_page() {
 * 
 * System.out.println("Inside Step - User is on Login Page");
 * 
 * driver.navigate().to("http://automationpractice.com/index.php");
 * driver.findElement(By.xpath("//a[contains(text(), 'Sign in')]")).click();
 * System.out.println("user successfully landed on login page");
 * 
 * }
 * 
 * @When("^application user enters (.*) and (.*)$") public void
 * application_user_enters_username_and_password(String username, String
 * password) {
 * System.out.println("Inside Step - User has entered username and password");
 * 
 * driver.findElement(By.cssSelector("input#email")).sendKeys(username);
 * driver.findElement(By.cssSelector("input#passwd")).sendKeys(password); }
 * 
 * 
 * @And("application user clicks on login") public void
 * application_user_clicks_on_login() {
 * System.out.println("Inside Step - User has clicked on Signin");
 * driver.findElement(By.xpath("//span[normalize-space()='Sign in']")).click();
 * 
 * }
 * 
 * @Then("application user is navigated to home page") public void
 * application_user_is_navigated_to_home_page() {
 * 
 * System.out.println("Inside Step - USer is navigated to Home Page");
 * 
 * //driver.getPageSource().contains("Sign out"); driver.findElement(By.
 * xpath("//p[contains(text(), 'Welcome to your account')]")).isDisplayed();
 * System.out.println("User clicked on SignOut");
 * 
 * 
 * driver.close(); driver.quit(); }
 * 
 * 
 * 
 * }
 */
package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {


	@Given("user is on login page")
	public void user_is_on_login_page() {
System.out.println("Inside Steps - user is on Login Page");
	}

	@When("user clicks enters username and password")
	public void user_clicks_enters_username_and_password() {
		System.out.println("Inside Steps - user enters username and password");	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("Inside Steps - user Clicks on Login Button");
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		System.out.println("Inside Steps - user navigated to Home Page");
	}


}

package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps_PF {


	@Given("TestProjDemo user is on login page")
	public void test_proj_demo_user_is_on_login_page() {
		System.out.println("Inside Step - user is on login page");
	}

	@When("TestProjDemo user enters username and password")
	public void test_proj_demo_user_enters_username_and_password() {
		System.out.println("Inside Step - user enters username and password");
	}

	@And("TestProjDemo user clicks on login button")
	public void test_proj_demo_user_clicks_on_login_button() {
		System.out.println("Inside Step - user clicks on login button");
	}

	@Then("TestProjDemo user is navigated to home page")
	public void test_proj_demo_user_is_navigated_to_home_page() {
		System.out.println("Inside Step - user is navigated to home page");
	}


}

package com.logins;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDefinition {
	LoginAction objLogin = new LoginAction();
	UtilityClass data = new UtilityClass();
	ProductAction objHome = new ProductAction();
	
	@Given("user click login")
	public void user_click_login() {
		objLogin.clickLoginPage();
		   System.out.println("Login Page");
	}

	@When("User enters valid email")
	public void user_enters_valid_email() {
		objLogin.login(data.strEmail);
		   System.out.println("Email");
	}

	@When("User enters valid password")
	public void user_enters_valid_password() {
		objLogin.login1(data.strPassword);
		   System.out.println("Password:");
	}

	@When("User click Login button")
	public void user_click_login_button() {
		objLogin.clickLoginButton();
		   System.out.println("login button");
	}

	@Then("User should be able to login successfully and navigates to the product page")
	public void user_should_be_able_to_login_successfully_and_navigates_to_the_product_page() {
		Assert.assertTrue(objHome.verifyText().contains("venk123@gmail.com"));
		   System.out.println("sucessfull login");
	}

	@Then("User should not be able to login and throws a error message")
	public void user_should_not_be_able_to_login_and_throws_a_error_message() {
		Assert.assertTrue(objHome.VerifyErrorMessage().contains("Login was unsuccessful. Please correct the errors and try again."));
		   System.out.println("sucessfull login");
	}
}

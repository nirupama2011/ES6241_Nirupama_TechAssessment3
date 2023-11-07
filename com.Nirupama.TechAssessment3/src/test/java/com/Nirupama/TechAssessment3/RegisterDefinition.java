package com.Nirupama.TechAssessment3;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterDefinition {
	RegisterAction regAction = new RegisterAction();
	
	
	@Given("User is on the Demo Webshop Application page")
	public void user_is_on_the_demo_webshop_application_page() {
	    System.out.println("In register page:");
	}
	@Given("User is in Main Page {string}")
	public void user_is_in_main_page(String string) {
	    System.out.println("in main page...");
	}
	@When("user clicks register")
	public void user_clicks_register() {
	    System.out.println("In register page...");
	}

	@When("user clicks for the correct gender")
	public void user_clicks_for_the_correct_gender() {
		System.out.println("Select gender:");
		regAction.selectMale();
		regAction.selectFemale();
	}
	@When("user enters valid firstname")
	public void user_enters_valid_firstname(io.cucumber.datatable.DataTable dataTable) {
		System.out.println("Enter Firstname: ");
	}

	@When("user enters valid lastname")
	public void user_enters_valid_lastname(io.cucumber.datatable.DataTable dataTable) {
	    System.out.println("Enter Lastname: ");
	}

	@When("user enters valid email")
	public void user_enters_valid_email(io.cucumber.datatable.DataTable dataTable) {
	   System.out.println("Enter email: ");
	}

	@When("user enters a valid password")
	public void user_enters_a_valid_password(io.cucumber.datatable.DataTable dataTable) {
	    System.out.println("Enter Password: ");
	}
	@When("user enters the password again")
	public void user_enters_the_password_again(io.cucumber.datatable.DataTable dataTable) {
	    System.out.println("Reter the Password: ");
	}
	@When("user clicks register button")
	public void user_clicks_register_button() {
	    System.out.println("User resgistration process is doen...");
	}    

	@Then("user checks for registration successful")
	public void user_checks_for_registration_successful() {
		
		   System.out.println("sucessfull login");
	}

}


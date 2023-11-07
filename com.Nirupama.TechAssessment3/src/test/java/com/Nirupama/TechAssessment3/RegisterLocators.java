package com.Nirupama.TechAssessment3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterLocators {
		
	@FindBy(xpath="//input[@id='gender-male']")
	public WebElement genderMale;
	
	@FindBy(xpath="//input[@id='gender-female']")
	public WebElement genderFemale;
	
	@FindBy(xpath="//input[@id='FirstName']")
	public WebElement firstName;
	
	@FindBy(xpath="//input[@id='LastName']")
	public WebElement lastName;
	
	@FindBy(xpath="//input[@id='Email']")
	public WebElement email;
	
	@FindBy(xpath="//input[@id='Password']")
	public WebElement passWord;
	
	@FindBy(xpath="//input[@id='ConfirmPassword']")
	public WebElement confirm;
	
	@FindBy(xpath="//input[@class='button-1 register-next-step-button']")
	public WebElement registerButton;
	
	@FindBy(xpath="//div[@class='result']")
	public WebElement success;
}

package com.logins;

import org.openqa.selenium.WebElement;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.support.FindBy;

public class ProductLocators {
	
	@FindBy(xpath="//a[text()='adhiganesh2@gmail.com']")
	public WebElement verifyName;
	
	@FindBy(xpath="//span[text()='Login was unsuccessful. Please correct the errors and try again.']")
	public WebElement verifyError;
	
}

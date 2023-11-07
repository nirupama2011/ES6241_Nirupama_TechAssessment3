package com.logins;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginLocators {
	@FindBy(xpath="/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")
	public WebElement login;
	
	
	@FindBy(xpath="//*[@id=\"Email\"]")
	public WebElement mail;
	
	@FindBy(xpath="//*[@id=\"Password\"]")
	public WebElement pass;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")
	public WebElement clickLogin;
}

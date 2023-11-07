package com.logins;

import org.openqa.selenium.support.PageFactory;

public class LoginAction {
	LoginLocators loginPageLocators=null;
	
	
	
	public LoginAction() {
		this.loginPageLocators=new LoginLocators();
		PageFactory.initElements(HelperClass.getDriver(), loginPageLocators);
	}
	public void clickLoginPage() {
		loginPageLocators.login.click();
	}
	public void setUserName(String strEmail) {
		loginPageLocators.mail.sendKeys(strEmail);
	}
	public void setPassword(String strPassword) {
		loginPageLocators.pass.sendKeys(strPassword);
	}
	
	public void clickLoginButton() {
		loginPageLocators.clickLogin.click();
	}
	
	public void login(String Email) {		
		
		this.setUserName(Email);
//		this.setPassword(password);
	}
	public void login1(String Password) {
		this.setPassword(Password);
	}
}

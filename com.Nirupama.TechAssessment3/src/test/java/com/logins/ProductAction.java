package com.logins;

import org.openqa.selenium.support.PageFactory;
import org.apache.logging.log4j.LogManager;

public class ProductAction {
	public static org.apache.logging.log4j.Logger log;
	ProductLocators proLoc ;
	
	public ProductAction(){
		
		proLoc = new ProductLocators();
		
		PageFactory.initElements(HelperClass.getDriver(), proLoc);
		
	}
	
	public String verifyText() {
		log = LogManager.getLogger(ProductAction.class);
		log.info("In user's Page...");
		return proLoc.verifyName.getText();
	}
	public String VerifyErrorMessage() {
		log = LogManager.getLogger(ProductAction.class);
		log.info("Entered user credentials is incorrect...");
		return proLoc.verifyError.getText();
		
	}
}

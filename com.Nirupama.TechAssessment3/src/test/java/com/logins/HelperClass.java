package com.logins;

import java.time.Duration;
import org.apache.logging.log4j.LogManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HelperClass {
	private static HelperClass helperClass;
	private static WebDriver driver;
	public static org.apache.logging.log4j.Logger log;
	
	private static WebDriverWait wait;
	public final static int TIMEOUT = 10;
		
	//constructor
	HelperClass(){
		log = LogManager.getLogger(HelperClass.class);
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
		log.info("Implicit wait is applied for 10 seconds");
		
	}
	
	public static void openPage(String url) {
		driver.get(url);
		log.info("In the demo webshop application...");
	}
	
	public static WebDriver getDriver() {
		return driver;		
	}
	
	public static void setUpDriver() {
		if(helperClass==null) {
			helperClass = new HelperClass();			
		}
	}
	
	public static void tearDown() {
		if(driver!=null) {
			driver.close();
			log.info("Quitted the driver");
			
		}
		helperClass=null;
		
	}
}

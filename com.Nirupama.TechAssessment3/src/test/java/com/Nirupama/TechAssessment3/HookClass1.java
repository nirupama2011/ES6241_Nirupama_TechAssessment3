package com.Nirupama.TechAssessment3;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.logins.HelperClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class HookClass1 {
	@Before
	public static void setUp() {
		HelperClass1.setUpDriver();
}
	@After
	public static void tearDown(Scenario scenario) {
		if(scenario.isFailed()) {
			
			final byte[] screenshot = ((TakesScreenshot) HelperClass1.getDriver()).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", scenario.getName());
		}
		HelperClass1.tearDown();
		
	}
}

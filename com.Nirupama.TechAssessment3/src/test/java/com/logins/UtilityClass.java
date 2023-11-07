package com.logins;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class UtilityClass {
	String strEmail,strPassword,strUrl;
	public UtilityClass(){
		credentials();
	}
	public void credentials() {
		File file = new File("C:\\Users\\nselvam2\\Assessment3\\com.Nirupama.TechAssessment3\\src\\test\\resources\\Features\\validdata.properties");
		
		FileInputStream fileInput = null;
		try {
			fileInput = new FileInputStream(file);
		} catch(FileNotFoundException e) {
			e.printStackTrace();			
		}
		
		Properties property = new Properties();
		
		try {
			property.load(fileInput);
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		strEmail = property.getProperty("Email");
		strPassword = property.getProperty("password");
	}
}

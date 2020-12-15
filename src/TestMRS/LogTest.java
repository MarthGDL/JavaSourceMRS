package TestMRS;

import org.testng.annotations.Test;

import ExcelDataReader.ExcelReader;

public class LogTest extends Start {
	
	@Test
	public void LogInTest() {
		
		//Log-in
		HomePage.OpenForm(driver);
		HomePage.FillSignInForm(driver);
		
		//Check if the user is in the Profile page
		HomePage.CheckSuccessfulLogIn(driver);
		
	}
	
	@Test
	public void JustChecking() {
		
		ExcelReader.tellMePath();
	}
	
}

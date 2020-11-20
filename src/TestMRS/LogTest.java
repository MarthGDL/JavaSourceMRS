package TestMRS;

import org.testng.annotations.Test;

public class LogTest extends Start {
	
	@Test
	public void LogInTest() {
		
		//Log-in
		HomePage.OpenForm(driver);
		HomePage.FillSignInForm(driver);
		
		//Check if the user is in the Profile page
		
		
	}
	
	@Test
	public void JustChecking() {
		
	}
	
}

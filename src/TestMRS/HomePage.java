package TestMRS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomePage {
	
	private static String signIn="//a[text()='Sign In']"; 
	private static String email="//input[@name='email']";
	private static String password="//input[@name='password']";
	private static String login="//button[text()='Login']";
	private static String editProfileDescription="//*[@id=\"account-profile-section\"]/div/section[2]/div/div/div/div[3]/div/div/div/h3/span/i";
	private static String profileDescription="//*[@id=\"account-profile-section\"]/div/section[2]/div/div/div/div[3]/div/div/div/span";
	
	private static String ValidAccount="limbo12_@hotmail.com";
	private static String ValidPassword="123123";
	private static String CorrectDescription="3 years as Oracle Developer and 2 years as Project Management Operations Lead";
	
	public static void SignIn(WebDriver driver) {
		
		//Opens the SignIn form and fills it with valid data
		OpenForm(driver);
		FillSignInForm(driver);
		
	}
	
	public static void OpenForm(WebDriver driver) {
		
		//Wait for the button to be available and clicks it
		WaitHelpers.WaitClickable(driver, driver.findElement(By.xpath(signIn)), 10);
		driver.findElement(By.xpath(signIn)).click();
		
	}
	
	public static void FillSignInForm(WebDriver driver) {
		
		//Fills the SignInForm
		driver.findElement(By.xpath(email)).sendKeys(ValidAccount);
		driver.findElement(By.xpath(password)).sendKeys(ValidPassword);
		
		//Clicks on the Login button
		driver.findElement(By.xpath(login)).click();
		
	}
	
	public static void CheckSuccessfulLogIn(WebDriver driver) {
		
		//Waits for the profile details to load
		WaitHelpers.WaitClickable(driver, driver.findElement(By.xpath(editProfileDescription)), 30);
		
		if(driver.findElement(By.xpath(profileDescription)).getText().equalsIgnoreCase(CorrectDescription)) {
			//Assert.pass();
		}else {
			Assert.fail();
		}
	}

}

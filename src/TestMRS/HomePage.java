package TestMRS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	private static String signIn="//a[text()='Sign In']"; 
	private static String email="//input[@name='email']";
	private static String password="//input[@name='password']";
	private static String login="//button[text()='Login']";
	
	private static String ValidAccount="limbo12_@hotmail.com";
	private static String ValidPassword="123123";
	
	public static void SignIn(WebDriver driver) {
		
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

}

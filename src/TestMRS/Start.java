package TestMRS;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Start {
	
public WebDriver driver;
	
	@BeforeTest
	public void SetUp() {
		
		//Locates the ChromeDriver.exe in the local files
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\limbo\\Documents\\Eclipse\\selenium\\chromedriver.exe");
						
		//Launches the Browser
		driver = new ChromeDriver();
						
		//Does some SetUp for the driver
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
						
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
		//Navigates to the portal
		driver.navigate().to(CommonHelpers.Url);
				
		//Thread.sleep(1000);
		
	}
	
	@AfterTest
	public void TearDown() {
		
		//Close the driver
		driver.close();	
		
	}
	
}

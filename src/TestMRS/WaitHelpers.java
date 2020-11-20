package TestMRS;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitHelpers {
	
	public static void WaitClickable(WebDriver driver,WebElement element, int seconds) {
		
		WebDriverWait wait=new WebDriverWait(driver,seconds);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		
	}
	
	public static void FluentWait(WebDriver driver) {
		
		Wait<WebDriver> fluentWait=new FluentWait<WebDriver>(driver)
				.withTimeout(30,TimeUnit.SECONDS).pollingEvery(5,TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);	
		
	}

}

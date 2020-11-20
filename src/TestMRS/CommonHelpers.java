package TestMRS;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class CommonHelpers {
	
	public static String Url="http://192.168.99.100:5000/";
	
	
	public static void HandleAlert(WebDriver driver, boolean accept) {
		
		Alert alert = driver.switchTo().alert();
		
		if(accept==true) {
			alert.accept();
		}else {
			alert.dismiss();
		}
		
	}

}

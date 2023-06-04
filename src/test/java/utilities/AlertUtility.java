package utilities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class AlertUtility {

	public static WebDriver driver;

	public AlertUtility(WebDriver driver) {
		this.driver = driver;
	}

	public static Alert alert() {
		return driver.switchTo().alert();
	}	

	public static void acceptAlert() {
		alert().accept();	
	}	

	public static void dismissAlert() {
		alert().dismiss();	
	}	

	public static String getAlertText() {
		String alert_text = alert().getText();
		return alert_text;
	}	

	public static void sendMessageToAlert(String message) {
		alert().sendKeys(message);
	}	

	public static boolean isAlertPresent(WebDriver driver) {
		try {
			driver.switchTo().alert();
			return true;
		} 
		catch (Exception e) {
			return false;
		}
	}
}

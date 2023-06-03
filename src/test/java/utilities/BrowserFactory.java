package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BrowserFactory {
	
	public static WebDriver driver;
	
	public static WebDriver startBrowser(String BrowserName, String url) {
		
		if(BrowserName.equalsIgnoreCase("firefox")) {
			
			driver = new FirefoxDriver();
		}
		
		else if(BrowserName.equalsIgnoreCase("chrome")) {
			
			driver = new ChromeDriver();
		}
		
		else if(BrowserName.equalsIgnoreCase("edge")) {
			
			driver = new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		
		driver.get(url);
		
		return driver;	
	}

}

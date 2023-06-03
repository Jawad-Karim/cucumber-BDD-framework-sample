package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//input[@name='uid']")
	WebElement user_name;
	
	@FindBy(how = How.XPATH, using = "//input[@name='password']")
	WebElement pass_word;
	
	@FindBy(how = How.XPATH, using = "//input[@name='btnLogin']")
	WebElement logButton;
	
	public void enter_userName(String uName) {
		
		user_name.sendKeys(uName);
		System.out.println("user name is entered");
	}
	
	public void enter_passWord(String pWord) {
		
		pass_word.sendKeys(pWord);
	}
	
	public void clickLogButton() {
		
		logButton.click();
	}

}

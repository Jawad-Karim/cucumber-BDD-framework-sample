package stepDefinitions;

import java.time.Duration;
import org.testng.Assert;

import io.cucumber.java.en.*;
import pages.BaseClass;
import pages.LoginPage;
import utilities.BrowserFactory;

public class LoginPageSteps extends BaseClass {

	public String url;	
	public LoginPage login;

	@Given("open browser and enter URL")
	public void open_website() {

		url = "https://demo.guru99.com/V4/index.php";		
		driver = BrowserFactory.startBrowser("chrome", url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		login = new LoginPage(driver);

	}

	@When("enter username as {string} in text box")
	public void enter_username_in_text_box(String userName) {		
		login.enter_userName(userName);

	}

	@When("enter password as {string} in text box")
	public void enter_password_in_text_box(String passWord) {	    
		login.enter_passWord(passWord);
	}

	@When("click on login button")
	public void click_on_login_button() {	    
		login.clickLogButton();
	}

	@Then("user should be logged in")
	public void user_should_be_logged_in() {

		String pageTitle = driver.getTitle();
		System.out.println("title : "+pageTitle);
		Assert.assertEquals("Guru99 Bank Manager HomePage", pageTitle);
		//driver.close();
	}
}

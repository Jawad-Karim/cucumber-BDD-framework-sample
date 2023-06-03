package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddNewCustomerPage {

	WebDriver driver;

	public AddNewCustomerPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//a[text()='New Customer']")
	WebElement newCustomer;

	@FindBy(how = How.XPATH, using = "//input[@name='name']")
	WebElement customerName;

	@FindBy(how = How.XPATH, using = "//input[@value='f']")
	WebElement genderFemale;

	@FindBy(how = How.XPATH, using = "//input[@value='m']")
	WebElement genderMale;

	@FindBy(how = How.XPATH, using = "//input[@id='dob']")
	WebElement birthDate;

	@FindBy(how = How.XPATH, using = "//textarea[@name='addr']")
	WebElement addrss;

	@FindBy(how = How.XPATH, using = "//input[@name='city']")
	WebElement cityName;

	@FindBy(how = How.XPATH, using = "//input[@name='state']")
	WebElement stateName;

	@FindBy(how = How.XPATH, using = "//input[@name='pinno']")
	WebElement pinNo;

	@FindBy(how = How.XPATH, using = "//input[@name='telephoneno']")
	WebElement telephone;

	@FindBy(how = How.XPATH, using = "//input[@name='emailid']")
	WebElement emailId;

	@FindBy(how = How.XPATH, using = "//input[@name='password']")
	WebElement passWord;

	@FindBy(how = How.XPATH, using = "//input[@name='sub']")
	WebElement submitButton;


	public void clickNewCustomer() {

		newCustomer.click();
	}

	public void enterCustomerName(String CName) {

		customerName.sendKeys(CName);
	}

	public void select_Female() {

		genderFemale.click();
	}

	public void select_kMale() {

		genderMale.click();
	}

	public void enterBirthDate(String mm, String dd, String yyyy) {

		birthDate.sendKeys(mm);
		birthDate.sendKeys(mm);
		birthDate.sendKeys(yyyy);
	}

	public void enterAddress(String adrs) {

		addrss.sendKeys(adrs);
	}

	public void enterCityNameF(String ct) {

		cityName.sendKeys(ct);
	}

	public void enterStateName(String stat) {

		stateName.sendKeys(stat);
	}

	public void enterPin(String pin) {

		pinNo.sendKeys(pin);
	}

	public void enterMobileNumber(String tphone) {

		telephone.sendKeys(tphone);
	}

	public void enterEmail(String eml) {

		emailId.sendKeys(eml);
	}

	public void enterPassWord(String pw) {

		passWord.sendKeys(pw);
	}

	public void clickSubmitButton() {

		submitButton.click();
	}

}

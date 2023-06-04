package stepDefinitions;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import pages.AddNewCustomerPage;
import pages.BaseClass;

public class AddNewCustomerSteps extends BaseClass{

	AddNewCustomerPage addCustomer = new AddNewCustomerPage(driver);
	List<Map<String, String>> userList;

	@When("User click on new customer")
	public void user_click_on_new_customers_menu() {	    
		addCustomer.clickNewCustomer();
	}
	
	@When("User select gender as male")
	public void user_select_gender_as_male() {

	}

	@When("User select gender as female")
	public void user_select_gender_as_female() {

	}

	@When("User enters following user details")
	public void user_enters_following_user_details(DataTable dataTable) {

		userList = dataTable.asMaps(String.class, String.class);      
		addCustomer.enterCustomerName(userList.get(0).get("customerName"));
		addCustomer.select_Female();

		String mm = userList.get(0).get("birthMonth");
		String dd = userList.get(0).get("birthDay");
		String yyyy = userList.get(0).get("birthYr");
		addCustomer.enterBirthDate(mm, dd, yyyy);

		addCustomer.enterAddress(userList.get(0).get("address"));
		addCustomer.enterCityNameF(userList.get(0).get("city"));
		addCustomer.enterStateName(userList.get(0).get("state"));
		addCustomer.enterPin(userList.get(0).get("PIN"));
		addCustomer.enterMobileNumber(userList.get(0).get("mobileNumber"));
		addCustomer.enterEmail(userList.get(0).get("email"));
		addCustomer.enterPassWord(userList.get(0).get("Password"));
	}

	@When("User click submit button")
	public void user_click_submit_button() {		
		addCustomer.clickSubmitButton();	    
	}

	@Then("new customer should be added successfully")
	public void new_customer_should_be_added_successfully() {	    
		System.out.println("new customer successfully");
	}	
}

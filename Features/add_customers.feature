Feature: Add a new customer

  Background: backround steps
    Given open browser and enter URL
    When enter username as "mngr506815" in text box
    And enter password as "dybunAr" in text box
    And click on login button
    Then user should be logged in

  @sanity
  Scenario Outline: Add new Customer
    When User click on new customer
    And User select gender as male
    And User select gender as female
    And User enters following user details
      | customerName | birthMonth | birthDay | birthYr | address   | city    | state | PIN  | mobileNumber | email         | Password |
      | Jawad Karim  |         11 |       24 |    1988 | 123 xy st | chicago | IL    | 123456 |    123456789 | abc@gmail.com | abc123   |
      | Paul John    |         09 |       21 |    1989 | 456 xy st | Detroit | MI    | 345678 |    129476789 | efg@gmail.com | xyz123   |
    And User click submit button
    Then new customer should be added successfully

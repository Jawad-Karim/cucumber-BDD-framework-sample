Feature: Bank Login page feature

  @login_test
  Scenario Outline: login to bank account
    Given open browser and enter URL
    When enter username as "<userName>" in text box
    And enter password as "<passWord>" in text box
    And click on login button
    Then user should be logged in

    Examples: 
      | userName   | passWord |
      | mngr506815 | dybunAr  |
      | kljbliskdl | dlsahlkh |
      | mngr506815 | dybunAr  |

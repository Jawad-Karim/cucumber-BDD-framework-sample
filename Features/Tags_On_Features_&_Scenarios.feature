@SignUp_Feature
Feature: ECommerce Application

  @SmokeTest @RegressionTest
  Scenario: Successful Login
    Given open browser for tags test

  @RegressionTest
  Scenario: UnSuccessful Login
    Given open browser for tags test

  @SmokeTest
  Scenario: Add a product to bag
    Given open browser for tags test

  Scenario: Add multiple product to bag
    Given open browser for tags test

  @SmokeTest @RegressionTest
  Scenario: Remove a product from bag
    Given open browser for tags test

  @RegressionTest
  Scenario: Remove all products from bag
    Given open browser for tags test

  @SmokeTest
  Scenario: Get product quantity from bag
    Given open browser for tags test

  @SmokeTest @End2End
  Scenario: Buy a product with cash payment
    Given open browser for tags test

  @SmokeTest @End2End
  Scenario: Buy a product with CC payment
    Given open browser for tags test

  @End2End
  Scenario Outline: Payment declined
    Given This is a blank test for tags test

    Examples: 
      | PaymentMethod |
      | CC Card       |
      | DD Card       |
      | Bank Transfer |
      | PayPal        |
      | Cash          |

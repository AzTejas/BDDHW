Feature: NopCommerce Registration
  Background:
    Given User able to open Browser
    And Enter an Url

  Scenario Outline: Nopcommerce Valid Login Test
    When User click on Login Link
    And User on Login Page and Verify Login page Title
    Then User enter "<Username>" and "<Password>" and Click on login button
    Then User is on Home Page and Verify Home page Title
    And User close the browser
    Examples:
      | Username |Password|
      | Test@gmail.com|Test123|
Feature: NopCommerce Registration
  Background:
    Given User able to open Browser
    And Enter an Url

    Scenario Outline: NopCommerce Registration Test
      When User Click on Register Link
      And User on Register Page and Verify Register page Title
      Then User select gender, "<FirstName>" and "<LastName>"
      Then User Select the their Date of Birth with "<BirthDay>" and "<BirthMonth>" and "<BirthYear>"
      Then User Enter their "<Email>" and "<Password>" and "<ConfirmPassword>" and Click on Register Button
      Then User is on Home Page and Verify Home Page Title
      And User Close the Browser
      Examples:
      |FirstName|LastName|BirthDay|BirthMonth|BirthYear|Email|Password|ConfirmPassword|
      |John       |Tucker|7       |August    |2000     |Test@gmail.com|Test123|Test123|

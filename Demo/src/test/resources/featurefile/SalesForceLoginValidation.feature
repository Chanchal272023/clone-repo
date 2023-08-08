Feature: As a user validates the login functionality in Salesforce

@LoginTest
  Scenario: error msg validaion in login
    Given User navigates to the "https://login.salesforce.com/"
    When User Enters the username "Chanchal" and password "123"
    And User clicks on login button
    Then User validates the error msg

  Scenario: login validation
    Given User navigates to the "https://login.salesforce.com/"
    When User Enters the username "Abhishek" and password "1234"
    And User clicks on login button
    Then User navigates to home page of application.

   @MultipleLoginTest
  Scenario Outline: login validation
    Given User navigates to the "https://login.salesforce.com/"
    When User Enters the username "<Username>" and password "<Password>"
    And User clicks on login button
    Then User navigates to home page of application.
    Examples:
      | Username | Password |
      | Chanchal | Kumari   |
      | Abhishek | Agarwal  |


  @StaticDropDown
    Scenario: Static drop down
    Given User selects the currency dropdown

   @DynamicDropDown
   Scenario: Dynamic drop down
     Given User handles the dynamic drop down

@MouseHover
Scenario:Handles Mouse hover
  Given User click and holds the mouse

  @Hyperlink
  Scenario: Open hyperlink in different browser
    Given Handle the hyperlink
    @AfterStep

    @CheckBox
    Scenario: Selects Checkbox
      Given Handle the checkbox
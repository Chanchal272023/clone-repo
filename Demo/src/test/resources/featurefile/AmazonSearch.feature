Feature: Usr validates the Amazon search
@Search
 Scenario: User Validates the search function with specific value
   Given User navigates to "https://www.amazon.in/"
   When User enters the "iphone" in search bar
   And User clicks on search
   Then User validates the search result

@MultipleSearch
  Scenario Outline: User Validates the search function with specific value
    Given User navigates to "https://www.amazon.in/"
    When User enters the "<Product Name>" in search bar
    And User clicks on search
    Then User validates the search result
    Examples:
      | Product Name |
      | iphone       |
      | books        |
      | dress        |


  @SearchProperties
Scenario: User navigates to search by Properies
  Given User navigates to amazon home page
  When User enter the search key
  And User clicks
  Then User validates the result

@SearchCondition
Scenario: User navigates to search by condition
  Given User enters the product and navigates to search result page
  When User clicks on the sort by newest arrivals condition
  Then User validates the newest arrival result condition

@AmazonLogin
Scenario: User navigates to login page
  Given user navigates to signin page
  When User enters the email and password
  And User clicks on signIn button
  Then User validates the signin Page



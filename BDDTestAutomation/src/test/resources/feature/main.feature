@FullSuite
Feature: Customers

  Background: Logging in
    Given User is on Login Page
    When user enters the correct email and password
    And clicks on login button
    Then Home Page should be displayed.

  @add_new_customers
  Scenario: Add New Customer
    Given User is on Home Page
    When User click on customers Menu
    And click on customers Menu Item
    And click on Add new button
    Then User can view Add new customer page
    When User enter customer info
    And click on Save button
    Then User can view confirmation message

  @serch_customer_by_Email
  Scenario Outline: Search Customer by Email
    Given User is on '<app>' Login Page
    When User click on customers Menu
    And click on customers Menu Item
    And Enter customer EMail
    Then Click on search button

    Examples: 
      | app          |
      | Nop Commerce |

  @serch_customer_by_name
  Scenario: Search Customer by Email
    Given User is on Home Page
    When User click on customers Menu
    And click on customers Menu Item
    And Enter customer FirstName
    And Enter customer LastName
    Then Click on search button

  @accessing_online_customers
  Scenario: Accessing online customers
    Given User is on Home Page
    When User click on customers Menu
    And click on online customers Menu Item

  @accessin_activity_logs
  Scenario: Accessing activity logs
    Given User is on Home Page
    When User click on customers Menu
    And click on activity types Menu Item

  @accessing_available_stores
  Scenario: Accessing the available stores
    Given User is on Home Page
    When User click on configuration Menu
    And click on stores Menu Item

  Scenario: Accessing the available payment methods
    Given User is on Home Page
    When User click on configuration Menu
    And click on payment methods Menu Item

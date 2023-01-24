@FullSuite
Feature: Login

  @title_verification
  Scenario Outline: Login Page Title verification
    Given User is on '<app>' Login Page
    Then Page Title should be "Your store. Login"

    Examples: 
      | app          |
      | Nop Commerce |

  @valid_login
  Scenario Outline: Successful Login with Valid Credentials
    Given User is on '<app>' Login Page
    When user enters the correct email and password
    And clicks on login button
    Then Home Page should be displayed.

    Examples: 
      | app          |
      | Nop Commerce |

  @invalid_login
  Scenario Outline: Login with Inalid Credentials DDT
    Given User is on '<app>' Login Page
    When user enters the incorrect email and password
    And clicks on login button
    Then error message should be displayed.

    Examples: 
      | app          |
      | Nop Commerce |

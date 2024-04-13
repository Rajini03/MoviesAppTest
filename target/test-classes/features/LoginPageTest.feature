Feature: Test the login page of Movies App

  As a user of the Movies App
  I want to test all the Login page UI and Functionalities
  So that I can view the expected output and when
  I enter the valid username and password then
  I can log in to the Movies App

  Scenario: Test the Login Page UI

    Given I am on the Movies App Page
    When I test the login website logo is displayed and I get the expected output
    Then I test the sign in heading text and I get the expected output
    When I test the USERNAME text and I get the expected output
    Then I test the PASSWORD text and I get the expected output

  Scenario: Test the Login Page Functionalities

    Given I am on the Movies App Page
    When I test the login with out inputs and I get this '*Username or password is invalid' error message
    And I test the with empty username and I get this '*Username or password is invalid' error message
    When I test the with empty password and I get this '*Username or password is invalid' error message
    When I enter the invalid username and password then I get this '*username and password didn't match' error message
    When I enter the valid username and password
    Then I successfully login to the Movies App

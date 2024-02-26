Feature: Test the Account Page in the Movies App

  As a user of Movies App
  I want login to Movies App with valid inputs and
  I click on the Account Image then test the membership Details and
  I test the Account Page with all UI elements present on the web page and
  I test the logout Functionality

  Scenario: Test the Account Page

    Given I log in to the Home Page with given valid inputs
    When I click on Account image and test all the UI elements present on the web page
    Then I test all the plan details
    And I test the logout Functionality
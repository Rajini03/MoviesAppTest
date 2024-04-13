Feature: Test the Movie Details Page in Movies App

  As a user of Movie App
  I want login to the Movie App with valid inputs and
  I test in the Home Page click on any Movie and test all the UI elements present in it and
  In the Popular Page click on any Movie and test all the UI elements present in it


  Scenario: I test in the Home Page click on any Movie and test all the UI elements present in it

    Given I log in to the Home Page with given valid inputs
    When I click on the Avatar image then I can test home page UI elements
    And I test the play button and list of all images whether displayed or not and test the Contact Us Section


  Scenario: I test in the Popular Page click on any Movie and test all the UI elements present in it

    Given I log in to the Home Page with given valid inputs
    When I click on the Popular link then I can test Popular page UI elements
    And I test the play button and list of all images whether displayed or not and test the Contact Us Section



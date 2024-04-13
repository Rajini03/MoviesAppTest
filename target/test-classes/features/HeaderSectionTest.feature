Feature: Test the Header Section UI and Functionalities in the Movies App

  As a user of Movies App
  I want login to the Movies App and with valid inputs and
  I want to test the Header section UI and Functionalities then
  I can view the expected output

  Scenario: Test the Header section UI

    Given I log in to the Home Page with given valid inputs
    When I test the website logo is displayed or not
    And I test the navigation element texts


  Scenario: Test the Header Section Functionalities

    Given I log in to the Home Page with given valid inputs
    When I click on the navigation links then I navigate to corresponding link
    Then I click on the Avatar Image and I navigate to it

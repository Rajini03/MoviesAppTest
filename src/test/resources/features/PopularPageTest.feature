Feature: Test the Popular Page In Movies App

  As a user of Movies App
  I want log in to the Movies App with valid inputs and
  I want to navigate to Popular link then
  I want to test whether the movies are displayed

  Scenario: Test the Popular Page
    Given I log in to the Home Page with given valid inputs
    When I click on a Popular link and navigate to it
    Then I test whether the movies are displayed or not

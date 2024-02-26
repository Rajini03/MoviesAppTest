Feature: Test the Search Page Functionalities in Movies App

  As a user of Movies App
  I want log in to Movies App with valid inputs and
  I test the Search functionality by searching with some movie names and
  The count of movies displayed

  Scenario: Test the Search functionality
    Given I log in to the Home Page with given valid inputs
    When I click on the Popular link and click on search bar
    Then I send some movie names so that I get those movies by click on searching button
    And the size of the list of searched movies has arrived
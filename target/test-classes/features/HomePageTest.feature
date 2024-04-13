Feature: Test all the Functionalities in the Home Page

  As a user of the Movie App
  I want login to Home page and
  I want to test all the Home page UI Functionalities then
  I can view the expected output

  Scenario: test the Home Page

    Given I log in to the Home Page with given valid inputs
    When I test the heading text of all the sections displayed
    Then I test whether the play button is displayed or not
    And I test whether the Movies are displayed, in the corresponding movies sections
    Then I test the Contact Us Section
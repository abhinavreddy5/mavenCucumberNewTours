Feature: Title of your feature
  I want to use this template for my feature file

  @newtours
  Scenario: Filling Form in NewTours website
    Given I navigate to newtours
    And I click "Register"
    Then I fill the form with data
      | Fields     | Value        |
      | First_Name | Saparna      |
      | Last_Name  | Tummalapally |
      | Country    | India        |
    Then I close the browser

 @support
  Scenario: Clicking on Support and getting back to Home
    Given I navigate to newtours
    Then I Click on support
     And I click on Back
    Then I close the browser
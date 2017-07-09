
Feature: Title of your feature
  I want to use this template for my feature file

   @google
  Scenario Outline: Sending data to Google home Page Text Box
    Given I open the Home Page
    Then I Enter the text data "<text>"
    Then I close the browser

    Examples: 
      | text                    |
      | Hey There               |
      | Hey There, How are You? |


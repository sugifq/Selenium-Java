Feature: Chart
  Scenario: Add to chart
    Given I Open browser
    And Open website saucedemo
    And Located on saucedemo website
    When I input valid username
    When I input valid password
    Then I go to homepage
    Then I add backpack to chart
    Then I checkout
    Then I fill checkout information
    Then I finish checkout
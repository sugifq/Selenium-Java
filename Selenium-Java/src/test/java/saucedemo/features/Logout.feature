Feature: Logout
  Scenario: Successfully logout
    Given I Open browser
    And Open website saucedemo
    And Located on saucedemo website
    When I input valid username
    When I input valid password
    Given I go to homepage
    When I click menu
    And I click logout link
    Then I go to login page
    Then I close browser
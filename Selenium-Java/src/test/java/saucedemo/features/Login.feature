Feature: Login
  Scenario: Successful login
    Given I Open browser
    And Open website saucedemo
    And Located on saucedemo website
    When I input valid username
    When I input valid password
    Then I go to homepage


  Scenario: Failed login
    And Open website saucedemo
    And Located on saucedemo website
    When I input valid username
    When I input invalid password
    Then I get error login message
    Then I close browser
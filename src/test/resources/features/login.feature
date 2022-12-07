Feature: Login
  Scenario: login as admin with valid email and password
    Given User already on login page
    When User input "admin@bengcall.com" as email and "adminbengcall123" as password
    Then User click login button
    And User redirect to dashboard and show message "You're logged in"

  Scenario: login as admin with empty email and valid password
    Given User already on login page
    When User input "" as email and "adminbengcall123" as password
    Then User click login button
    And user will see pop up message "Email should not be empty"

  Scenario: login as admin with valid email and empty password
    Given User already on login page
    When User input "admin@bengcall.com" as email and "" as password
    Then User click login button
    And user will see pop up message "Password should not be empty"

  Scenario: login as admin with empty email and empty password
    Given User already on login page
    When User input "" as email and "" as password
    Then User click login button
    And user will see pop up message "Email should not be empty"
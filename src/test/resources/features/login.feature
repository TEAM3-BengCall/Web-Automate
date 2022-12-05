Feature: Login
  Scenario: login as admin with valid email and password
    Given User already on login page
    When User input "admin@bengcall.com" as email and "adminbengcall123" as password
    Then User click login button
    And User redirect to dashboard and show message "You're logged in"
Feature: get detail transaction
  Background: user must login as admin
    Given User already on login page
    When User input "admin@bengcall.com" as email and "adminbengcall123" as password
    Then User click login button
    And User redirect to dashboard and show message "You're logged in"

  Scenario: user get detail transaction
    Given user already on dashboard page
    When user click on detail transaction button
    Then user redirect to detail transaction page
    And user see form transaction with "Address"  "Service Type" and "Total Price"
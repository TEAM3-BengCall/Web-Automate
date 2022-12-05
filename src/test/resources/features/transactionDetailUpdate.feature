Feature: update transaction
  Background: User mush login as admin and already on page detail transaction
    Given User already on login page
    When User input "admin@bengcall.com" as email and "adminbengcall123" as password
    Then User click login button
    And User redirect to dashboard and show message "You're logged in"

  Scenario: user get detail transaction and add some service
    Given user already on dashboard page
    When user click on detail transaction button
    Then user redirect to detail transaction page
    And user see form transaction with "Address"  "Service Type" and "Total Price"
    Then user already on detail transaction page
    When user input "Ganti Lampu" in service type and 125000 in Add priece field
    Then user click submit update transaction
    And pop up message will showed and click OK
    And user will see note under detail transaction contain "Note: Additional price for Ganti Lampu"

  Scenario: user update status service to Order Confirmed
    Given user already on dashboard page
    When user choose status "Order Confirmed"
    Then message "Status change" will showed

  Scenario: user update status service to Mechanic on the way
    Given user already on dashboard page
    When user choose status "Mechanic on the way"
    Then message "Status change" will showed

  Scenario: user update status service to Service in progress
    Given user already on dashboard page
    When user choose status "Service in progress"
    Then message "Status change" will showed

  Scenario: user update status service to Service done
    Given user already on dashboard page
    When user choose status "Service done"
    Then message "Status change" will showed

  Scenario: user update status service to Waiting for payment confirmation
    Given user already on dashboard page
    When user choose status "Waiting for payment confirmation"
    Then message "Status change" will showed

  Scenario: user update status service to Payment done
    Given user already on dashboard page
    When user choose status "Payment done"
    Then message "Status change" will showed
Feature: ServiceType Feature
  Scenario: ServicType Feature Validation
    Given User already on login page
    When User input "admin@bengcall.com" as email and "adminbengcall123" as password
    Then User click login button
    And User redirect to dashboard and show message "You're logged in"
    And User Click Ok
    Then Admin Click Service Type Button
    Then Admin Click Add Vehicle Button
    And Admin Input Vehicle type "Astut 110 CC"
    And Admin Click Submit Button
    And Admin Succsessfully Add New Service Type Created

    Scenario: Cancel Button Validation On add Vehicle Menu
      Given User already on login page
      When User input "admin@bengcall.com" as email and "adminbengcall123" as password
      Then User click login button
      And User redirect to dashboard and show message "You're logged in"
      And User Click Ok
      Then  Admin Click Service Type Button
      Then  Admin Click Add Vehicle Button
      And Admin Click Cancel Button
      And Admin Go Back to Vehicle Menu

      Scenario: Edit Service Validation On Service Type Menu
        Given User already on login page
        When User input "admin@bengcall.com" as email and "adminbengcall123" as password
        Then User click login button
        And User redirect to dashboard and show message "You're logged in"
        And User Click Ok
        Then  Admin Click Service Type Button
        Then  Admin Click Edit Service Button
        And Admin Click Vehicle Type Button
        And Admin Choose One Type of Vehicle
        Then Admin Input Service Type "Change Oil"
        Then Admin Input Price "45000"
        And Admin click Submit Button
        And Admin Click OK Button

        Scenario: Cancel Button Validation On Edit Service Menu
        Given User already on login page
        When User input "admin@bengcall.com" as email and "adminbengcall123" as password
        Then User click login button
        And User redirect to dashboard and show message "You're logged in"
        And User Click Ok
        Then  Admin Click Service Type Button
        Then  Admin Click Edit Service Button
          And Admin Click Cancel Button On Edit Service Menu
          And Admin Go Back to Vehicle Menu

          Scenario: Delete Service On Service type Menu
            Given User already on login page
            When User input "admin@bengcall.com" as email and "adminbengcall123" as password
            Then User click login button
            And User redirect to dashboard and show message "You're logged in"
            And User Click Ok
            Then  Admin Click Service Type Button
            And  Admin Click Bean Icon Button
            Then Vehicle clear

            Scenario: Edit Service With Leave All Field
              Given User already on login page
              When User input "admin@bengcall.com" as email and "adminbengcall123" as password
              Then User click login button
              And User redirect to dashboard and show message "You're logged in"
              And User Click Ok
              Then  Admin Click Service Type Button
              Then  Admin Click Edit Service Button
              And Admin click Submit Button
              And Failed Massage Will be Showed "failed to add service"
              And Admin click OK

              Scenario: Add Vehicle With Leave all field
                Given User already on login page
                When User input "admin@bengcall.com" as email and "adminbengcall123" as password
                Then User click login button
                And User redirect to dashboard and show message "You're logged in"
                And User Click Ok
                Then Admin Click Service Type Button
                Then Admin Click Add Vehicle Button
                And Admin Click Submit Button
                And Failed Massage Will be Showed





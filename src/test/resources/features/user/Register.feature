Feature: Register account customer

  Scenario Outline: Register customer
    Given User already on main page
    And User click signup button
    When User already on "Sign Up" page
    And User click on field full name for input <fullname>
    And User click on field email for input email <email>
    And User click on field password for input password <password>
    And user click signup button for end registeration
    Then user seeing popup success created new user
    Examples:
      | fullname | email                     | password      |
      | "Yuna"   | "yunakusuma122@gmail.com" | "bengcall123" |

  Scenario Outline: Register customer without @ for email
    Given User already on main page
    And User click signup button
    When User already on "Sign Up" page
    And User click on field full name for input <fullname>
    And User click on field invalid email for input email <email>
    And User click on field password for input password <password>
    And User click signup
    Then User seeing popup "Account already exist"
    And click ok for re-registration
    Examples:
      | fullname        | email    | password     |
      | "Syawalludin12" | "teesst" | "testae1234" |


  Scenario Outline: Register customer without numerik
    Given User already on main page
    And User click signup button
    When User already on "Sign Up" page
    And User click on field full name for input <fullname>
    And User click on field email for input email <email>
    And User click on field invalid password for input password <password>
    And User click signup
    Then User seeing popup "Account already exist"
    And click ok for re-registration
    Examples:
      | fullname        | email              | password |
      | "Syawalludin12" | "teesst@gmail.com" | "testae" |

  Scenario Outline: Register customer with password less then 8 character
    Given User already on main page
    And User click signup button
    When User already on "Sign Up" page
    And User click on field full name for input <fullname>
    And User click on field email for input email <email>
    And User click on field invalid password for input password <password>
    And User click signup
    Then User seeing popup "Account already exist"
    And click ok for re-registration
    Examples:
      | fullname        | email             | password |
      | "Syawalludin12" | "tuser@gmail.com" | "tes12"  |
Feature: Edit profile customer

  Background: Login customer
    Given User already on "Sign In" page
    When User input email "syawalludin@gmail.com" and password "syawal123"
    And User click signin button for login
    Then Seeing text "You're logged in"
    And User click OK

  Scenario Outline: Update profile
    Given User already on home page
    And User click icon profile
    And User click my profile
    When User already on update profile
    And User click on field full name for input <fullname>
    And User click on field email for input email <email>
    And User click on field password for input password <password>
    And User click button submit for update profile
    Then User seeing popup "Success Change Profile"
    And User click OK
    Examples:
      | fullname      | email                   | password    |
      | "syawalludin" | "syawalludin@gmail.com" | "syawal123" |

  Scenario Outline: Update profile without @ for email
    Given User already on home page
    And User click icon profile
    And User click my profile
    When User already on update profile
    And User click on field full name for input <fullname>
    And User click on field email for input email <email>
    And User click on field password for input password <password>
    And User click button submit for update profile
    Then User seeing popup "Wrong email"
    And User click OK
    Examples:
      | fullname      | email         | password    |
      | "syawalludin" | "syawalludin" | "syawal123" |

  Scenario Outline: Update password less than 8 character
    Given User already on home page
    And User click icon profile
    And User click my profile
    When User already on update profile
    And User click on field full name for input <fullname>
    And User click on field email for input email <email>
    And User click on field password for input password <password>
    And User click button submit for update profile
    Then User seeing popup "password to short"
    And User click OK
    Examples:
      | fullname      | email                   | password |
      | "syawalludin" | "syawalludin@gmail.com" | "tes12"  |

  Scenario Outline: Update password without number
    Given User already on home page
    And User click icon profile
    And User click my profile
    When User already on update profile
    And User click on field full name for input <fullname>
    And User click on field email for input email <email>
    And User click on field password for input password <password>
    And User click button submit for update profile
    Then User seeing popup "Password must contain numbers"
    And User click OK
    Examples:
      | fullname      | email                   | password |
      | "syawalludin" | "syawalludin@gmail.com" | "testae" |


  Scenario: User change photo profile
    Given User already on home page
    And User click icon profile
    And User click my profile
    When User already on update profile
    And User click button Choose file for upload file
    And User click button submit for update profile
    Then User seeing popup "Success Change Profile"
    And User click OK

  Scenario: Delete account customer
    Given User already on home page
    And User click icon profile
    And User click my profile
    When User already on update profile
    And click Dectivate
    Then alert massage


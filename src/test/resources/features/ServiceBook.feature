@ServiceUser
Feature: Booking Service
  User want a booking service

Background:
  Given User already open the web page
  When User input "destiana00@gmail.com" as Username and "destiana00" as Password
  Then User already on homepage
  When User click on Service Now button
  And Booking Service form will appear

Scenario Outline: User can create service booking
  When User input "<phone>" on phone field
  When User input "<address>" on address field
  When User input date "<date>" on booking date
  When User input month "<month>" on booking date
  When User input year "<year>" on booking date
  When User select "<location>" on service location field
  When User select "<vehicle>" on vehicle type
  When User select first service "<service>" on service type field
  When User input "<other>" on other request field
  Then User click Submit button
  Then a message will appear "Service Booked"
  Then User click OK button and refresh homepage
  And User click Detail button and get detail service booked
  Examples:
    | phone        | address                | date | month | year | location     | vehicle       | service      | other                         |
    | 081255559071 | Jalan Pramuka Raya 123 | 20   | 12    | 2022 | Home Service | 125cc - Supra | Full Service | Please check the front brakes |

Scenario Outline: User create service booking without input form data
  When User input "<phone>" on phone field
  When User input "<address>" on address field
  When User input date "<date>" on booking date
  When User input month "<month>" on booking date
  When User input year "<year>" on booking date
  When User select "<location>" on service location field
  When User select "<vehicle>" on vehicle type
  When User select first service "<service>" on service type field
  When User input "<other>" on other request field
  Then User click Submit button
  Then a message will appear "failed to book"
  Examples:
    | phone        | address                | date | month | year | location     | vehicle       | service      | other                         |
    |              | Jalan Pramuka Raya 123 | 20   | 12    | 2022 | Home Service | 125cc - Supra | Full Service | Please check the front brakes |
    | 081255559071 |                        | 20   | 12    | 2022 | Home Service | 125cc - Supra | Full Service | Please check the front brakes |
    | 081255559071 | Jalan Pramuka Raya 123 |      |       |      | Home Service | 125cc - Supra | Full Service | Please check the front brakes |

Scenario Outline: User create service booking without select item form data
  When User input "<phone>" on phone field
  When User input "<address>" on address field
  When User input date "<date>" on booking date
  When User input month "<month>" on booking date
  When User input year "<year>" on booking date
  When User select "<location>" on service location field
  When User select "<vehicle>" on vehicle type
  When User select first service "<service>" on service type field
  When User input "<other>" on other request field
  Then User click Submit button
  Then a message will appear "failed to book"
  Examples:
    | phone        | address                | date | month | year | location     | vehicle       | service      | other                         |
    | 081255559071 | Jalan Pramuka Raya 123 | 20   | 12    | 2022 |              | 125cc - Supra | Full Service | Please check the front brakes |
    | 081255559071 | Jalan Pramuka Raya 123 | 20   | 12    | 2022 | Home Service |               | Full Service | Please check the front brakes |
    | 081255559071 | Jalan Pramuka Raya 123 | 20   | 12    | 2022 | Home Service | 125cc - Supra |              | Please check the front brakes |


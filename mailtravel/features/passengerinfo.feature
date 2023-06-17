Feature: User should able to enter passenger info Successfully

  Scenario: Enter passenger info Successfully with valid credentials
    Given User should launch "chrome" browser
    When User launch the "https://www.mailtravel.co.uk/"
    Then User click on Accept Cookies
    And User type holiday in searchbox"India"
    Then User select first option of serchbox recommendations
    And navigate to "https://www.mailtravel.co.uk/holiday/india-f0050aa159413059b0d39248658bdb50"
    Then User scroll down
    And User choose 2 adults
    And User select first available date
    Then User validate the price caluculation
    Then User click on book online button
    Then User navigate to holiday accommodation application url"https://www.mailtravel.co.uk/holiday/1f5c2c3e-0c48-11ee-aaeb-20677cd381a0"
    Then User expand Date,Departure and passenger section
    And User verify the details are validated
    Then User click as room required"1"
    Then User click on Select your room and continue button
    Then User Navigate to Passenger details Application
    Then User enter Passenger info
    And user click on continue button
    Then user navigate to confirm details and book application url ""https://www.mailtravel.co.uk/payment.php?1f5c2c3e-0c48-11ee-aaeb-20677cd381a0""

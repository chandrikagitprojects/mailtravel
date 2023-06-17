Feature: User should able to book the holiday accommodation Successfully
  Scenario:Book Holiday Accommodation Successfully with valid credentials
    Given User should lauch "chrome" browser
    When  User launch the "https://www.mailtravel.co.uk/holiday/india-f0050aa159413059b0d39248658bdb50"
    Then  User click on Accept Cookies
    And  User type india in searchbox
    Then User select first option of serchbox recommendations
    And navigate to "https://www.mailtravel.co.uk/holiday/india-f0050aa159413059b0d39248658bdb50"
    Then User scroll down
    And User choose 2 adults
    And User select first available date
    Then User validate the price caluculation
    Then User click on book online button
    Then User expand Date,Departure and passenger section
    And User verify the details are validated
    Then User click as room required"1"
    Then User click on Select your room and continue button
    Then User Navigate to Passenger details
    
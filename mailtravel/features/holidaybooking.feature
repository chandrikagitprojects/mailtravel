Feature: User should able to book the holiday place Successfully

  Scenario: Book Holiday Successfully on Online booking page with valid credentials
    Given User should lauch "chrome" browser
    When User launch the "https://www.mailtravel.co.uk/holiday/india-f0050aa159413059b0d39248658bdb50"
    Then User click on Accept Cookies
    And User type india in searchbox
    Then User select first option of serchbox recommendations
    And navigate to "https://www.mailtravel.co.uk/holiday/india-f0050aa159413059b0d39248658bdb50"
    Then User scroll down
    And User choose 2 adults
    And User select first available date
    Then User validate the price caluculation
    Then User click on book online button
    Then User navigate to holiday accommodation application url"https://www.mailtravel.co.uk/holiday/1f5c2c3e-0c48-11ee-aaeb-20677cd381a0"

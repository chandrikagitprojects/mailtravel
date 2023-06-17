Feature: User should able to select the Holiday place Successfully

  Scenario: Choose Holiday Successfully on mailtravel with valid credentials
    Given User should launch "chrome" browser
    When User launch the "https://www.mailtravel.co.uk/"
    Then User click on Accept Cookies
    And User type holiday in searchbox"India"
    Then User select first option of serchbox recommendations
    And navigate to "https://www.mailtravel.co.uk/holiday/india-f0050aa159413059b0d39248658bdb50"

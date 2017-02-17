Feature: As a User
  I want to register with Swaraj India
  so that I can login to Swaraj India website

  Scenario: As a new user I want to register with Swaraj india website
    Given that SwarajIndia website is open
    When I register with valid data




Scenario: something
    Given that i am a user
    When I enter www.docker.com
    And I start registration process
    And I close browser

  Scenario: Check if data provider is working
    Given dataProvider prints users data for ValidNonNri
    Given dataProvider prints users data for ValidNri

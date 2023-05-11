Feature: pricing package
  In order to see all Countries Packages
  As a new user
  I want to see all pricing Packages

  Scenario: check Oman Pricing Packages
    Given user is in the Home PAge
    When user choose Oman as a Country
    Then the User Can See All the Pricing Packages

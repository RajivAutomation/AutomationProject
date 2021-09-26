@SmokeFeature
Feature: Feature to login functionality

@smoketest
  # A Feature can have a multiple scenario
  Scenario: Check login is successful with valid credentials
    # Now, we have to create the steps with 'Gherkin Language'. For this, we have keywords -> Given, When, And, Then

    Given user is on login page
    When user clicks enters username and password
    And clicks on login button
    Then user is navigated to the home page
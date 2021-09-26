Feature: feature to test google search functionality

  Scenario: Validate Google Search is working
    #in Gherkin Language "And" can be used anywhere, so we will use twice
    Given Broswer is open
    And user is on Google Search page
    When user enters a text in search box
    And hits enter button
    Then user is navigated to the search results

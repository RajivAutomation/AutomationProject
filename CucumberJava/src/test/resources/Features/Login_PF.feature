Feature: Test Login functionality

  Scenario Outline: Check Login is successful with valid credentials
    Given TestProjDemo browser is open
    And TestProjDemo user is on login page
    When TestProjDemo user enters <username> and <password>
    And TestProjDemo user clicks on login button
    Then TestProjDemo user is navigated to home page

    Examples: 
      | username                    | password |
      | coolbloggerforyou@gmail.com |    12345 |
      | imbeginner1@gmail.com       |    12345 |

Feature: Test Login Functionality

  Scenario Outline: Check Login is successful with valid credentials
    Given application browser is open
    And application user is on login page
    When application user enters <username> and <password> 
    And application user clicks on login
    Then application user is navigated to home page

    Examples: 
      | username                    | password |
      | coolbloggerforyou@gmail.com | Abc12345 |
      | imbeginner1@gmail.com       | Test@123 |

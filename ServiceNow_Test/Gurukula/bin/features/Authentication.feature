@SmokeTest

Feature: Authentication
  
  As a Gurukula user, I should be able to login sucessfully

  Scenario Outline: User Authentication
    Given I launch the Gurukula Application
    When I click on Login
    And I enter the login details "<login>" and "<password>"
    Then login should be done sucessfully

    Examples: 
      | login |  | password |
      | admin |  | admin    |
      | Test  |  | Test     |
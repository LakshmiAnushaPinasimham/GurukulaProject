 @SmokeTest
 
 Feature: Logout from Gurukula app
 
  As a Gurukula user, I should be able to logout once logged in sucessfully
  
  Scenario: User Logout
    Given I launch the Gurukula Application
    When I click on Login
    And I enter the login details "admin" and "admin"
    When I click on Logout
    Then logout should be done sucessfully
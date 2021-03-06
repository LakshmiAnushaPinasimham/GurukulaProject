@RegressionTest

Feature: Change Password
  
  As a Gurukula user, I should have the feasibility to change my password on request
  
  Background:
  
    Given I launch the Gurukula Application
    When I click on Login
    And I enter the login details "admin" and "admin"
    And I click on Entities to Password to change my password   

@ChangePassword
  Scenario: Change Password
    And I enter new password details "adminis" and "adminis"
    Then new password should be created
    When I login with new Passowrd
    Then I should be able to login successfully

@WrongPassword
  Scenario: Wrong Password
    And I enter new password details "adminis" and "admini"
    Then new password should not be created
@RegressionTest

Feature: Branches
  
  As a Gurkula user, I should be able to create Branch

  Scenario: Create Branch
    Given I launch the Gurukula Application
    When I click on Login
    And I enter the login details "admin" and "admin"
    And I click on Entities to create Branch
    And I filled the branch details
      | Name  |  | Code  |
      | Maths |  | MAT04 |
    Then Branch should be created sucessfully

  Scenario: View Branch Details
    When I click on View
    Then I should be able to see branch details

  Scenario: Edit Branch Details
    When I click on Back
    And I click on Edit and enter my new branch details
      | Name   |  | Code  |
      | Social |  | SOC04 |
    Then new branch details should be replaced with old

  Scenario: Delete Branch
    When I click on Delete
    Then Branch should get deleted
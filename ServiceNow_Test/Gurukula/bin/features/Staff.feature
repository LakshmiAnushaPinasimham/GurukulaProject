@RegressionTest

Feature: Staff
  
  As a Gurkula user, I should be able to create staff details

  Scenario: Create Staff
    Given I launch the Gurukula Application
    When I click on Login
    And I enter the login details "admin" and "admin"
    And I click on Entities to create Branch
    And I filled the branch details
      | Name  |  | Code  |
      | Maths |  | MAT04 |
    And I click on Entities to create Staff
    And I filled the Staff details
      | Name   |  | Branch |
      | Anusha |  | Maths  |
    Then Staff details should be created sucessfully

  Scenario: View Staff Details
    When I click on View
    Then I should be able to see staff details

  Scenario: Edit Branch Details
    When I click on Back
    And I click on Edit and enter my new staff details "Ramesh"
    Then new staff details should be replaced with old

  Scenario: Delete Staff
    When I click on Delete
    Then Staff details should get deleted
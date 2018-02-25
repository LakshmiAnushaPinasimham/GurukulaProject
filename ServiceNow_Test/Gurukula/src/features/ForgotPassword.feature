@RegressionTest
Feature: Forgot Password

  @ForgotPassword
  Scenario: Forgot Password
    Given I launch the Gurukula Application
    When I click on forgot password
    And I entered my registerd email
    And I click on Reset Password
    Then I should get sucessfull message
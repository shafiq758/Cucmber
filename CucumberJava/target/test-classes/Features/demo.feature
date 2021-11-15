@tag
Feature: Login to Privaci application
  I want to Login to secutit.ai application

  @tag2
  Scenario: Launch application
    Given Application URL provided
    And Application got launched
    When username and password provided
    Then User logs into application
    And Dashboard is visible

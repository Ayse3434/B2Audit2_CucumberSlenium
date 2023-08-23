@proton @smoke
Feature: Proton smoke test

  Scenario: Login as a user to proton
    Given User is on the proton login page
    When User enters username and password
    And Click to signin check
    And Click to sigin button
    Then Verify location



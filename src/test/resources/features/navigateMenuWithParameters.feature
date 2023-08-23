 @teacher
Feature: Navigate to menu with parameters
Background:
  Given The user is on the login page

  Scenario: User navigates to Developers Page

    When The user logs in using "teacher@bootflow.academy" and "Test12345!"
    Then The welcome message contains "Teacher"
    And The user navigates to "Developers" menu
    Then The user should be able to see header as "Filter Profiles by Skill or by Location"

  Scenario: User navigates to All Posts Page

    When The user logs in using "sdetb2@bootflow.com" and "Test1234"
    Then The welcome message contains "SDETB2"
    And The user navigates to "All Posts" menu
    Then The user should be able to see header as "Posts"

  Scenario: User navigates to My Account Page

    When The user logs in using "bootdev@bootflow.academy" and "Dev123"
    Then The welcome message contains "BootDeveloper"
    And The user navigates to "My Account" menu
    Then The user should be able to see header as "Dashboard"









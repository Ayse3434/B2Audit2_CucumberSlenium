Feature: Log in as different user
  #Agile: As a user I should be able to log in as different user

  Scenario: Log in as teacher with parameters
    Given The user is on the login page
    When The user logs in using "teacher@bootflow.academy" and "Test12345!"
    Then The user should be able to login
    And The welcome message contains "Teacher"


  Scenario: Log in as student with parameters
    Given The user is on the login page
    When The user logs in using "sdetb2@bootflow.com" and "Test1234"
    Then The user should be able to login
    And The welcome message contains "SDETB2"



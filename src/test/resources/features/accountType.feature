@smoke
Feature: Account Type

  Background:
    Given The user is on the login page
@rerun
  Scenario: Teacher user

    When The user logs in using "teacher@bootflow.academy" and "Test12345!"
    Then The welcome message contains "Teachera"

  @rerun
  Scenario: Student user

    When The user logs in using "sdetb2@bootflow.com" and "Test1234"
    Then The welcome message contains "SDETB2"

  @rerun
  Scenario: Developer user

    When The user logs in using "bootdev@bootflow.academy" and "Dev123"
    Then The welcome message contains "BootDeveloper"


  Scenario Outline:Different User Type
    When The user logs in using "<userType>" and "<password>"
    Then The welcome message contains "<name>"
    Examples:
      | userType                 | password   | name          |
      | teacher@bootflow.academy | Test12345! | Teacher       |
      | sdetb2@bootflow.com      | Test1234   | SDETB2        |
      | bootdev@bootflow.academy | Dev123     | BootDeveloper |
      | ayse2013x@gmail.com      | 12345qwert | Ayse          |

  @wip
  Scenario Outline:User navigate to Different menu
    When The user logs in using "<userType>" and "<password>"
    Then The welcome message contains "<name>"
    And  The user navigates to "<menu>" menu
    Then The user should be able to see header as "<header>"
    Examples:
      | userType                 | password   | name          | menu       | header                                  |
      | teacher@bootflow.academy | Test12345! | Teacher       | Developers | Filter Profiles by Skill or by Location |
      | sdetb2@bootflow.com      | Test1234   | SDETB2        | All Posts  | Posts                                   |
      | bootdev@bootflow.academy | Dev123     | BootDeveloper | My Account | Dashboard                               |





@Tag1
Feature: I want to be able to login as user under different roles

  Background: common steps
    Given user is on the login page

    Scenario Outline: Parametrized login as <role>

      When user login as a "<role>"
      Then user should see "<page_title>" page

      Examples:

      | role         | page_title      |
      | sales manager| Dashboard       |
      | store manager| Dashboard       |
      | driver       | Quick Launchpad |



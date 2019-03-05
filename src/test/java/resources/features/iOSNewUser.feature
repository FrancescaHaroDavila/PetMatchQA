
@pettinder @registerUser

Feature: Scenario of new user

  Scenario Outline: Register a new user

    Given I open the app
    When Click Register Now button
    And Type the user name "<name>"
    And Type the email "<email>"
    And Type the password "<password>"
    And Re-Type the password "<password2>"
    Then Click Register button

    Examples:
      | name    |         email        |  password  |  password2  |
      | Nicolas   |   Nico@hotmail.com  |  Nico123  |     Nico123     |
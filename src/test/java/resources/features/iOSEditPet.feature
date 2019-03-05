
@pettinder @editPet

Feature: Scenario Edit Pet

  Scenario Outline: Edit Pet

    Given I'm into Home section
    When Click Pets Button
    And CLick the Edit button
    And Type the pet name "<name>"
    And Select the month"<month>"
    And Select the day"<day>"
    And Select the year"<year>"
    And Select the genre"<genre>"
    And Select the type"<type>"
    And Type a description"<description>"
    Then Click Save Button

    Examples:
      | name    |   month  |  day  |  year  |  genre      |    type  |  description       |
      | Kitty   |   June   |   8   |  2018  |  Female     |    Cat   |  She loves to play! |
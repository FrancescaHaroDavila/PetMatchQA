@pettinder @newPet

Feature: Scenario Add New Pet with iOS

  Scenario Outline: Add a new pet

    Given I am into Home section
    When Click Pets button
    And Click Add button
    And Select a pet picture
    And Type the name "<name>"
    And Select the month "<month>"
    And Select the day "<day>"
    And Select the year "<year>"
    And Select the genre "<genre>"
    And Select the type "<type>"
    And Type a description "<description>"
    Then Click Save button

    Examples:
      | name   |   month  |  day  |  year  |  genre    |    type  |  description   |
      | Lola   |   March  |   3   |  2018  |  Female   |    Cat   |  She is cute   |
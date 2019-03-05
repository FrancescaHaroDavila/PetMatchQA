@pettinder @deletePet

Feature: Scenario Delete Pet with iOS

  Scenario Outline: Delete a pet

    Given I am into Home
    When Click pets button
    And Select the Pet "<cell>"
    Then Click the Delete button

    Examples:
      | cell   |
      | test   |
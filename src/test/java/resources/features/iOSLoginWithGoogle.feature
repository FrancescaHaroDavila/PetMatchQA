
@pettinder @google

Feature: Scenarios of Login with Google

  Scenario Outline: Sign In into PetMatch with Google

    Given I open PetMatch
    When Click Login With Google button
    And Select my account "<account>"
    Then Click LogOut

    Examples:
      |  account    |
      | Francesca   |
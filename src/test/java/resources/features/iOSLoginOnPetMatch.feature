
  @pettinder @testIos

  Feature: Scenarios of Login with iOS

  Scenario Outline: Sign In into PetMatch with iOS

    Given Ingresar a la pagina Login PetMatch
    When Ingresar el email "<email>"
    And Ingresar la contraseña "<password>"
    And Click en el boton Login
    Then Se mostrar el HomePage

    Examples:
      | email              | password |
      | maver@hotmail.com  | Admin123 |
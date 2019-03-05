package com.selenium.steps;

import com.selenium.framework.ParentScenario;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class iOSPetMatchLoginSteps extends ParentScenario {

    @Given("^Ingresar a la pagina Login PetMatch$")
    public void ingresarALaPaginaLoginPetMatch(){
        System.out.println("Usuario ingresa a la applicacion");
        startIOS();

    }

    @When("^Ingresar el email \"([^\"]*)\"$")
    public void ingresarElEmail(String email){
        petmatchLoginPage.inputEmailiOS(email);
        System.out.println("Usuario ingresa el usuario: "+ email + "Para ingresar a la App");
    }

    @And("^Ingresar la contraseña \"([^\"]*)\"$")
    public void ingresarLaContraseña(String password) {
        petmatchLoginPage.inputPasswordiOS(password);
        System.out.println("Usuario ingresa so la password: ********* Para ingresar a la App");
    }

    @And("^Click en el boton Login$")
    public void clickEnElBotonLogin(){
        petmatchLoginPage.clickOnButtonSignIniOS();
        System.out.println("Usuario ingresa hace click en el boton de login Para ingresar a la App");
    }

    @Then("^Se mostrar el HomePage$")
    public void seMostrarElHomePage(){
        //closeMobileDriver();
        System.out.println("El usuario deberia esperar a ingresar al dashboard");
    }
}

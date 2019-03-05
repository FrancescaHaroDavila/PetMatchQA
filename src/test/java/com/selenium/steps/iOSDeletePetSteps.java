package com.selenium.steps;

import com.selenium.framework.ParentScenario;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class iOSDeletePetSteps extends ParentScenario {


    @Given("^I am into Home$")
    public void iAmIntoHome() {
        System.out.println("Usuario esta en Home");
        startIOS();
    }

    @When("^Click pets button$")
    public void clickPetsButton() {
        deletePet.clickOnButtonPets();
        System.out.println("Usuario ingresa a la seccion Pets");
    }

    @And("^Select the Pet \"([^\"]*)\"$")
    public void selectThePet(String cell) {
        deletePet.selectPet();
        System.out.println("Selecciona la mascota");
    }

    @Then("^Click the Delete button$")
    public void clickTheDeleteButton() {
        deletePet.clickOnButtonDelete();
        System.out.println("Elimina la mascota");
    }


}

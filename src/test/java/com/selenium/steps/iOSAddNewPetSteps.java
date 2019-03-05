package com.selenium.steps;

import com.selenium.framework.ParentScenario;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class iOSAddNewPetSteps extends ParentScenario {

    @Given("^I am into Home section$")
    public void iAmIntoHomeSection() {

        System.out.println("Usuario esta en Home");
        startIOS();

    }

    @When("^Click Pets button$")
    public void clickPetsButton() {
        addNewPetPage.clickOnButtonPets();
        System.out.println("Usuario ingresa a la seccion Pets");
    }

    @When("^Click Add button$")
    public void clickAddButton() {
        addNewPetPage.clickOnButtonADD();
        System.out.println("Usuario hace click en Add");
    }

    @And("^Select a pet picture$")
    public void selectAPetPicture() {
        addNewPetPage.selectPic();
        System.out.println("Selecciona una foto");
    }

    @And("^Type the name \"([^\"]*)\"$")
    public void typeTheName(String name) {
        addNewPetPage.inputName(name);
        System.out.println("Usuario ingresa nombre");
    }

    @And("^Select the month \"([^\"]*)\"$")
    public void selectTheMonth(String month){
        addNewPetPage.setMonth(month);
        System.out.println("Usuario selecciona mes");
    }

    @And("^Select the day \"([^\"]*)\"$")
    public void selectTheDay(String day) {
        addNewPetPage.setDay(day);
        System.out.println("Usuario selecciona dia");
    }

    @And("^Select the year \"([^\"]*)\"$")
    public void selectTheYear(String year) {
        addNewPetPage.setYear(year);
        System.out.println("Usuario selecciona año");
    }

    @And("^Select the genre \"([^\"]*)\"$")
    public void selectTheGenre(String genre) {
        addNewPetPage.setGenre(genre);
        System.out.println("Usuario selecciona genero");
    }

    @And("^Select the type \"([^\"]*)\"$")
    public void selectTheType(String type) {
        addNewPetPage.setType(type);
        System.out.println("Usuario selecciona tipo");
    }

    @And("^Type a description \"([^\"]*)\"$")
    public void typeADescription(String description) {
        addNewPetPage.inputDescription(description);
        System.out.println("Usuario ingresa descripcion");
    }

    @Then("^Click Save button$")
    public void clickSaveButton() {
        addNewPetPage.clickOnButtonSave();
        System.out.println("Usuario hace click en Save");
    }
}

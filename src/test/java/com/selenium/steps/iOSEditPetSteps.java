package com.selenium.steps;
import com.selenium.framework.ParentScenario;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class iOSEditPetSteps extends ParentScenario{

    @Given("^I'm into Home section$")
    public void iMIntoHomeSection() {
        System.out.println("Usuario esta en Home");
        startIOS();
    }

    @When("^Click Pets Button$")
    public void clickPetsButton() {
        editPetPage.clickOnButtonPets();
        System.out.println("Usuario ingresa a la seccion Pets");
    }

    @And("^CLick the Edit button$")
    public void clickTheEditButton() {
        editPetPage.clickOnButtonEdit();
        System.out.println("Usuario hace click en Edit");
    }

    @And("^Type the pet name \"([^\"]*)\"$")
    public void typeThePetName(String name) {
        editPetPage.inputName(name);
        System.out.println("Usuario ingresa nombre");
    }

    @And("^Select the month\"([^\"]*)\"$")
    public void selectTheMonth(String month) {
        editPetPage.setMonth(month);
        System.out.println("Usuario selecciona mes");
    }

    @And("^Select the day\"([^\"]*)\"$")
    public void selectTheDay(String day) {
        editPetPage.setDay(day);
        System.out.println("Usuario selecciona dia");
    }

    @And("^Select the year\"([^\"]*)\"$")
    public void selectTheYear(String year){
        editPetPage.setYear(year);
        System.out.println("Usuario selecciona año");
    }

    @And("^Select the genre\"([^\"]*)\"$")
    public void selectTheGenre(String genre){
        editPetPage.setGenre(genre);
        System.out.println("Usuario selecciona genero");
    }

    @And("^Select the type\"([^\"]*)\"$")
    public void selectTheType(String type){
        editPetPage.setType(type);
        System.out.println("Usuario selecciona tipo");
    }

    @And("^Type a description\"([^\"]*)\"$")
    public void typeADescription(String description) {
        editPetPage.inputDescription(description);
        System.out.println("Usuario ingresa descripcion");
    }

    @Then("^Click Save Button$")
    public void clickSaveButton() {
        editPetPage.clickOnButtonSave();
        System.out.println("Usuario hace click en Save");
    }
}

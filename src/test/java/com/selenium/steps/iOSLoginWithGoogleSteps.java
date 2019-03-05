package com.selenium.steps;

import com.selenium.framework.ParentScenario;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class iOSLoginWithGoogleSteps extends ParentScenario {

    @Given("^I open PetMatch$")
    public void iOpenPetMatch() {
        System.out.println("El usuario abre la app");
        startIOS();
    }

    @When("^Click Login With Google button$")
    public void clickLoginWithGoogleButton() {
        loginWithGooglePage.clickOnButtonGoogle();
        loginWithGooglePage.clickOnButtonContinue();
        System.out.println("El usuario hace click en Login with Google");

    }

    @And("^Select my account \"([^\"]*)\"$")
    public void selectMyAccount(String account){
        loginWithGooglePage.clickOnAccount();
        System.out.println("El usuario hace click en su cuenta");
    }

    @Then("^Click LogOut$")
    public void clickLogOut() {

        loginWithGooglePage.clickOnButtonLogOut();
        System.out.println("El usuario revisa la app y hace logOut");
    }
}

package com.selenium.steps;

import com.selenium.framework.ParentScenario;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class iOSNewUserSteps extends ParentScenario {

    @Given("^I open the app$")
    public void iOpenTheApp() {
        System.out.println("Abre la aplicacion");
        startIOS();
    }

    @When("^Click Register Now button$")
    public void clickRegisterNowButton() {
        newUserPage.clickOnButtonRegisterNow();
        System.out.println("Hace click en Register now");
    }

    @And("^Type the user name \"([^\"]*)\"$")
    public void typeTheUserName(String name)  {
        newUserPage.inputName(name);
        System.out.println("El usuario escribe su nombre: Carlo");
    }

    @And("^Type the email \"([^\"]*)\"$")
    public void typeTheEmail(String email) {
        newUserPage.inputEmail(email);
        System.out.println("El usuario escribe su email: carlo@hotmail.com");
    }

    @And("^Type the password \"([^\"]*)\"$")
    public void typeThePassword(String password) {
        newUserPage.inputPassword(password);
        System.out.println("El usuario escribe una contraseña de 6 digitos");
    }

    @And("^Re-Type the password \"([^\"]*)\"$")
    public void reTypeThePassword(String passwordConfirmation)  {
        newUserPage.inputPasswordConfirmation(passwordConfirmation);
        System.out.println("El usuario repite la contraseña");

    }

    @Then("^Click Register button$")
    public void clickRegisterButton() {
        newUserPage.clickOnButtonRegister();
        System.out.println("El usuario hace click en registrar");
    }
}

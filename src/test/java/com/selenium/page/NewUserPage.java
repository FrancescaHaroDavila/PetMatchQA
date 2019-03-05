package com.selenium.page;

import com.selenium.framework.ParentPage;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class NewUserPage extends ParentPage {

    public NewUserPage(AppiumDriver driver){
        super(driver);
    }

    By BTN_REGISTER_NOW = By.id("register now");
    By TXT_NAME = By.xpath("//XCUIElementTypeApplication[@name=\"PetMatch\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField[1]");
    By TXT_EMAIL = By.xpath("//XCUIElementTypeApplication[@name=\"PetMatch\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField[2]\n");
    By TXT_PASSWORD = By.xpath("//XCUIElementTypeApplication[@name=\"PetMatch\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeSecureTextField[1]");
    By TXT_PASSWORD_CONFIR = By.xpath("//XCUIElementTypeApplication[@name=\"PetMatch\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeSecureTextField[2]");
    By BTN_REGISTER = By.id("REGISTER AND SIGN IN");


    public void clickOnButtonRegisterNow(){ClickOnLocator(BTN_REGISTER_NOW);}
    public void clickOnButtonRegister(){ClickOnLocator(BTN_REGISTER);}

    public void inputName(String name){
        handlingWaitToElement(TXT_NAME);
        TypeInTextField(TXT_NAME, name );
    }

    public void inputEmail(String email){
        handlingWaitToElement(TXT_EMAIL);
        TypeInTextField(TXT_EMAIL, email );
    }

    public void inputPassword(String password){
        handlingWaitToElement(TXT_PASSWORD);
        TypeInTextField(TXT_PASSWORD, password );
    }

    public void inputPasswordConfirmation(String passwordConfir){
        handlingWaitToElement(TXT_PASSWORD_CONFIR);
        TypeInTextField(TXT_PASSWORD_CONFIR, passwordConfir );
    }



}

package com.selenium.page;

import com.selenium.framework.ParentPage;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class PetmatchLoginPage extends ParentPage {

    public PetmatchLoginPage(AppiumDriver driver){
        super(driver);
    }

    By TXT_EMAIL = By.id("com.automation.petmatch:id/emailEditText");
    By TXT_PASSWORD = By.id("com.automation.petmatch:id/passwordEditText");
    By BTN_SIGN_IN = By.id("com.automation.petmatch:id/signInButton");
    By BTN_SIGN_IN_GOOGLE = By.id("com.automation.petmatch:id/signInGoogleButton");

    By iOS_TXT_EMAIL = By.xpath("//XCUIElementTypeApplication[@name=\"PetMatch\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTextField");
    By iOS_TXT_PASSWORD = By.xpath("//XCUIElementTypeApplication[@name=\"PetMatch\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeSecureTextField");
    By iOS_BTN_SIGN_IN = By.id("LOGIN");
    By iOS_BTN_SIGN_IN_GOOGLE = By.id("loginWithgoogle");


    public void clickOnButtonSignIn(){ClickOnLocator(BTN_SIGN_IN);}
    public void clickOnButtonSignIniOS(){ClickOnLocator(iOS_BTN_SIGN_IN);}
    public void clickOnButtonSignInGoogle(){ClickOnLocator(BTN_SIGN_IN_GOOGLE);}

    public void inputEmail(String email){
        handlingWaitToElement(TXT_EMAIL);
        TypeInTextField(TXT_EMAIL, email );
    }
    public void inputPassword(String password){
        handlingWaitToElement(TXT_PASSWORD);
        TypeInTextField(TXT_PASSWORD,password);
    }

    public void inputEmailiOS(String email){
        handlingWaitToElement(iOS_TXT_EMAIL);
        TypeInTextField(iOS_TXT_EMAIL, email );
    }
    public void inputPasswordiOS(String password){
        handlingWaitToElement(iOS_TXT_PASSWORD);
        TypeInTextField(iOS_TXT_PASSWORD,password);
    }
}

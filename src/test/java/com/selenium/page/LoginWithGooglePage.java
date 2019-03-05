package com.selenium.page;

import com.selenium.framework.ParentPage;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class LoginWithGooglePage extends ParentPage {

    public LoginWithGooglePage(AppiumDriver driver){
        super(driver);
    }

    By BTN_GOOGLE = By.id("google");
    By CONTINUE = By.id("Continue");
    By ACCOUNT = By.xpath("//XCUIElementTypeLink[@name=\"Francesca Haro francescaharo@gmail.com\"]");
    By LOG_OUT = By.id("Log Out");

    public void clickOnButtonGoogle(){ClickOnLocator(BTN_GOOGLE);}
    public void clickOnButtonContinue(){ClickOnLocator(CONTINUE);}
    public void clickOnAccount(){
        handlingWaitToElement(ACCOUNT);
        ClickOnLocator(ACCOUNT);}
    public void clickOnButtonLogOut(){
        handlingWaitToElement(LOG_OUT);
        SwipeCollection(LOG_OUT);
        ClickOnLocator(LOG_OUT);}


}

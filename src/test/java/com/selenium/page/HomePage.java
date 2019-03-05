package com.selenium.page;

import com.selenium.framework.ParentPage;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class HomePage extends ParentPage {

    public HomePage(AppiumDriver driver){
        super(driver);
    }

    By TXT_BAR = By.xpath("//android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView");
    By BTN_ADD = By.id("com.automation.petmatch:id/fab");
    By BTN_PETS = By.id("com.automation.petmatch:id/navigation_pets");
    By BTN_FAVORITES = By.id("com.automation.petmatch:id/navigation_favorites");
    By BTN_USER = By.id("com.automation.petmatch:id/navigation_user");


    public void clickOnButtonAdd(){ClickOnLocator(BTN_ADD);}

    public void verifyThatelementsAreDisplayed(){
        handlingWaitToElement(BTN_ADD);
        handlingWaitToElement(BTN_PETS);
        handlingWaitToElement(BTN_FAVORITES);
        handlingWaitToElement(BTN_USER);
    }

    public String verifyTheTitlePage(){
        return getTextOfTextField(TXT_BAR);
    }


}

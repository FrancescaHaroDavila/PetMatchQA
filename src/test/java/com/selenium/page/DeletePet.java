package com.selenium.page;

import com.selenium.framework.ParentPage;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class DeletePet extends ParentPage {

    public DeletePet(AppiumDriver driver){
        super(driver);
    }

    By BTN_PETS = By.id("Pets");
    By BTN_DELETE = By.xpath("(//XCUIElementTypeButton[@name=\"Delete\"])[1]");


    public void clickOnButtonPets(){
        handlingWaitToElement(BTN_PETS);
        ClickOnLocator(BTN_PETS);
    }

    public void selectPet(){
        SwipeCell();
    }
    public void clickOnButtonDelete(){
        ClickOnLocator(BTN_DELETE);
    }
}

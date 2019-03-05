package com.selenium.page;

import com.selenium.framework.ParentPage;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class EditPetPage extends ParentPage {

    public EditPetPage(AppiumDriver driver){
        super(driver);
    }


    By BTN_PETS = By.id("Pets");
    By TXT_NAME = By.xpath("//XCUIElementTypeApplication[@name=\"PetMatch\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTextField");
    By DATE_MONTH = By.xpath("//XCUIElementTypeApplication[@name=\"PetMatch\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeDatePicker/XCUIElementTypeOther/XCUIElementTypePickerWheel[1]");
    By DATE_DAY = By.xpath("//XCUIElementTypeApplication[@name=\"PetMatch\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeDatePicker/XCUIElementTypeOther/XCUIElementTypePickerWheel[2]");
    By DATE_YEAR = By.xpath("//XCUIElementTypeApplication[@name=\"PetMatch\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeDatePicker/XCUIElementTypeOther/XCUIElementTypePickerWheel[3]");
    By PICKER_GENRE = By.xpath("//XCUIElementTypeApplication[@name=\"PetMatch\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypePicker[1]/XCUIElementTypePickerWheel");
    By PICKER_TYPE = By.xpath("//XCUIElementTypeApplication[@name=\"PetMatch\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypePicker[2]/XCUIElementTypePickerWheel");
    By TXT_DESCRIPTION = By.xpath("//XCUIElementTypeApplication[@name=\"PetMatch\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextView");
    By BTN_SAVE = By.id("Save");
    By BTN_EDIT = By.xpath("(//XCUIElementTypeButton[@name=\"Edit\"])[1]");

    public void clickOnButtonPets(){
        handlingWaitToElement(BTN_PETS);
        ClickOnLocator(BTN_PETS);
    }

    public void clickOnButtonSave(){
        ClickOnLocator(BTN_SAVE);
    }

    public void clickOnButtonEdit(){
        SwipeCell();
        ClickOnLocator(BTN_EDIT);
    }

    public void inputName(String name){
        handlingWaitToElement(TXT_NAME);
        ClearTextField(TXT_NAME);
        TypeInTextField(TXT_NAME, name );
    }

    public void inputDescription(String description){
        handlingWaitToElement(TXT_DESCRIPTION);
        ClearTextField(TXT_DESCRIPTION);
        TypeInTextField(TXT_DESCRIPTION, description);
    }

    public void setMonth(String month){
        handlingWaitToElement(DATE_MONTH);
        TypeInTextField(DATE_MONTH, month);
    }

    public void setDay(String day){
        handlingWaitToElement(DATE_DAY);
        TypeInTextField(DATE_DAY , day );
    }

    public void setYear(String year){
        handlingWaitToElement(DATE_YEAR);
        TypeInTextField(DATE_YEAR , year );
    }

    public void setGenre(String genre){
        handlingWaitToElement(PICKER_GENRE);
        TypeInTextField(PICKER_GENRE , genre );
    }

    public void setType(String type){
        handlingWaitToElement(PICKER_TYPE);
        TypeInTextField(PICKER_TYPE , type );
    }

}

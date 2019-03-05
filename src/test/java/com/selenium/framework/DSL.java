package com.selenium.framework;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class DSL {
    private AppiumDriver driver;

    public DSL(AppiumDriver driver){
        this.driver = driver;
    }

    /** Click in some element (Locator)
     * This method is use for do click in any Element
     * @param locator
     */
    public void ClickOnLocator (By locator){
        driver.findElement(locator).click();
    }

    public void SwipeCell (){

        driver.swipe(370,110, 180, 110, 100 );
    }

    public void SwipeCollection (By locator){

        final WebDriverWait wait = new WebDriverWait(driver, 100);
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        driver.swipe(300,600, 100, 600, 30 );
        driver.swipe(300,600, 100, 600, 30 );
        driver.swipe(300,600, 100, 600, 30 );
        driver.swipe(300,600, 100, 600, 30 );
    }

    public void ClearTextField(By locator){
        driver.findElement(locator).clear();
    }

    public void TypeInTextField(By locator, String text){

        driver.findElement(locator).sendKeys(text);
    }

    public String getTextOfTextField (By locator){
        return driver.findElement(locator).getText();
    }

    /**
     * This a method to wait for an Element
     * @param locator
     */
    public void handlingWaitToElement(By locator){
        final WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    /**
     * This a method for do a click on one element with a specific text
     * this method contain a handling wait by new element
     * @param  locator
     * @param  textValue
     **/
    public void clickElementByTextValue(By locator, String textValue)
    {
        By newLocator = By.id(locator.toString().replaceAll("(By.id: )|(.*?)", "")
                + textValue);
        ClickOnLocator(newLocator);
    }



}
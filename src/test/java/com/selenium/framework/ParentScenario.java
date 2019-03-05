package com.selenium.framework;

import com.selenium.page.*;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import java.net.URL;

public class ParentScenario {
    private AppiumDriver driver;
    private WebDriver driver2;


    protected static String Platform;
    //Android / IOs Pages
    protected static CalculatorPage calculatorPage;
    protected static PetmatchLoginPage petmatchLoginPage;
    protected static HomePage homePage;
    protected static AddNewPetPage addNewPetPage;
    protected static NewUserPage newUserPage;
    protected static EditPetPage editPetPage;
    protected static DeletePet deletePet;
    protected static LoginWithGooglePage loginWithGooglePage;

    //Web Pages
    protected static MainPage mainPage;
    protected static SignUpPage signUpPage;

    public void startBrowser(){
        //for Windows:
        //System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\test\\java\\resources\\drivers\\chromedriver.exe");

        //for Mac:
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/java/resources/drivers/chromedriver");
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        ChromeOptions options = new ChromeOptions();

        try{
            driver2 = new ChromeDriver();
        }catch (Exception e){
            System.out.println("Excepcion al momento de inicializar el driver: " + e);
        }

        //instancias de las Paginas
        mainPage = new MainPage(driver);
        signUpPage = new SignUpPage(driver);
    }

    public void startAndroid(){
        String url = "http://localhost:4723/wd/hub";
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.1.1");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME,"CB5A28Q2LU");
        cap.setCapability(MobileCapabilityType.APP_PACKAGE,"com.automation.petmatch");
        cap.setCapability(MobileCapabilityType.APP_ACTIVITY, "com.automation.petmatch.viewcontrollers.activities.OnboardingActivity");

        try{
            driver = new AndroidDriver<MobileElement>(new URL(url),cap);
        }catch (Exception e){
            System.out.println("Excepcion al momento de generar el Driver " + e);
        }

        //instanciando pagiunas de android
        calculatorPage = new CalculatorPage(driver);
        petmatchLoginPage = new PetmatchLoginPage(driver);
        homePage = new HomePage(driver);

    }

    public void startIOS(){
        String url = "http://localhost:4723/wd/hub";
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12.1");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME,"iPhone XR");
        cap.setCapability(MobileCapabilityType.UDID,"22EBD7C1-DA9F-4A42-887E-0160E41057FA");
        cap.setCapability(MobileCapabilityType.APP, "/Users/fharo/Desktop/lol/PetMatch.app");
        try{
            driver = new IOSDriver(new URL(url),cap);
        }catch (Exception e){
            System.out.println("Excepcion al momento de generar el Driver " + e);
        }
        petmatchLoginPage = new PetmatchLoginPage(driver);
        addNewPetPage = new AddNewPetPage(driver);
        newUserPage = new NewUserPage(driver);
        editPetPage = new EditPetPage(driver);
        deletePet = new DeletePet(driver);
        loginWithGooglePage = new LoginWithGooglePage(driver);
    }

    protected void nativateTo (String url){
        driver2.navigate().to(url);
    }

    protected void closeWebDriver(){
        driver2.quit();
    }

    protected void closeMobileDriver(){
        driver.quit();
    }

}

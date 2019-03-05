package com.selenium;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/**
 * Example of Automation.
 */
@CucumberOptions(plugin = { "html:target/cucumber-html-reports",
        "json:target/cucumber-html-reports/cucumber.json",
        "junit:target/surefire-reports/cucumber-junit.xml" },
        format = { "pretty","html:target/cucumber-htmlreport",
                "json:target/cucumber-html-reports/cucumber.json" },
        features = "src/test/java/resources/features",
        tags = {"@testIos", "@newPet"},
        glue = {"com.selenium.steps"})

public class AppTest extends AbstractTestNGCucumberTests {

}

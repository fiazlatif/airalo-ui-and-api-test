package com.airalo.website.ui.test.runner;


import com.airalo.website.ui.test.factory.DriverFactory;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"com/airalo/website/ui/test/stepsDefs", "com/airalo/website/ui/test/dockHooks"},
        tags = "@Airalo",
        plugin = {"pretty",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "json:test-output/cucumber-reports/Cucumber.json",
                "junit:target/cucumber-reports/Cucumber.xml",
                "summary"
        },
        monochrome = true


)


public class TestRunner {
    @AfterClass
    public static void tearDown() {
        if (DriverFactory.getDriver() != null) {
            DriverFactory.getDriver().quit();
        }
    }

}

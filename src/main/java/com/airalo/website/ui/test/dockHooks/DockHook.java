package com.airalo.website.ui.test.dockHooks;

import com.airalo.website.ui.test.factory.DriverFactory;
import com.airalo.website.ui.test.utils.Config;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import org.apache.log4j.helpers.LogLog;
import org.openqa.selenium.WebDriver;

public class DockHook {

    public static WebDriver driver = null;


    @AfterAll
    public static void tearDown(){

        try {
            DriverFactory.quitDriver();
            System.out.println("Browser is quit");

        } catch ( Throwable t){
            LogLog.error("Something is wrong", t);
                throw t;
        }
    }

}

package com.parabank.runners;

import com.parabank.driver.DriverFactory;
import com.parabank.driver.DriverManager;
import com.parabank.utilities.ConfigReader;
import org.testng.annotations.Test;

public class SmokeTest {
    @Test
    public void launchBrowser() {
        DriverFactory.initDriver();

        DriverManager.getDriver().get(ConfigReader.get("url"));

        System.out.println(DriverManager.getDriver().getTitle());

        DriverFactory.quitDriver();
    }
}

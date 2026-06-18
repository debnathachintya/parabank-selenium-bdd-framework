package com.parabank.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
    private DriverFactory() {};

    public static void initDriver() {
        WebDriverManager.chromedriver().setup();

        DriverManager.setDriver(new ChromeDriver());

        DriverManager.getDriver().manage().window().maximize();
    }

    public static void quitDriver() {
        if(DriverManager.getDriver()!=null) {
            DriverManager.getDriver().quit();
            DriverManager.unload();
        }
    }
}

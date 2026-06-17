package com.parabank.base;

import com.parabank.driver.DriverManager;
import org.openqa.selenium.WebDriver;

public class BasePage {
    protected WebDriver driver;

    public BasePage() {
        driver = DriverManager.getDriver();
    }
}

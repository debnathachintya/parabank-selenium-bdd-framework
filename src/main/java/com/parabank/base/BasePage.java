package com.parabank.base;

import com.parabank.driver.DriverManager;
import org.openqa.selenium.By;

public class BasePage {
    protected void click(By locator) {
        DriverManager.getDriver().findElement(locator).click();
    }

    protected void enterText(By locator, String value) {
        DriverManager.getDriver().findElement(locator).sendKeys(value);
    }

    protected String getText(By locator) {
        return DriverManager.getDriver().findElement(locator).getText();
    }

    protected String getTitle() {
        return DriverManager.getDriver().getTitle();
    }
}

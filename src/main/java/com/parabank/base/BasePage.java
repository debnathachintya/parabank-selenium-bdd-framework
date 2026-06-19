package com.parabank.base;

import com.parabank.driver.DriverManager;
import org.openqa.selenium.By;
import com.parabank.utilities.WaitFactory;

public class BasePage {
    protected void click(By locator) {
        WaitFactory.waitForElementClickable(locator).click();
    }

    protected void enterText(By locator, String value) {
        WaitFactory.waitForElementVisible(locator).sendKeys(value);
    }

    protected String getText(By locator) {
        return WaitFactory.waitForElementVisible(locator).getText();
    }

    protected String getTitle() {
        return DriverManager.getDriver().getTitle();
    }
}

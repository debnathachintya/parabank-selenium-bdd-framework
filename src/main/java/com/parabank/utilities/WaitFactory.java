package com.parabank.utilities;

import com.parabank.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.parabank.utilities.ConfigReader;

import java.time.Duration;

public class WaitFactory {
    private WaitFactory() {

    }

    public static WebElement waitForElementVisible(By locator) {
        WebDriverWait wait = new WebDriverWait(
                DriverManager.getDriver(),
                Duration.ofSeconds(
                        Long.parseLong(ConfigReader.get("explicitwait"))
                ));

        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static WebElement waitForElementClickable(By locator) {
        WebDriverWait wait = new WebDriverWait(
                        DriverManager.getDriver(),
                        Duration.ofSeconds(
                                Long.parseLong(ConfigReader.get("explicitwait"))
                        ));

        return wait.until(
                ExpectedConditions.elementToBeClickable(locator)
        );
    }
}
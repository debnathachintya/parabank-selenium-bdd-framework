package com.parabank.pages;

import com.parabank.base.BasePage;
import com.parabank.driver.DriverManager;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {
    private final By usernameTextBox = By.name("username");
    private final By passwordTextBox = By.name("password");
    private final By loginButton = By.xpath("//input[@value='Log In']");

    public LoginPage enterUsername(String username) {
        enterText(usernameTextBox, username);
        return this;
    }

    public LoginPage enterPassword(String password) {
        enterText(passwordTextBox, password);
        return this;
    }

    public HomePage clickLogin() {
        click(loginButton);
        return new HomePage();
    }

    public LoginPage openApplication(String url) {
        DriverManager.getDriver().get(url);
        return this;
    }
}

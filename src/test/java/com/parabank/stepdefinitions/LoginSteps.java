package com.parabank.stepdefinitions;

import com.parabank.driver.DriverManager;
import com.parabank.utilities.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class LoginSteps {
    @Given("user launches ParaBank application")
    public void userLaunchesParaBankApplication() {
        DriverManager.getDriver().get(ConfigReader.get("url"));
    }

    @Then("home page should be displayed")
    public void homePageShouldBeDisplayed() {
        String title = DriverManager.getDriver().getTitle();

        Assert.assertTrue(title.contains("ParaBank"));
    }
}

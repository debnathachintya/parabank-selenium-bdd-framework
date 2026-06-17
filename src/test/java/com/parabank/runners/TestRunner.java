package com.parabank.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {
                "com.parabank.stepdefinitions",
                "com.parabank.hooks"
        },
        monochrome = true,
        plugin = {
                "pretty"
        }
)

public class TestRunner extends AbstractTestNGCucumberTests {
}

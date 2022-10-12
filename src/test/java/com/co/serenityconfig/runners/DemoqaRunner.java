package com.co.serenityconfig.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(

        features = "src/test/resources/features/demoqa.feature",
        glue = "com.co.serenityconfig.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class DemoqaRunner {
}

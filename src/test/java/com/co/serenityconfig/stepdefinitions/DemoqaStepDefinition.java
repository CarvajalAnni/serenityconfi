package com.co.serenityconfig.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.util.EnvironmentVariables;
import org.openqa.selenium.WebDriver;

public class DemoqaStepDefinition {


    @Managed
    WebDriver hisBrowser;
    private EnvironmentVariables environmentVariables;

    @Before
    public void setIni(){
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("Anni");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^that i enter the page$")
    public void thatIEnterThePage() {
        String webServiceEndpoint = EnvironmentSpecificConfiguration.from(environmentVariables)
                .getProperty("environments.default.webdriver.base.url");
        String URL = webServiceEndpoint.toString();
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url(URL));
    }


    @When("^enter the page$")
    public void enterThePage() {

    }

    @Then("^i should on the screen the welcome$")
    public void iShouldOnTheScreenTheWelcome() {

    }

}

package org.example.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_objects.TopBar;

import static org.example.stepdefinitions.BaseSteps.driver;

public class TopBarSteps {

    TopBar topBar = new TopBar(driver);

    @When("Click on Deliver To icon")
    public void clickOnDeliverToIcon() {
        topBar.openChooseYourLocation();
    }

    @Then("Validate that the value is updated on Deliver To icon")
    public void validateThatTheValueIsUpdatedOnDeliverToIcon() {
        topBar.CheckTheDestinationIsUpdated();

    }
}

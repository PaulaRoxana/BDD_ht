package org.example.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import page_objects.TopBar;

import static org.example.stepdefinitions.BaseSteps.driver;

public class TopBarSteps {

    TopBar topBar = new TopBar(driver);

    @When("Click on Deliver To icon and open CHOOSE YOUR LOCATION pop up")
    public void clickOnDeliverToIcon() {
        topBar.openChooseYourLocationPopUp();
    }

    @Then("Validate that the value is updated on Deliver To icon")
    public void validateThatTheValueIsUpdatedOnDeliverToIcon() {
        topBar.CheckTheDestinationIsUpdated();
        Assert.assertTrue(topBar.destinationBtn.getText().contains("Phoenix"), "The updated value should contain Phoenix");

    }

    @When("User inserts invalid data in search field")
    public void userInsertsInvalidDataInSearchField() {
        topBar.searchMethod("ggdhtjydyfiuyoiupio[o;oi777777777777777.");
    }

    @When("User inserts valid data in search field")
    public void userInsertsValidDataInSearchField() {
        topBar.searchMethod("laptop");
    }
}

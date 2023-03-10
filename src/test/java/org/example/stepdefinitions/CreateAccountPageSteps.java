package org.example.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import lombok.extern.java.Log;
import org.testng.Assert;
import page_objects.CreateAccountPage;

import java.util.List;

import static org.example.stepdefinitions.BaseSteps.driver;

@Log
public class CreateAccountPageSteps {

    CreateAccountPage createAccountPage = new CreateAccountPage(driver);

    @Given("The page of new user registration is opened")
    public void thePageOfNewUserRegistrationIsOpened() {
        createAccountPage.openUserRegistrationPage();
    }

    @Then("the form should include the fields First Name, Last Name, Email,  Password, Confirm password")
    public void theFormShouldIncludeTheFieldsFirstNameLastNameEmailPasswordConfirmPassword() {
        List<String> listOfFields = createAccountPage.validateFieldsOnTheSignUpForm();
        Assert.assertTrue(listOfFields.contains("First Name"), "First Name field is NOT present on the form");
        Assert.assertTrue(listOfFields.contains("Last Name"), "Last Name field is NOT present on the form");
        Assert.assertTrue(listOfFields.contains("Email"), "Email field is NOT present on the form");
        Assert.assertTrue(listOfFields.contains("Password"), "Password field is NOT present on the form");
        Assert.assertTrue(listOfFields.contains("Confirm Password"), "Confirm Password field is NOT present on the form");
    }

    @And("the form should include Checkbox with label {string}")
    public void theFormShouldIncludeCheckboxWithLabel(String labelText) {
        labelText = "Send me weekly savings tips and financial news";
        Assert.assertTrue(createAccountPage.getCheckboxInput().getAttribute("type")
                .equalsIgnoreCase("checkbox"), "Checkbox is NOT present on the form");
        Assert.assertTrue(createAccountPage.getCheckboxLabel().getText()
                .equalsIgnoreCase(labelText), "Checkbox label " + labelText + "is NOT present on the form");

    }

    @And("the form should include the Button {string}.")
    public void theFormShouldIncludeTheButton(String arg0) {
    }
}


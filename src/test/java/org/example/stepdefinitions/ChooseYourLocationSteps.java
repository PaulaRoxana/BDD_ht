package org.example.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import page_objects.HomePage;
import page_objects.modules.ChooseYourLocationModule;

import static org.example.stepdefinitions.BaseSteps.driver;

public class ChooseYourLocationSteps {

   ChooseYourLocationModule chooseYourLocationM = new ChooseYourLocationModule(driver);
   HomePage homePage = new HomePage(driver);


    @And("Enter a US zip code in CHOOSE YOUR LOCATION pop up and click on APPLY button")
    public void enterAUSZipCodeInCHOOSEYOURLOCATIONPopUpAndClickOnAPPLYButton() {
        chooseYourLocationM.enterUSZipCodeForDestination("85001");
    }


    @Then("Validate that the list of countries contains {string}")
    public void validateThatTheListOfCountriesContains(String specificCountry) {
        String chosenCountry =  chooseYourLocationM.checkThatTheListOfCountriesContainsASpecificCountry();
        Assert.assertEquals(chosenCountry.replace("[", "")
                .replace("]", ""), specificCountry, "The country should be" + specificCountry);
    }

    @And("Choose {string} from the countries list")
    public void choosePolandFromTheCountriesList(String specificCountry) {
        chooseYourLocationM.choosePolandFromTheListOfCountries();

    }
}

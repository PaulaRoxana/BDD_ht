package org.example.stepdefinitions;

import io.cucumber.java.en.And;
import page_objects.modules.ChooseYourLocationModule;

import static org.example.stepdefinitions.BaseSteps.driver;

public class ChooseYourLocationSteps {

   ChooseYourLocationModule chooseYourLocationM = new ChooseYourLocationModule(driver);


    @And("Enter a US zip code in CHOOSE YOUR LOCATION pop up and click on APPLY button")
    public void enterAUSZipCodeInCHOOSEYOURLOCATIONPopUpAndClickOnAPPLYButton() {
        chooseYourLocationM.enterUSZipCodeForDestination("85001");
    }


}

package org.example.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import page_objects.HomePage;
import page_objects.TopBar;

import static org.example.stepdefinitions.BaseSteps.driver;

public class HomePageSteps {

    HomePage homePage = new HomePage(driver);
    TopBar topBar = new TopBar(driver);

    @Given("Amazon Home Page is opened")
    public void amazonHomePageIsOpened() {

        homePage.openAmazonHomePageAndJustGoToTopBar();
    }

    @And("Choose any category of products and click on any product")
    public void chooseAnyCategoryOfProductsAndClickOnAnyProduct() {
        topBar.withPolandAsDestination().clickOnAnyProductsCategory();
    }
}

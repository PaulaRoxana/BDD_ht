package org.example.stepdefinitions;

import io.cucumber.java.en.Then;
import org.testng.Assert;
import page_objects.ProductsPage;

import static org.example.stepdefinitions.BaseSteps.driver;

public class ProductsPageStep {

    ProductsPage productsPage = new ProductsPage(driver);

    @Then("Validate that the product is shipping to {string}")
    public void validateThatTheProductIsShippingToChosenCountry(String specificCountry) {
        String shippingToPoland = productsPage.productsAreShippingToPoland();
        Assert.assertTrue(shippingToPoland.contains("Shipping to " + specificCountry), "This product should ship to Poland");
    }
}

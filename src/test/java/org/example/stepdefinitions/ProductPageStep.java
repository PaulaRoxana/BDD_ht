package org.example.stepdefinitions;

import io.cucumber.java.en.Then;
import org.testng.Assert;
import page_objects.ProductPage;

import static org.example.stepdefinitions.BaseSteps.driver;

public class ProductPageStep {

    ProductPage productPage = new ProductPage(driver);

    @Then("Validate that the product is shipping to {string}")
    public void validateThatTheProductIsShippingToChoseCountry(String specificCountry) {
        String shippingToPoland = productPage.productsAreShippingToPoland();
        Assert.assertTrue(shippingToPoland.contains("Shipping to " + specificCountry), "This product should ship to Poland");
    }
}

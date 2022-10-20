package org.example.stepdefinitions;

import io.cucumber.java.en.Then;
import org.testng.Assert;
import page_objects.ProductsPage;
import page_objects.SearchResultsPage;

import static org.example.stepdefinitions.BaseSteps.driver;
import static org.testng.Assert.assertEquals;

public class SearchResultsPageStep {

    ProductsPage productsPage = new ProductsPage(driver);
    SearchResultsPage searchResultsPage = new SearchResultsPage(driver);

//    @Then("Validate that the product is shipping to {string}")
//    public void validateThatTheProductIsShippingToChosenCountry(String specificCountry) {
//        String shippingToPoland = productsPage.productsAreShippingToPoland();
//        Assert.assertTrue(shippingToPoland.contains("Shipping to " + specificCountry), "This product should ship to Poland");
//    }

    @Then("Validate that no results were found")
    public void validateThatNoResultsWereFound() {
        String noResultsVisibleText = searchResultsPage.noResultsWereFound();
        assertEquals(noResultsVisibleText, "No results for", "The text should contain: No results for");
    }


    @Then("Validate that the inserted data is present as text within the text showing the number of results found")
    public void validateThatTheInsertedDataIsPresentAsTextInTheTextShowingTheNumberOfResultFound() {
        String resultsVisibleText = searchResultsPage.resultsWereFound();
        assertEquals(resultsVisibleText, '"'+"laptop"+'"', "The text should contain: 'laptop'");
    }
}

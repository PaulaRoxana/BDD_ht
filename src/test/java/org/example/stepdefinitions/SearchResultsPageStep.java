package org.example.stepdefinitions;

import io.cucumber.java.en.Then;
import org.testng.Assert;
import page_objects.ProductsPage;
import page_objects.SearchResultsPage;

import static org.example.stepdefinitions.BaseSteps.driver;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SearchResultsPageStep {

    ProductsPage productsPage = new ProductsPage(driver);
    SearchResultsPage searchResultsPage = new SearchResultsPage(driver);

    @Then("Validate that no results were found")
    public void validateThatNoResultsWereFound() {
        String noResultsVisibleText = searchResultsPage.noResultsWereFound();
        assertEquals(noResultsVisibleText, "No results for", "The text should contain: No results for");
    }


    @Then("Validate that the inserted data is present as text within the text showing the number of results found")
    public void validateThatTheInsertedDataIsPresentAsTextWithinTheTextShowingTheNumberOfResultsFound() {
        String resultsVisibleText = searchResultsPage.resultsWereFound();
        assertEquals(resultsVisibleText, '"'+"laptop"+'"', "The text should contain: 'laptop'");
    }

    @Then("Validate that at least half the names of found elements contain searched data")
    public void validateThatAtLeastHalfTheNamesOfFoundElementsContainSearchedData() {
                assertTrue(searchResultsPage.actualFoundResults.stream()
                .filter(webElement -> webElement.getText().contains("Laptop")).count() >=10);
    }
}

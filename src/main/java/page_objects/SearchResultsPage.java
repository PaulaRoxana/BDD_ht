package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class SearchResultsPage extends BasePage{
    @FindBy(xpath = "//img[starts-with(@alt,\"Redragon S101\")]")
    private WebElement REDRAGON_KEYBOARD;
    @FindBy(xpath = "//span[contains(@class, 'a-size-mini')][contains(@class, 'a-spacing-none')][contains(@class, 'a-color-base')][contains(@class, 's-line-clamp-2')]")
    private List<WebElement> pageObjectSearchResultsForSonyLocator;
    @FindBy(xpath = "//*[contains(@class, 'a-size-base')][text() = 'Sony']//preceding-sibling::*")
    private WebElement sonyLocator;
    @FindBy(xpath = "//*[contains(text(),'$200 & Above')]")
    private WebElement priceLocator;
    @FindBy(xpath = "//div[contains(@class,'puis-include-cont')]//span[contains(@class,'a-price-whole')]")
    private List<WebElement> searchResultsAccordingToPriceLocator;
    @FindBy(className = "a-dropdown-label")
    private WebElement sortLocator;
    @FindBy(xpath = "//*[@id=\"s-result-sort-select_1\"]")
    private WebElement sortFromLowToHighLocator;
    @FindBy(className="a-dropdown-prompt")
    private WebElement assertionElementAfterSorting;

    public static final By noResultsElement = By.xpath("//span[text()='No results for '] ");
    public static final By resultForProductToBeFound = By.xpath("//span[text()='\"laptop\"']");

    @FindBy (xpath="//a/span[contains(text(), 'Laptop') and contains(text(), 'Windows')]")
    public
    List<WebElement> actualFoundResults;
    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }
    public ProductsPage clickRedragon(){
        REDRAGON_KEYBOARD.click();
        return new ProductsPage(driver);
    }


    public SearchResultsPage clickOnSony(){
        sonyLocator.click();
        return new SearchResultsPage(driver);
    }
    public List<WebElement> returnSearchResultsForSony(){
        return pageObjectSearchResultsForSonyLocator;
    }
    public SearchResultsPage clickOnPriceRangeOption(){

        priceLocator.click();
        return new SearchResultsPage(driver);
    }
    public List<WebElement> returnSearchResultsForPriceRangeOption(){

        return searchResultsAccordingToPriceLocator;
    }
    public SearchResultsPage clickOnSort(){

        sortLocator.click();
        return new SearchResultsPage(driver);
    }
    public SearchResultsPage clickOnSortFromLowToHigh(){

        sortFromLowToHighLocator.click();
        return new SearchResultsPage(driver);
    }
    public String getTextOfAssertionElementAfterSorting(){

        return assertionElementAfterSorting.getText();
    }


    public String noResultsWereFound(){
        WebElement noResults = new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.presenceOfElementLocated(noResultsElement));
      return  noResults.getText();
    }


    public String resultsWereFound() {
        WebElement foundResults = new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions.presenceOfElementLocated(resultForProductToBeFound));
        return foundResults.getText();
    }
}

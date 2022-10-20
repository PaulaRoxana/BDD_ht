package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductsPage extends BasePage{
    public static final By ADD_TO_CART = By.xpath("//input[@id=\"add-to-cart-button\"]");

//    @FindBy(xpath = "//span[contains(text(), 'Amazon Basics 48 Count (Pack of 1)')]")
//    public WebElement aProductToShip;

  //  public static final By shippingDestination = By.xpath("(//span[text()=' No Import Fees Deposit & $14.02 Shipping to Poland '])[3]");

    public static By aProductToShip = By.xpath("//span[contains(text(), 'Redragon S101 Wired Gaming Keyboard and Mouse Combo RGB Backlit Gaming Keyboard')]");

    public  static final By shippingDestination = By.xpath("(//span[contains(text(), 'Shipping to Poland')])[1]");
    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public String productsAreShippingToPoland(){
        new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions.presenceOfElementLocated(aProductToShip)).click();
        return new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions.presenceOfElementLocated(shippingDestination)).getText();

    }

}

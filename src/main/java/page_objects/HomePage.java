package page_objects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends BasePage {


    public static final By productsCategory = By.xpath(" //img[@data-a-hires='https://images-na.ssl-images-amazon.com/images/G/01/AmazonExports/Fuji/2021/June/Fuji_Quad_Keyboard_2x._SY232_CB667159063_.jpg']");
    //div[@id='vPc0rf4PTUTlldbJQoZL2A']//span[text()='Keyboards']
    //img[@data-a-hires='https://images-na.ssl-images-amazon.com/images/G/01/AmazonExports/Fuji/2021/June/Fuji_Quad_Keyboard_2x._SY232_CB667159063_.jpg']
    //public static final By productsCategory = By.xpath("//div//img[@alt='Electronics']");


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void openAmazonHomePageAndJustGoToTopBar() {
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        new TopBar(driver);
    }

    public ProductPage clickOnAnyProductsCategory() {
        new WebDriverWait(driver, Duration.ofSeconds(30))
                .until(ExpectedConditions.presenceOfElementLocated(productsCategory)).click();
        return new ProductPage(driver);

    }
}
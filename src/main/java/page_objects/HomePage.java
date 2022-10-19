package page_objects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends BasePage {


    public static final By productsCategory = By.xpath("//div[@id='kP2xHmji5mGjWrhVX24SkA']//span[text()='Keyboards']");
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

    public ProductsPage clickOnAnyProductsCategory() {
        WebElement anyProductsCategory =  new WebDriverWait(driver, Duration.ofSeconds(45))
                .until(ExpectedConditions.presenceOfElementLocated(productsCategory));
        anyProductsCategory.click();
        anyProductsCategory.click();
        return new ProductsPage(driver);

    }
}
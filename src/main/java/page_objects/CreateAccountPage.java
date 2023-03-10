package page_objects;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
@Getter
public class CreateAccountPage extends BasePage {

    // public WebDriver driver;
    private static final By firstNameField = By.id("firstName");
    private static final By lastNameField = By.id("lastName");
    private static final By emailField = By.id("email");
    private static final By passwordField = By.id("password");
    private static final By confirmPasswordField = By.id("confirmPassword");
    private static final By sendTipsCheckbox =
            By.cssSelector(".vv-form-control-icon.material-icons");

    private final WebElement checkboxInput = driver.findElement(By.cssSelector("input[type='checkbox']"));
    private final WebElement checkboxLabel = driver.findElement(By.xpath("//span[text()='Send me weekly savings tips and financial news.']"));
    private static By signUpAndGetYourScoreButton =
            By.cssSelector(".vv-btn.w-100.vv-btn-big.d-inline-block.vv-btn");

    private static By firstNameLabel = By.cssSelector("label[for='firstName']");
    private static By lastNameLabel = By.cssSelector("label[for='lastName']");
    private static By emailLabel = By.cssSelector("label[for='email']");
    private static By passwordLabel = By.cssSelector("label[for='password']");
    private static By confirmPasswordLabel = By.cssSelector("label[for='confirmPassword']");

    //  List<WebElement> listOfFields2 = driver.findElements(By.cssSelector("label[for]"));

    //  public List<WebElement> shortList = driver.findElements(By.cssSelector("label[for='firstName'],[for='lastName']"));

    public CreateAccountPage(WebDriver driver) {
        super(driver);
    }

    public CreateAccountPage openUserRegistrationPage() {
        driver.get("https://beta.savvymoney.com/ui/page/194/onboarding/sign-up");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
        driver.manage().window().maximize();
        return this;
    }

    public List<String> validateFieldsOnTheSignUpForm() {
        List<String> listOfFields = new ArrayList<String>();
        listOfFields.add(driver.findElement(firstNameLabel).getText());
        listOfFields.add(driver.findElement(lastNameLabel).getText());
        listOfFields.add(driver.findElement(emailLabel).getText());
        listOfFields.add(driver.findElement(passwordLabel).getText());
        listOfFields.add(driver.findElement(confirmPasswordLabel).getText());
        System.out.println(listOfFields);
        return listOfFields;
    }
}
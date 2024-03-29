package org.example.stepdefinitions;

import browsers.factory.WebDriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class BaseSteps {
    public static final Map<String, BasePage> PAGES_STORAGE = new HashMap<>();
    public static WebDriver driver;
    @Before
    public void initWebDriver() {
        driver = new WebDriverFactory().getWebDriver();
        driver.get("https://beta.savvymoney.com/ui/page/194/onboarding/sign-up");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
        driver.manage().window().maximize();
    }
    @After
    public void afterScenario() {
       // driver.close();
        driver.quit();
        PAGES_STORAGE.clear();
    }
}

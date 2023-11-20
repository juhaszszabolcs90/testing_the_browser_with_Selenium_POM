import org.example.WebdriverSetup;
import org.example.task01Navigation.Navigation;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestCheckBox4 {
    WebDriver driver;

    @BeforeEach
    public void setUp() {
        driver = WebdriverSetup.getDriver();
    }

    @Test
    public void runCheckBoxTest() {
        driver.get(("https://web.archive.org/web/20180926132852/http://www.seleniumeasy.com/test/basic-first-form-demo.html"));
        Navigation navigation = new Navigation();
        navigation.navigateToCheckBoxDemo(driver);
//        Thread.sleep(4000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        wait.until(ExpectedConditions.urlToBe("https://web.archive.org/web/20180926132852/http://www.seleniumeasy.com/test/basic-checkbox-demo.html"));
    }


    @AfterEach
    public void tearDown() {
        WebdriverSetup.quitDriver();
    }
}

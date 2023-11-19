import org.example.WebdriverSetup;
import org.example.task01Navigation.Navigation;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNavigation {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = WebdriverSetup.getDriver();
    }

    @Test
    public void runNavigationTest() {
        driver.get(("https://web.archive.org/web/20180926132852/http://www.seleniumeasy.com/test/basic-first-form-demo.html"));
        Navigation.navigateToSimpleFormDemo(driver);
    }


    @AfterClass
    public void tearDown() {
        WebdriverSetup.quitDriver();
    }

}
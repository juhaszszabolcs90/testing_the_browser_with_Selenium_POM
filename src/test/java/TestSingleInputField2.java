import org.example.WebdriverSetup;
import org.example.task01Navigation.Navigation;
import org.example.task02SingleFieldAndButton.SingleInputField;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class TestSingleInputField2 {
    WebDriver driver;

    @BeforeEach
    public void setUp() {
        driver = WebdriverSetup.getDriver();
    }

    @ParameterizedTest
    @CsvFileSource(resources = "message.csv", numLinesToSkip = 1)
    public void runTestSingleInputfield(String firstColumn, String secondColumn) {
        driver.get("https://web.archive.org/web/20180926132852/http://www.seleniumeasy.com/test/basic-first-form-demo.html");
        Navigation.navigateToSimpleFormDemo(driver);
        SingleInputField singleInputField = new SingleInputField(driver);
        singleInputField.runSingleInput(firstColumn);
        System.out.println(firstColumn);
    }

    @AfterEach
    public void tearDown() {
        WebdriverSetup.quitDriver();
    }
}

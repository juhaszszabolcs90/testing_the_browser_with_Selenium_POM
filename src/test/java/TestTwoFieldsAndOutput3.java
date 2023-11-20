import org.example.WebdriverSetup;
import org.example.task01Navigation.Navigation;
import org.example.task03TwoFieldsAndOutput.TwoInputFields;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.openqa.selenium.WebDriver;

public class TestTwoFieldsAndOutput3 {
    WebDriver driver;

    @BeforeEach
    public void setUp() {
        driver = WebdriverSetup.getDriver();
    }

    @ParameterizedTest
    @CsvFileSource(resources = "two_value.csv", numLinesToSkip = 1)
    public void runTestSingleInputfield(String firstValue, String secondValue) throws InterruptedException {
        driver.get("https://web.archive.org/web/20180926132852/http://www.seleniumeasy.com/test/basic-first-form-demo.html");
        Navigation.navigateToSimpleFormDemo(driver);

        TwoInputFields twoInputFields = new TwoInputFields(driver);
        twoInputFields.runTwoFieldsAndOutput(firstValue, secondValue);
//        System.out.println(twoInputFields.getResutl());
//        System.out.println(firstValue);
//        System.out.println(secondValue);
        Thread.sleep(4000);
    }

    @AfterEach
    public void tearDown() {
        WebdriverSetup.quitDriver();
    }
}

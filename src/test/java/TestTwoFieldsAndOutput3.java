import org.example.WebdriverSetup;
import org.example.task01Navigation.Navigation;
import org.example.task03TwoFieldsAndOutput.TwoInputFields;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.Assert;

public class TestTwoFieldsAndOutput3 {

    @ParameterizedTest
    @CsvFileSource(resources = "two_value.csv", numLinesToSkip = 1)
    public void runTestSingleInputfield(String firstValue, String secondValue, String expectedValue) throws InterruptedException {
        Navigation navigation = new Navigation();
        navigation.navigateToSimpleFormDemo();

        TwoInputFields twoInputFields = new TwoInputFields();
        twoInputFields.runTwoFieldsAndOutput(firstValue, secondValue);
        String actualValue = twoInputFields.getResutl();

        Assert.assertEquals(expectedValue, actualValue);
        Thread.sleep(4000);
    }

    @AfterEach
    public void tearDown() {
        WebdriverSetup.quitDriver();
    }
}

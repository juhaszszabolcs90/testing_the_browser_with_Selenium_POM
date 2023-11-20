import org.example.WebdriverSetup;
import org.example.task01Navigation.Navigation;
import org.example.task02SingleFieldAndButton.SingleInputField;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class TestSingleInputField2 {

    @ParameterizedTest
    @CsvFileSource(resources = "message.csv", numLinesToSkip = 1)
    public void runTestSingleInputfield(String firstColumn, String secondColumn) throws InterruptedException {
        Navigation navigation = new Navigation();
        Thread.sleep(2500);
        navigation.navigateToSimpleFormDemo();

        SingleInputField singleInputField = new SingleInputField();
        singleInputField.runSingleInput(firstColumn);
        System.out.println(firstColumn);
        Thread.sleep(2500);
    }

    @AfterEach
    public void tearDown() {
        WebdriverSetup.quitDriver();
    }
}

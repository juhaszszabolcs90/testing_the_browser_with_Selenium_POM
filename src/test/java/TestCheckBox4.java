import org.example.WebdriverSetup;
import org.example.task01Navigation.Navigation;
import org.junit.jupiter.api.AfterEach;
import org.testng.annotations.Test;

public class TestCheckBox4 {
    @Test
    public void runCheckBoxTest() {
        Navigation navigation = new Navigation();
        navigation.navigateToCheckBoxDemo();
    }

    @AfterEach
    public void tearDown() {
        WebdriverSetup.quitDriver();
    }
}

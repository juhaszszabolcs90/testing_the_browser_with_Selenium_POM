import org.example.WebdriverSetup;
import org.example.task01Navigation.Navigation;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class TestNavigation {
    @Test
    public void runNavigationTest() {
        Navigation navigation = new Navigation();
        navigation.navigateToSimpleFormDemo();
    }

    @AfterClass
    public void tearDown() {
        WebdriverSetup.quitDriver();
    }
}
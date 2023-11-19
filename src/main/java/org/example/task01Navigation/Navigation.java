package org.example.task01Navigation;

import org.openqa.selenium.WebDriver;

public class Navigation {

    public static void navigateToSimpleFormDemo(WebDriver driver) {
        InputFormsPage inputFormsPage = new InputFormsPage(driver);
        SimpleFormDemoPage simpleFormDemoPage = new SimpleFormDemoPage(driver);

        inputFormsPage.clickInputForm();
        simpleFormDemoPage.clickSimpleForm();
    }
}
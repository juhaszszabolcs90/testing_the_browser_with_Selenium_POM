package org.example.task01Navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Navigation {
    WebDriver driver;

    public static void navigateToSimpleFormDemo(WebDriver driver) {
        InputFormsPage inputFormsPage = new InputFormsPage(driver);
        SimpleFormDemoPage simpleFormDemoPage = new SimpleFormDemoPage(driver);

        inputFormsPage.clickInputForm();
        simpleFormDemoPage.clickSimpleForm();
    }
}
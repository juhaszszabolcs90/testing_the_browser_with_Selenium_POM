package org.example.task01Navigation;

import org.example.WebdriverSetup;
import org.example.task04Checkbox.CheckBoxPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Navigation {
    WebDriver driver;
    public final String URL = "https://web.archive.org/web/20180926132852/http://www.seleniumeasy.com/test/basic-first-form-demo.html";
    @FindBy(xpath = "//*[@id=\"treemenu\"]/li/ul/li[1]/a")
    WebElement inputForm;
    //*[text()[contains(.,'Simple Form Demo')]]
    //a[text()='Simple Form Demo']
    //a[contains(.,'Simple Form Demo')]
    //*[@id="treemenu"]/li/ul/li[1]/ul/li[1]/a
    @FindBy(xpath = "//*[@id=\"treemenu\"]/li/ul/li[1]/ul/li[1]/a")
    WebElement simpleFormDemo;

    public Navigation() {
        this.driver = WebdriverSetup.getDriver();
        driver.get(URL);
        PageFactory.initElements(driver, this);
    }

    public void clickInputForm() {
        inputForm.click();
    }

    public void clickSimpleForm() {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//        wait.until(ExpectedConditions.elementToBeClickable(simpleFormDemo)).click();
        simpleFormDemo.click();
    }

    public void navigateToSimpleFormDemo() {
        clickInputForm();
        clickSimpleForm();
    }

    public void navigateToCheckBoxDemo(WebDriver driver) {
        clickInputForm();
        CheckBoxPage checkBoxPage = new CheckBoxPage(driver);
        checkBoxPage.clickCheckBoxLink();
    }
}
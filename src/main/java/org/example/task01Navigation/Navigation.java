package org.example.task01Navigation;

import org.example.WebdriverSetup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Navigation {
    WebDriver driver;
    public final String URL = "https://web.archive.org/web/20180926132852/http://www.seleniumeasy.com/test/basic-first-form-demo.html";
    @FindBy(xpath = "//*[@id=\"treemenu\"]/li/ul/li[1]/a")
    WebElement inputForm;
    @FindBy(xpath = "//*[@id=\"treemenu\"]/li/ul/li[1]/ul/li[1]/a")
    WebElement simpleFormDemo;

    @FindBy(xpath = "//*[@id=\"treemenu\"]/li/ul/li[1]/ul/li[2]/a")
    WebElement checkBoxLink;

    public Navigation() {
        this.driver = WebdriverSetup.getDriver();
        driver.get(URL);
        PageFactory.initElements(driver, this);
    }

    public void clickInputForm() {
        inputForm.click();
    }

    public void clickSimpleForm() {
        simpleFormDemo.click();
    }

    public void navigateToSimpleFormDemo() {
        clickInputForm();
        clickSimpleForm();
    }

    public void navigateToCheckBoxDemo() {
        clickInputForm();
        clickCheckBoxLink();
    }

    public void clickCheckBoxLink() {
        checkBoxLink.click();
    }
}
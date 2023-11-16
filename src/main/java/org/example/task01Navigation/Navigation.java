package org.example.task01Navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Navigation {
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"treemenu\"]/li/ul/li[1]/a") WebElement inputForm;
    @FindBy(xpath = "//*[@id=\"treemenu\"]/li/ul/li[1]/ul/li[1]/a") WebElement simpleFormDemo;

    public Navigation(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickInputForm() {
        inputForm.click();
    }

    public void clickSimpleForm() {
        simpleFormDemo.click();
    }

    public void clickInputAndSimpleForm() {
        clickInputForm();
        clickSimpleForm();
    }
    public void testNavigation() {
        driver.get("https://web.archive.org/web/20180926132852/http://www.seleniumeasy.com/test/basic-first-form-demo.html");

    }

}
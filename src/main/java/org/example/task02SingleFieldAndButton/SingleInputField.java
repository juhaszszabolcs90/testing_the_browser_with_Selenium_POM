package org.example.task02SingleFieldAndButton;

import org.example.WebdriverSetup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SingleInputField {
    WebDriver driver;
    @FindBy(id = "user-message")
    WebElement singleInputField;
    public final String URL = "https://web.archive.org/web/20180926132852/http://www.seleniumeasy.com/test/basic-first-form-demo.html";

    @FindBy(xpath = "//*[@id=\"get-input\"]/button")
    WebElement messageDisplayer;

    public SingleInputField() {
        this.driver = WebdriverSetup.getDriver();
        driver.get(URL);
        PageFactory.initElements(driver, this);
    }

    public void clickSingleInputField() {
        singleInputField.click();
    }

    public void enterTextToSingleInputField(String message) {
        singleInputField.sendKeys(message);
    }

    public void showMessage() {
        messageDisplayer.click();
        messageDisplayer.getText();
    }

    public void runSingleInput(String message) {
        clickSingleInputField();
        enterTextToSingleInputField(message);
        showMessage();
    }
}

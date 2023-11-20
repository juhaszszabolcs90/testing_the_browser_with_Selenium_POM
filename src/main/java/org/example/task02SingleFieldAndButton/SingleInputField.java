package org.example.task02SingleFieldAndButton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SingleInputField {
    WebDriver driver;
    @FindBy(id = "user-message") WebElement singleInputField;

    @FindBy(xpath = "//*[@id=\"get-input\"]/button") WebElement messageDisplayer;

    public SingleInputField(WebDriver driver) {
        this.driver = driver;
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

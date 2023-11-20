package org.example.task03TwoFieldsAndOutput;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TwoInputFields {
    WebDriver driver;
    @FindBy(id = "sum1") WebElement firstValueBox;
    @FindBy(id = "sum2") WebElement secondValueBox;
    @FindBy(xpath = "//*[@id=\"gettotal\"]/button") WebElement submitButton;
    @FindBy(id = "displayvalue") WebElement displayValue;

    private void addFirstValue(String value1) {
        firstValueBox.sendKeys(value1);
    }

    public TwoInputFields(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    private void addSecondValue(String value2) {
        secondValueBox.sendKeys(value2);
    }

    private void clickSubmitButton() {
        submitButton.click();
    }

    private void displayValue() {
        displayValue.click();
    }

    public void runTwoFieldsAndOutput(String value1, String value2) {
        addFirstValue(value1);
        addSecondValue(value2);
        clickSubmitButton();
        displayValue();
    }

    public String getResutl() {
        return displayValue.getText();
    }
}

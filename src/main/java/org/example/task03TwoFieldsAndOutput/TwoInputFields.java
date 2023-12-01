package org.example.task03TwoFieldsAndOutput;

import org.example.WebdriverSetup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TwoInputFields {
    WebDriver driver;
    public final String URL = "https://web.archive.org/web/20180926132852/http://www.seleniumeasy.com/test/basic-first-form-demo.html";
    @FindBy(id = "sum1") WebElement firstValueBox;
    @FindBy(id = "sum2") WebElement secondValueBox;
    @FindBy(xpath = "//*[@id=\"gettotal\"]/button") WebElement submitButton;
    @FindBy(id = "displayvalue") WebElement displayValue;

    private void addFirstValue(String value1) {
        firstValueBox.sendKeys(value1);
    }

    public TwoInputFields() {
        this.driver = WebdriverSetup.getDriver();
        driver.get(URL);
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

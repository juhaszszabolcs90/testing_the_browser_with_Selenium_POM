package org.example.task04Checkbox;

import org.example.WebdriverSetup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckBoxPage {
    WebDriver driver;

//    <a href="./basic-checkbox-demo.html">Checkbox Demo</a>
    //*[contains(text(),'Checkbox Demo')]
    @FindBy(xpath = "//*[contains(text(),'Checkbox Demo')]")
    WebElement checkBoxLink;
    public final String URL = "https://web.archive.org/web/20180926132852/http://www.seleniumeasy.com/test/basic-first-form-demo.html";

    public CheckBoxPage(WebDriver driver) {
        this.driver = WebdriverSetup.getDriver();
        driver.get(URL);
        PageFactory.initElements(driver, this);
    }

    public void clickCheckBoxLink() {
        checkBoxLink.click();
    }
}

package org.example.task04Checkbox;

import org.example.WebdriverSetup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckBoxPage {
    WebDriver driver;

//    <a href="./basic-checkbox-demo.html">Checkbox Demo</a>
    //*[contains(text(),'Checkbox Demo')]
//*[@id="treemenu"]/li/ul/li[1]/ul/li[2]/a
    @FindBy(xpath = "//*[@id=\"treemenu\"]/li/ul/li[1]/ul/li[2]/a")
    WebElement checkBoxLink;
    public final String URL = "https://web.archive.org/web/20180926132852/http://www.seleniumeasy.com/test/basic-first-form-demo.html";

    public CheckBoxPage() {
        this.driver = WebdriverSetup.getDriver();
        driver.get(URL);
        PageFactory.initElements(driver, this);
    }

    public void clickCheckBoxLink() {
//        checkBoxLink.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(checkBoxLink)).click();
    }
}

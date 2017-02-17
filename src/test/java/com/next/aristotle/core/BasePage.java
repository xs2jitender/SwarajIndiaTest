package com.next.aristotle.core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasePage {

    private WebDriver driver= new FirefoxDriver();;

    public void getPage(String url) {
        driver.get(url);
    }

    public void closeBrowser() {
        driver.quit();
    }

    protected void clickOn(By by) {
        driver.findElement(by).click();
    }

    protected void typeIn(By txtBox, String textToType) {
        driver.findElement(txtBox).sendKeys(textToType);
    }
}

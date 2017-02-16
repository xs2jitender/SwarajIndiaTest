package com.next.aristotle.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasePage {


    protected WebDriver driver= new FirefoxDriver();;

    public void getHomePage() {
        driver.get("https://dockercon.smarteventscloud.com/portal/newreg.ww");
    }

    public void closeBrowser() {
        driver.quit();
    }

    protected void clickOn(By by) {
        driver.findElement(by).click();
    }
}

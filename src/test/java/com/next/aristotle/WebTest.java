package com.next.aristotle;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTest {
    @Given("^that i am a user$")
    public void that_i_am_a_user(){

    }

    @When("^I enter www\\.google\\.com$")
    public void i_enter_www_google_com() throws InterruptedException {
    WebDriver driver =new FirefoxDriver();
    driver.get("http://www.ndtv.com");
    Thread.sleep(2*1000);
    driver.quit();
    }

}

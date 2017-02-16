package com.next.aristotle.stepDefinitions;

import com.next.aristotle.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class WebTest {

    private HomePage homePage = new HomePage();

    @Given("^that i am a user$")
    public void that_i_am_a_user(){

    }

    @When("^I enter www\\.docker\\.com$")
    public void i_enter_www_google_com() {
        homePage.getHomePage();
    }


    @And("^I start registration process$")
    public void iStartRegistrationProcess() {
        homePage.startRegistration();
    }

    @And("^I close browser$")
    public void iCloseBrowser() {
        homePage.closeBrowser();
    }
}

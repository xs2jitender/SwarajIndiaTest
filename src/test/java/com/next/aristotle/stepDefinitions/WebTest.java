package com.next.aristotle.stepDefinitions;

import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.loader.FixtureFactoryLoader;
import com.next.aristotle.domain.userRegistration.UserRegistration;
import com.next.aristotle.pages.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class WebTest {

    private String homePageUrl = "https://dockercon.smarteventscloud.com/portal/newreg.ww";
    private HomePage homePage = new HomePage();

    @Before
    public static void setUp() {
        FixtureFactoryLoader.loadTemplates("com.next.aristotle.dataProvider");
    }

    @Given("^that i am a user$")
    public void that_i_am_a_user() {

    }

    @When("^I enter www\\.docker\\.com$")
    public void i_enter_www_google_com() {
        homePage.getPage(homePageUrl);
    }

    @And("^I start registration process$")
    public void iStartRegistrationProcess() {
        homePage.startRegistration();
    }

    @And("^I close browser$")
    public void iCloseBrowser() {
        homePage.closeBrowser();
    }

    @Given("^dataProvider prints users data for (.*)$")
    public void dataproviderPrintsUsersData(String userType) {
        UserRegistration userRegistration = Fixture.from(UserRegistration.class).gimme(userType);
        System.out.println(userRegistration.getName());
        System.out.println(userRegistration.getEmailId());
        System.out.println(userRegistration.getPassword());
        System.out.println(userRegistration.getPhoneNumber());
        System.out.println(userRegistration.getNri());
    }
}

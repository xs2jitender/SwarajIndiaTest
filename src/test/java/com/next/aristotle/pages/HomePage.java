package com.next.aristotle.pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage {

    private By startRegistration =  By.id("regCodeButton");

    public RegistrationPage startRegistration() {
        clickOn(startRegistration);
        return new RegistrationPage();
    }



}

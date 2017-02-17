package com.next.aristotle.pages;

import com.next.aristotle.core.BasePage;
import com.next.aristotle.domain.userRegistration.UserRegistration;
import org.openqa.selenium.By;

public class HomePage extends BasePage {

    private By startRegistration =  By.id("regCodeButton");
    private By txtName = By.id("name");



    public RegistrationPage startRegistration() {
        clickOn(startRegistration);
        return new RegistrationPage();
    }


    public void registerUser(UserRegistration userRegistration) {

        typeIn(txtName, userRegistration.getEmailId());
    }
}

package com.next.aristotle.domain.userRegistration;

public class UserRegistration {
    private String name;
    private String emailId;
    private String password;
    private String phoneNumber;
    private Boolean isNri;

    public UserRegistration() {
        this.name = "Dummy Name";
        this.emailId = "Dummy@emailid.com";
        this.password = "DummyPassword";
        this.phoneNumber="0000000000";
        this.isNri=false;
    }

    public String getName() {
        return name;
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Boolean getNri() {
        return isNri;
    }

}

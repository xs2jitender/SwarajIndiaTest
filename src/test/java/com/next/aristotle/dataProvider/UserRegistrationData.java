package com.next.aristotle.dataProvider;

import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.Rule;
import br.com.six2six.fixturefactory.loader.TemplateLoader;
import com.next.aristotle.domain.userRegistration.UserRegistration;

public class UserRegistrationData implements TemplateLoader {

    public void load() {
        Fixture.of(UserRegistration.class).addTemplate("ValidNonNri", new Rule() {
            {
                add("name", random("Jitender", "Poonam", "Samar"));
                add("emailId", random("${name}@test.com"));
                add("password", "password");
                add("phoneNumber", random("0000000000", "1111111111"));
                add("isNri", "No");
            }
        });


        Fixture.of(UserRegistration.class).addTemplate("ValidNri", new Rule() {
            {
                add("name", random("Jitender", "Poonam", "Samar"));
                add("emailId", random("${name}@test.com"));
                add("password", "password");
                add("phoneNumber", random("0000000000", "1111111111"));
                add("isNri", "Yes");
            }
        });
    }


}

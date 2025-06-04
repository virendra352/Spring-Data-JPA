package com.Applicant.customPropertiesLoad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class EnviornmentTest {
    @Autowired
    Environment environment;

    public void printAppDetails() {
        //Get Properties file data

        System.out.println("App Name: " + environment.getProperty("app.name"));
        System.out.println("App Version: " + environment.getProperty("app.version"));

        //get A System variable data
        System.out.println("System User: " + environment.getProperty("user.name"));

        //Get Active profile using environment interface by Autowired
        String[] profiles = environment.getActiveProfiles();
        System.out.println("Active Profiles: " + String.join(", ", profiles));


    }
}

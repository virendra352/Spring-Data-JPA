package com.Applicant.customPropertiesLoad;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@PropertySource("classpath:config.properties")
@Configuration
public class AppConfigLoad {
    @Value("${app.name}")
    String name;
    @Value("${app.version}")
    String version;

    public void printConfig() {
        System.out.println("App Name: " + name);
        System.out.println("App Version: " + version);
    }
}

package com.Applicant.customPropertiesLoad;

import org.slf4j.Logger;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigurationBean {

    @Bean
    @ConditionalOnProperty(name = "my.service.email",matchIfMissing = false,havingValue = "true")
    //create a EmailService bean if my.service.email property is present with true value in properties file
    public EmailService emailServiceMethod(){
        return new EmailService();
    }

    @Bean
    @ConditionalOnMissingBean(EmailService.class)
    //if EmailService bean is missing then it will create NotificationService
    public NotificationService NotificationServiceBean() {
        return new NotificationService();  // A default implementation
    }

    @Bean
    @ConditionalOnBean(NotificationService.class)
    //if NotificationService bean is present then create MessageNotification bean
    public MessageNotification messageNotification(){
        return  new MessageNotification();
    }

    @Bean
    @ConditionalOnClass(name = "org.springframework.web.client")
    //✅ Loaded if Kafka libraries are present.
    //❌ Not loaded if Kafka dependencies are not on the classpath.
    public RestTemplate kafkaProducerService() {
        return new RestTemplate() ;
    }
}

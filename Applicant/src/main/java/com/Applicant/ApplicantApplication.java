package com.Applicant;

import com.Applicant.customPropertiesLoad.AppConfigLoad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import java.util.Arrays;
import java.util.Objects;

@SpringBootApplication
@EnableJpaRepositories
@EnableWebSecurity
public class ApplicantApplication {


	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(ApplicantApplication.class, args);
		Object[] beanDefinitionNames = run.getBeanDefinitionNames();
		System.out.println("All Beans of APP : "+ Arrays.toString(beanDefinitionNames));
		for (Object s:beanDefinitionNames ){
			if(Objects.equals(s,"appConfigLoad")){
				System.out.println();
			}
		}




		//Spring Bean life cycle
		//1️⃣ Application Start – Your Spring Boot application initializes.
		//2️⃣ Container Instantiation – Spring creates an ApplicationContext, which acts as the container managing beans.
		//3️⃣ Bean Creation – Spring scans for beans and creates objects as defined in the configuration.
		//4️⃣ Dependency Injection – If beans rely on other components, Spring injects the necessary dependencies automatically.
		//5️⃣ Initialization (@PostConstruct or init()) – If a bean needs to perform setup actions, Spring calls the init() method or a method marked with @PostConstruct.
		//6️⃣ Utility Method Execution – The bean serves its purpose by running application logic.
		//7️⃣ Destruction (@PreDestroy or destroy()) – Before shutting down, Spring runs cleanup logic through a method marked with @PreDestroy.
	}

}

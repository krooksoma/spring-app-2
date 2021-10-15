package com.defaria.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//defines the path for application:properties
@PropertySource("classpath:application.properties")
@ComponentScan(basePackages = "com.defaria")
public class ApplicationConfig {

}

/*//lines below set up the variable to be injected from the application.properties file
    @Value("${app.greeting}")
    private String greeting;

    @Value("${app.name}")
    private String name;
//#{} means you spell. creating new boolean, use the environment(systemOs, vm args, Spring application args, configuration)
    @Value("#{new Boolean(environment['spring.profiles.active']!='dev')}")
    private boolean is24;

    @Autowired
    private GreetingService greetingService;
    @Autowired
    private TimeService timeService;

//name add -prod on VM options -Dspring.profiles.active=prod
    @Bean
    public TimeService timeService(){
        return new TimeService(is24);
    }

    @Bean
    public OutputService outputService(){
        return new OutputService(greetingService, timeService, name);
    }

    @Bean
    public GreetingService greetingService(){
        return new GreetingService(greeting);
    }*/
//}
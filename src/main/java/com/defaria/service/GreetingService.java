package com.defaria.service;

import com.defaria.aspect.Loggable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

//stereotype of app component
@Service
public class GreetingService {

    @Value("${app.greeting}")
    private String greeting;

    public GreetingService(){
        super();
    }

    @Loggable
    public String getGreeting(String name){
        return greeting + " " + name;
    }
}

//    private final String greeting;

//    public GreetingService(String greeting){
//        super();
//        this.greeting = greeting;
//    }
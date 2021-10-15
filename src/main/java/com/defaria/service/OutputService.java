package com.defaria.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class OutputService {

    @Value("${app.name}")
    private String name;

    private final GreetingService greetingService;
    private final TimeService timeService;

    public OutputService(GreetingService greetingService, TimeService timeService){
        this.greetingService = greetingService;
        this.timeService = timeService;
    }

    public void generateOutput(){
        String output = timeService.getCurrentTime() + " " + greetingService.getGreeting(name);
        System.out.println(output);
    }

}

/*
    private final String name;

    public OutputService(GreetingService greetingService, TimeService timeService, String name){
        this.greetingService = greetingService;
        this.timeService = timeService;
        this.name = name;
    }

*/

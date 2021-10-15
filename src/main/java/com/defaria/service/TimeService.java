package com.defaria.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


@Service
public class TimeService {


    @Value("#{new Boolean(environment['spring.profiles.active']!='dev')}")
    private boolean is24;

    private static final DateTimeFormatter FORMATTER_24 = DateTimeFormatter.ofPattern("HH:mm:ss");
    private static final DateTimeFormatter FORMATTER_12 = DateTimeFormatter.ofPattern("hh:mm:ss a");


    public TimeService(){
        super();
    }


    public String getCurrentTime(){
        LocalDateTime now = LocalDateTime.now();
        if (is24) {
            return FORMATTER_24.format(now);
        }
        return FORMATTER_12.format(now);
    }

}


/*    private final boolean is24;

    public TimeService(boolean is24){
        this.is24 = is24;
    }*/

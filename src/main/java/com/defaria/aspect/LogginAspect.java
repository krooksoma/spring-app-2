package com.defaria.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogginAspect {

    @Pointcut("@annotation(Loggable)")
    public void executeLogging(){
    }
}

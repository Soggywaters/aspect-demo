package com.rhinh.aspectdemo;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.*;

@Aspect
@Component
public class LogAspect {
    @Pointcut(value = "@annotation(com.ford.griffin.logging.annotations.RaiseVictorOpsIncident)")
    private void logBefore() { }

    @Before("logBefore()")
    public String print() {
        System.out.println("before hello");
        return null;
    }
}

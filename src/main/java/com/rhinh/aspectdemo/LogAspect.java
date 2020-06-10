package com.rhinh.aspectdemo;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.*;

@Aspect
@Component
public class LogAspect {
    @Pointcut(value = "execution(* Account.sayHello(..))")
    private void logBefore() { }

    @Before("logBefore()")
    public String print() {
        System.out.println("before hello");
        return null;
    }
}

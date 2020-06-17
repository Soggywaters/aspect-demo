package com.rhinh.aspectdemo;

import com.ford.griffin.logging.annotations.RaiseVictorOpsIncident;

public class Account {

    @RaiseVictorOpsIncident
    public String sayHello() {
        System.out.println("hello from method");
        return "hello";
    }

}

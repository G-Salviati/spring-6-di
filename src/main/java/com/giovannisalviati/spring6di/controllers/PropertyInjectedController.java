package com.giovannisalviati.spring6di.controllers;

import com.giovannisalviati.spring6di.services.GreetingService;

public class PropertyInjectedController {
    GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}

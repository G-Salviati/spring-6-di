package com.giovannisalviati.spring6di.controllers;

import com.giovannisalviati.spring6di.services.GreetingService;
import com.giovannisalviati.spring6di.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }

    public String sayHello() {
        System.out.println("In MyController");

        return greetingService.sayGreeting();
    }
}



package com.giovannisalviati.spring6di.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello() {
        System.out.println("In MyController");

        return "Hello everyone!!!";
    }
}

package com.giovannisalviati.spring6di.services;

import org.springframework.stereotype.Service;

@Service("greetingServicePropertyBean")
public class GreetingServicePropertyInjected implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello from the GreetingService Property Injected Bean!!";
    }
}

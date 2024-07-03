package com.giovannisalviati.spring6di.services;

import org.springframework.stereotype.Service;

@Service("greetingServiceSetterBean")
public class GreetingServiceSetterInjected implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello from the GreetingService Setter Injected Bean!!";
    }
}

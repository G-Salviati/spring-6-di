package com.giovannisalviati.spring6di.controllers.i18n;

import com.giovannisalviati.spring6di.services.GreetingService;
import com.giovannisalviati.spring6di.services.i18n.EnglishGreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class Myi18NController {

    private final GreetingService greetingService;

    public Myi18NController(@Qualifier("i18NService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}

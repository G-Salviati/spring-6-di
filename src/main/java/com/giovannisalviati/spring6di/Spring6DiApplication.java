package com.giovannisalviati.spring6di;

import com.giovannisalviati.spring6di.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Spring6DiApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(Spring6DiApplication.class, args);

        System.out.println("In main");

        MyController myController = ctx.getBean(MyController.class);

        System.out.println(myController.sayHello());
    }
}

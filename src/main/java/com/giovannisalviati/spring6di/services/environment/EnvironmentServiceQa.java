package com.giovannisalviati.spring6di.services.environment;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("QA")
@Service
public class EnvironmentServiceQa implements EnvironmentService{
    @Override
    public String getEnv() {
        return "qa";
    }
}

package com.giovannisalviati.spring6di.services.environment;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("PROD")
@Service
public class EnvironmentServiceProd implements EnvironmentService{
    @Override
    public String getEnv() {
        return "prod";
    }
}

package com.giovannisalviati.spring6di.services.environment;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"DEV", "default"})
@Service
public class EnvironmentServiceDev implements EnvironmentService{
    @Override
    public String getEnv() {
        return "dev";
    }
}

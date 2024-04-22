package com.ironbank.starter;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

public class RejectProfileAppInitializer implements ApplicationContextInitializer {
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        if(applicationContext.getEnvironment().getActiveProfiles().length == 0){
            throw new RuntimeException("**please add some profile!\n for example\" --spring.profiles.active=winterIsHere\"");
        }
    }
}

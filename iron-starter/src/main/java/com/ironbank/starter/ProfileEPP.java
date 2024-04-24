package com.ironbank.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;

public class ProfileEPP implements EnvironmentPostProcessor {
    @Override
    public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {
        //if(environment.getActiveProfiles().length == 0){
            if(resolveTemperature()<-272){
                environment.addActiveProfile("winterIsHere");
            }else {
                environment.addActiveProfile("noWinter");
            }
        }
   // }

    private int resolveTemperature() {
        return -270;
    }
}

package com.ironbank;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@AutoConfiguration
public class IronConfiguration {
    @Bean
    public RavenListener ravenListener(){
        return new RavenListener();
    }

}

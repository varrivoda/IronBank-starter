package com.ironbank;

import com.ironbank.annotation.ConditionOnProduction;
import com.ironbank.annotation.RavenProperties;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@AutoConfiguration
@EnableConfigurationProperties(RavenProperties.class)
public class IronConfiguration {
    @Bean
    @ConditionOnProduction
    public RavenListener ravenListener(){
        return new RavenListener();
    }

}



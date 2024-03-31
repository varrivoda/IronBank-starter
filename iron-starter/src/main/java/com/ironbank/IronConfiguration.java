package com.ironbank;

import com.ironbank.annotation.ConditionOnProduction;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@AutoConfiguration
@ConditionOnProduction
public class IronConfiguration {
    @Bean
    public RavenListener ravenListener(){
        return new RavenListener();
    }

}

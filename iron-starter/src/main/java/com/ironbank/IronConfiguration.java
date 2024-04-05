package com.ironbank;

import com.ironbank.annotation.ConditionOnProduction;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@AutoConfiguration
@EnableConfigurationProperties(RavenProperties.class)
public class IronConfiguration {
    @Bean
    @ConditionOnProduction
    @ConditionalOnProperty("voron.destination")
    public RavenListener ravenListener(){
        return new RavenListener();
    }

}



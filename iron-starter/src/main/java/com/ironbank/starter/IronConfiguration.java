package com.ironbank.starter;

import com.ironbank.starter.annotation.ConditionOnProduction;
import com.ironbank.starter.annotation.ConditionalOnRaven;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@AutoConfiguration
@EnableConfigurationProperties(RavenProperties.class)
public class IronConfiguration {
    @Bean
    @ConditionOnProduction
    //@ConditionalOnProperty("voron.destination")
    @ConditionalOnRaven
    @ConditionalOnMissingBean
    public RavenListener ravenListener(){
        return new RavenListener();
    }
}



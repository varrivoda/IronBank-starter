package com.ironbank.annotation;

import org.springframework.boot.autoconfigure.condition.AllNestedConditions;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Condition;

public class RavenCondition extends AllNestedConditions {
    public RavenCondition(){//ConfigurationPhase configurationPhase) {
        super(ConfigurationPhase.REGISTER_BEAN);
    }

    @ConditionalOnProperty("voron.destination")
    public static class OnRavenProperty{}

    @ConditionalOnProperty(value="voron.enabled", havingValue = "true")
    public static class OnRavenEnabled{}

}

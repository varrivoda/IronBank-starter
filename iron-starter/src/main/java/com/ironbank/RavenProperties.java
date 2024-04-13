package com.ironbank;

import jdk.jfr.DataAmount;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import java.util.List;

@ConfigurationProperties("voron")
public class RavenProperties{
    @Setter @Getter
    List<String> destination;

    @Getter @Setter
    boolean enabled;
}

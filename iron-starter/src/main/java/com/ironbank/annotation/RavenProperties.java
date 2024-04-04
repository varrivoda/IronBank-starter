package com.ironbank.annotation;

import jdk.jfr.DataAmount;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import java.util.List;

@Data
@ConfigurationProperties("voron")
public class RavenProperties{
    List<String> destination;
}

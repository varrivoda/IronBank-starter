package com.ironbank;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;


//@RequiredArgsConstructor
public class RavenListener implements ApplicationListener<ContextRefreshedEvent> {
    @Autowired
    private RavenProperties ravenProperties;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        ravenProperties.getDestination().forEach((s)->
                System.out.println("Отправляем ворона в " + s));
    }
}
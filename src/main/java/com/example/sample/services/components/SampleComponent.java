package com.example.sample.services.components;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@FunctionalInterface
@Component
public interface SampleComponent {
    @Bean
    public void execute();

    public static String cal(){
        System.out.println("Cal method");
        return "Cal method";
    }
}

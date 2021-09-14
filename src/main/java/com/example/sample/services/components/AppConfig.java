package com.example.sample.services.components;

import com.example.sample.domains.User;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class AppConfig {
    @Bean
    public User getUser(){
        User user = new User();
        user.setFirst_name("Raindu");
        user.setFirst_name("Sarath");
        return user;
    }
}

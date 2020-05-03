package com.rzk.config;

import com.rzk.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

//@Component("com.rzk.pojo")
//@Import(RzkConfig2.class)
public class RzkConfig {
    @Bean
    public User user(){
        return new User();
    }
    @Bean
    public User getUser(){
        return new User();
    }
}

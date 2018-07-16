package com.dengchao.main;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainConfig {

    @Bean
    @Like
    public Person teacher() {
        return new Teacher();
    }

    @Bean
    @Cry
    public Person coder() {
        return new Coder();
    }

    @Bean
    @Qualifier("singer")
    public Performer singer() {
        return new Singer();
    }

}

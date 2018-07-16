package com.dengchao.main;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainConfig {

    @Bean(name = "teacher")
    @Conditional(WindowsCondition.class)
    public Person teacher() {
        return new Teacher();
    }

    @Bean
    @Qualifier("coder")
    public Person coder() {
        return new Coder();
    }

    @Bean(name = "singer")
    public Performer singer() {
        return new Singer();
    }

}

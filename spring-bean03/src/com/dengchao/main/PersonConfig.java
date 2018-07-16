package com.dengchao.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersonConfig {

    @Bean(name = "teacher")
    public Person teacher() {
        return new Teacher();
    }

}

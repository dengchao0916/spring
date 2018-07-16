package com.dengchao.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PerformerConfig {

    @Bean(name = "singer")
    public Performer performer() {
        return new Singer();
    }

}

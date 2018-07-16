package com.dengchao.test;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.dengchao.main.PerformerConfig;
import com.dengchao.main.PersonConfig;

@Configuration
@Import({ PerformerConfig.class, PersonConfig.class })
public class MainConfig {

}

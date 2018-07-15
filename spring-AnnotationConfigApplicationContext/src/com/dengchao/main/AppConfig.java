package com.dengchao.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "entity1")
    public Entity getEntity1() {
        Entity entity1 = new Entity();
        entity1.setName("entity_1");
        entity1.setTime(1);
        return entity1;
    }

    @Bean(name = "entity2")
    public Entity getEntity2() {
        Entity entity2 = new Entity();
        entity2.setName("entity_2");
        entity2.setTime(2);
        return entity2;
    }
}

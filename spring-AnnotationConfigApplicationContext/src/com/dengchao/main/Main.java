package com.dengchao.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();

        Entity entity1 = (Entity) ctx.getBean("entity1");
        System.out.println(entity1);
        Entity entity2 = (Entity) ctx.getBean("entity2");
        System.out.println(entity2);
    }
}

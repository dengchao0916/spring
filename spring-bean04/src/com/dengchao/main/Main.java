package com.dengchao.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        Performer performer = (Singer) context.getBean("singer");
        performer.perform();
        context.close();
    }

}

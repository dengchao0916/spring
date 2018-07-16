package com.dengchao.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext cxt = new AnnotationConfigApplicationContext(MainConfig.class);
        Performer performer = (Performer) cxt.getBean("juggler");
        performer.perform();
    }
}

package com.springinaction.springidol;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext cxt = new AnnotationConfigApplicationContext(MainConfig.class);
        Thinker thinker = (Thinker) cxt.getBean("volunteer");
        thinker.thinkOfSomething("Queen of Hearts");
    }

}

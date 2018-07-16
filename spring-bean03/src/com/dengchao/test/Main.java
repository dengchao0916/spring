package com.dengchao.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dengchao.main.Performer;
import com.dengchao.main.Person;
import com.dengchao.main.Singer;
import com.dengchao.main.Teacher;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        Person person = (Teacher) context.getBean("teacher");
        person.speak();
        Performer performer = (Singer) context.getBean("singer");
        performer.perform();
        context.close();
    }
}

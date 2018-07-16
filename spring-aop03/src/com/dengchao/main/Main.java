package com.dengchao.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig.class);
        Person person = (Person) ctx.getBean("women");
        person.likePerson();
     // 通过类型转换，person对象就拥有了animal 类的方法
        Animal animal = (Animal) person;
        animal.eat();

    }

}

package com.dengchao.main;

import org.springframework.stereotype.Component;

@Component
public class Teacher implements Person {

    @Override
    public void speak() {
        System.out.println("i'm a teacher");
    }

}

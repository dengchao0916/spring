package com.dengchao.main;

import org.springframework.stereotype.Component;

@Component
@Cry
public class Coder implements Person {

    @Override
    public void speak() {
        System.out.println("i'm a coder");

    }

}

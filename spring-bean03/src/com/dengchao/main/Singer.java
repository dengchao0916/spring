package com.dengchao.main;

import org.springframework.stereotype.Component;

@Component
public class Singer implements Performer {

    @Override
    public void perform() {
        System.out.println("i'm a singer");

    }

}

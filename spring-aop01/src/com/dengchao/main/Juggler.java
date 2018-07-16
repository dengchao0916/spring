package com.dengchao.main;

import org.springframework.stereotype.Component;

@Component
public class Juggler implements Performer {
    private int beanBags = 3;

    public Juggler() {
        System.out.println("Juggler");
    }

    public Juggler(int beanBags) {
        this.beanBags = beanBags;
    }

    @Override
    public void perform() {

        System.out.println("JUGGLER " + beanBags + " BEANBAGS");
    }

}

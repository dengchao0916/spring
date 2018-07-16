package com.springinaction.springidol;

import org.springframework.stereotype.Component;

@Component
public class Volunteer implements Thinker {
    private String thoughts;

    public String getThoughts() {
        return thoughts;
    }

    public void setThoughts(String thoughts) {
        this.thoughts = thoughts;
    }

    @Override
    public void thinkOfSomething(String thoughts) {
        this.thoughts = thoughts;
        System.out.println("Volunteer:" + getThoughts());
    }

}

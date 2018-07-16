package com.springinaction.springidol;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Magician implements MindReader {
    private String thoughts;

    @Pointcut("execution(* com.springinaction.springidol.Thinker.thinkOfSomething(String)) && args(thoughts))")
    public void otherThoughts(String thoughts) {
    }

    public Magician() {

    }

    @Override
    public String getThoughts() {
        return thoughts;
    }

    public void setThoughts(String thoughts) {
        this.thoughts = thoughts;
    }

    @Override
    @Before("otherThoughts(thoughts)")
    public void interceptThougths(String thoughts) {
        this.thoughts = thoughts;
        System.out.println("Intercepting volunteer's thoughts: "
                + getThoughts());
    }

}

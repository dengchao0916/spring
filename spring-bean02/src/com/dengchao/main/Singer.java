package com.dengchao.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Singer implements Performer {

    
    Person person;

    public Person getPerson() {
        return person;
    }

    @Autowired
    @Qualifier("teacher")
    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public void perform() {
        System.out.println("singer----------");
        person.speak();
        System.out.println("singer----------");

    }

}

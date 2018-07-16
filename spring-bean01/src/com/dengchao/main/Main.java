package com.dengchao.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dengchao.bean.Car;

public class Main {

    public static void main(String[] args) {
        ApplicationContext ac = null;
        ac = new ClassPathXmlApplicationContext("applicationContext-instance.xml");
        Car car2 = (Car) ac.getBean("car2");
        System.out.println(car2.toString());

        ac = new ClassPathXmlApplicationContext("applicationContext-static.xml");
        Car car1 = (Car) ac.getBean("car1");
        System.out.println(car1.toString());

        ac = new ClassPathXmlApplicationContext("applicationContext-constructor.xml");
        Car car3 = (Car) ac.getBean("car3");
        System.out.println(car3.toString());
    }

}

package com.dengchao.jms.producer;

import org.apache.xbean.spring.context.ClassPathXmlApplicationContext;


public class AppProducer {

    public static void main(String[] args) {


        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("producer.xml");

        IProducerService service = context.getBean(IProducerService.class);

        for (int i = 0; i < 100; i++) {
            service.sendMessage("test" + i);
        }
        context.close();

    }

}

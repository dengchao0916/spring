package com.dengchao.jms.topic;

import com.dengchao.jms.producer.IProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

import javax.annotation.Resource;
import javax.jms.*;


public class TopicServiceImpl implements IProducerService {

    @Autowired
    JmsTemplate jmsTemplate;

    @Resource(name = "topicDestination")
    Destination destination;


    public void sendMessage(final String message) {

        // 使用JmsTemplate发送消息
        jmsTemplate.send(destination, new MessageCreator() {
            public Message createMessage(Session session) throws JMSException {
                // 创建一个消息
                TextMessage textMessage = session.createTextMessage(message);

                return textMessage;
            }
        });
        System.out.println("发送消息" + message);
    }
}

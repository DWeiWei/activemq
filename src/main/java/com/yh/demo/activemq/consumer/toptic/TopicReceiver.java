package com.yh.demo.activemq.consumer.toptic;

import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

@Component
public class TopicReceiver implements MessageListener {

    public void onMessage(Message message) {
        try {
            System.out.println("TopicReceiver接收到消息:"+((TextMessage)message).getText());
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}

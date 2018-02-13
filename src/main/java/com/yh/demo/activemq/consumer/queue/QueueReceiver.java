package com.yh.demo.activemq.consumer.queue;

import org.springframework.stereotype.Component;
import javax.jms.*;

@Component
public class QueueReceiver implements MessageListener {

    public void onMessage(Message message) {
        try {
            System.out.println("QueueReceiver接收到消息："+((TextMessage)message).getText());
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}

package com.jimmy.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author xiongyang
 * @date 2020/7/29 17:32
 * @Description:
 */

@Component
@RabbitListener(queues = "fanout.B")
public class FanoutReceiverB {

    @RabbitHandler
    public void process(Object testMessage) {
        System.out.println("FanoutReceiverB  消费者收到消息  : " +testMessage.toString());
    }

}

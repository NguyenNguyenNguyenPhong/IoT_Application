package com.example.demo.consumer;


import com.example.demo.constant.JobQueue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {
    final Logger logger = LoggerFactory.getLogger(Consumer.class);

    @RabbitHandler
    @RabbitListener(queues = JobQueue.QUEUE_DEV)
    public void receiveMessage(String message){
        logger.info("Receive message: " + message);
    }

}

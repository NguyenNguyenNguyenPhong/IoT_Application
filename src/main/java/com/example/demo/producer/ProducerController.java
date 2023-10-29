package com.example.demo.producer;


import com.example.demo.constant.JobQueue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {
    final Logger logger = LoggerFactory.getLogger(ProducerController.class);

    @Autowired
    RabbitTemplate rabbitTemplate;

    @GetMapping("/push-message")
    ResponseEntity<Object> sendMessage(@RequestParam(value = "message", defaultValue = "test push message") String message){
        rabbitTemplate.convertAndSend(JobQueue.QUEUE_DEV, message);
        logger.info("Push message " + message);
        return new ResponseEntity<>("Push message" + message, HttpStatus.OK);
    }
}

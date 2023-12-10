//package com.example.demo.producer;
//
//
//import com.example.demo.Model.DataObject;
//import com.example.demo.constant.JobQueue;
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.amqp.rabbit.core.RabbitTemplate;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//public class ProducerController {
//    final Logger logger = LoggerFactory.getLogger(ProducerController.class);
//
//    @Autowired
//    RabbitTemplate rabbitTemplate;
//    @Autowired
//    private ObjectMapper objectMapper;
//    @GetMapping("/push-message")
//    ResponseEntity<Object> sendMessage(@RequestParam(value = "message", defaultValue = "test push message") String message){
//        rabbitTemplate.convertAndSend(JobQueue.QUEUE_DEV, message);
//        logger.info("Push message " + message);
//        return new ResponseEntity<>("Push message" + message, HttpStatus.OK);
//    }
//
//    @PostMapping("/send-data")
//    public ResponseEntity<Object> sendModel(@RequestBody DataObject model) {
//        try {
//            // Convert DataObject to JSON string
//            String jsonString = objectMapper.writeValueAsString(model);
//
//            // Send jsonString to the queue
//            rabbitTemplate.convertAndSend(JobQueue.QUEUE_DEV, jsonString);
//
//            return new ResponseEntity<>("Sent Model to RabbitMQ", HttpStatus.OK);
//        } catch (JsonProcessingException e) {
//            logger.error("Error converting DataObject to JSON: " + e.getMessage());
//            return new ResponseEntity<>("Error sending the model", HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
//
//
//}

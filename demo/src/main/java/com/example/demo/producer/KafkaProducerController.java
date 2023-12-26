//package com.example.demo.producer;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.kafka.core.KafkaTemplate;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/api")
//public class KafkaProducerController {
//
//    private final String kafkaTopic = "Topic_1_Test";
//
//    @Autowired
//    private KafkaTemplate<String, String> kafkaTemplate;
//
//    @PostMapping("/send-message")
//    public void sendMessage(@RequestBody String message) {
//        // Gửi message lên Kafka topic
//        kafkaTemplate.send(kafkaTopic, message);
//    }
//}

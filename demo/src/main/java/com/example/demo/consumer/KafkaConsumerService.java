package com.example.demo.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    private final String kafkaTopic = "Topic_1_Test";

    @KafkaListener(topics = kafkaTopic, groupId = "my-group-id")
    public void listen(ConsumerRecord<String, String> record) {
        // Xử lý thông điệp từ Kafka
        System.out.println("Received Message: " + record.value());
    }

}

//package com.example.demo.consumer;
//
//
//import com.example.demo.Model.DataObject;
//import com.example.demo.constant.JobQueue;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.amqp.rabbit.annotation.RabbitHandler;
//import org.springframework.amqp.rabbit.annotation.RabbitListener;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//
//
//@Component
//public class Consumer {
//    final Logger logger = LoggerFactory.getLogger(Consumer.class);
//
//    @Autowired
//    private MessageConverter messageConverter;
//
//    @RabbitHandler
//    @RabbitListener(queues = JobQueue.QUEUE_DEV)
//    public void processMessage(String message) {
//        logger.info("Received JSON: " + message);
//
//        try {
//            DataObject model = messageConverter.convertFromJson(message);
//            logger.info("Received Model: " + model.toString());
//            logger.info("ID: " + model.getId());
//            logger.info("Packet No: " + model.getPacket_no());
//            logger.info("Temperature: " + model.getTemperature());
//            logger.info("Humidity: " + model.getHumidity());
//            logger.info("TDS: " + model.getTds());
//            logger.info("pH: " + model.getPH());
//        } catch (Exception e) {
//            logger.error("Error parsing JSON: " + e.getMessage());
//        }
//    }
//}
//

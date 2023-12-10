//package com.example.demo.consumer;
//
//import com.example.demo.Model.DataObject;
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//@Component
//public class MessageConverter {
//    @Autowired
//    private ObjectMapper objectMapper;
//
//    public DataObject convertFromJson(String json) throws JsonProcessingException {
//        return objectMapper.readValue(json, DataObject.class);
//    }
//}
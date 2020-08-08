/*
package com.microserv.learnmicro.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.microserv.learnmicro.model.Account;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Sendmsg {
    private static final Logger logger=  LoggerFactory.getLogger(Sendmsg.class);
    //private static final Logger logger = LoggerFactory.getLogger(Sendmsg.class);
    private static final String TOPIC="events-rest";
    @Autowired
    private KafkaTemplate<String, Account> kafkaTemplate;
    private java.lang.Object Object;
    //private Object Account;

    public void sendMessage(Account account) {
        logger.info(String.format("#### -> Producing message -> %s", account));

        ObjectMapper mapper = new ObjectMapper();
        try {
            this.kafkaTemplate.send(TOPIC, mapper.writeValue(new Account()));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

    }
}
*/

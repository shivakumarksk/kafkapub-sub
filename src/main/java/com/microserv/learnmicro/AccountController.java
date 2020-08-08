package com.microserv.learnmicro;


import com.microserv.learnmicro.dao.AccountRepository;
import com.microserv.learnmicro.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/")
public class AccountController {

    @Autowired
    private KafkaTemplate<String,List<Account>> kafkaTemplate;
    private static final String TOPIC="events-rest";

    @Autowired
    AccountRepository accountrespository;

    @RequestMapping("findall")

    public  List<Account> findAll() {

        //List<Account> findall =accountrespository.findAll();
        List<Account> accountdata=new ArrayList<>();

accountrespository.findAll().forEach(accountdata::add);
System.out.println("DB method");
        return accountdata;

    }

    @RequestMapping("findallnames")
    public List<Account> getAll() {
       return accountrespository.findAll();
    }

    @RequestMapping("findbyname")
    public Object findbyname() {
        return accountrespository.findById(102);
    }
    @GetMapping ("/publish")
    public String sendMessage() {
        kafkaTemplate.send(TOPIC,(accountrespository.findAll()));
return "Published message successfully";
    }

}
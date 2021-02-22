package com.cicd.herokuautodeploy.service;

import org.springframework.stereotype.Service;

@Service
public class TestService {


    public String sayHello1() {
        return "Welcome to hello Service";
    }

    /**
     * createHello to create Hello message in DB
     *
     * @return
     */
    public String createHello() {
        return "Created new Record";
    }
}

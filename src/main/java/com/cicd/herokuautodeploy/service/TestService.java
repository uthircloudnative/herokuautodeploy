package com.cicd.herokuautodeploy.service;

import org.springframework.stereotype.Service;

@Service
public class TestService {

    //List<String> names = new ArrayList<>();

    public String sayHello1() {
        return "Welcome to hello Service";
    }

//    public void seedData(){
//        names = Arrays.asList("Test1","Test2","Test3");
//    }
}

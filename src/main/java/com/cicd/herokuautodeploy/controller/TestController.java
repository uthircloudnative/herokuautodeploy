package com.cicd.herokuautodeploy.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class TestController {

    @GetMapping(value = "/hello")
    public String sayHello(){
        return "Welcome to CI-CD train";
    }
}

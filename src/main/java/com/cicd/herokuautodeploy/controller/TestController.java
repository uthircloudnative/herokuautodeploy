package com.cicd.herokuautodeploy.controller;

import com.cicd.herokuautodeploy.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private TestService testService;

    public TestController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping(value = "/hello")
    public String sayHello(){
        return testService.sayHello1();
    }

    @PostMapping(value = "/hello")
    public String postHello(){
      return "This is Post Method";
    }
}

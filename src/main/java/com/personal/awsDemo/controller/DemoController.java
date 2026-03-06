package com.personal.awsDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/getResponse")
    public String hello(){
        return "Hello from CI/CD pipeline...Demo";
    }
}

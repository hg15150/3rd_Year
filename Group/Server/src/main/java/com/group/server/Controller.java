package com.group.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private TestService testService;

    @RequestMapping("/hello")
    public String getGreeting(){
        return testService.getHello();
    }
}

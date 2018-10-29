package com.group.server;

import org.springframework.stereotype.Service;

@Service
public class TestService {
    String hello = "Hello, World!";

    String getHello(){
        return hello;
    }

}

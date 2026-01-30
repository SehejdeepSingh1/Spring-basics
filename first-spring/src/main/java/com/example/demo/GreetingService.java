package com.example.demo;

import org.springframework.stereotype.Component;

@Component("myBean")
public class GreetingService {
    public void sayhello(){
        System.out.println("Hello from Spring !!");

    }
}

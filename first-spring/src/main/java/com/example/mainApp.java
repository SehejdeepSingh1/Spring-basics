package com.example;

import com.example.demo.AppConfig;
import com.example.demo.GreetingService;
import com.example.demo.LifeCycleBean;
import com.example.loose.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainApp {
    public static void main(String[] args) {
        System.out.println("Starting Spring Application Context");
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println("Retrieving LifeCycle Bean");
        LifeCycleBean lifeCycleBean=context.getBean(LifeCycleBean.class);
        lifeCycleBean.performTask();
        System.out.println("Closing Spring Context");
//        GreetingService greetingService=context.getBean(GreetingService.class);
//        greetingService.sayhello();
//        UserService userService=  context.getBean(UserService.class);
//        userService.notifyuser("Whats up !!");
    }
}

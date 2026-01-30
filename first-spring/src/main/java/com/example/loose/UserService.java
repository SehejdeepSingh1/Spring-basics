package com.example.loose;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component ("UserServiceSMS")
public class UserService {
    NotificationService notificationService;
    public  UserService(){

    }
    @Autowired
    public UserService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }
    public void setNotificationService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }
    public void notifyuser(String msg){

        notificationService.send(msg);
    }
}

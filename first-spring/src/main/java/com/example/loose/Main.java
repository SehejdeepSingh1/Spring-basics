package com.example.loose;

public class Main {
    public static void main(String[] args) {
        NotificationService sms=new EmailNotificationService();
        UserService user=new UserService(sms);
        user.notifyuser("hello");
    }
}

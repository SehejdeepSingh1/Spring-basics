package com.example.db;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


public class DatabaseConnection {
    private List<String> users;


    //initialisation of database
    public void init(){
        users=new ArrayList<>();
        System.out.println("DB Connected (Simulated)");
    }

    //getter
    public List<String> getUsers(){
        return users;
    }

    //adding the user
    public void addUser(String user){
        users.add(user);
    }

    public void cleanup(   ){
        System.out.println("DB Disconnected (Simulated)");
    }
}

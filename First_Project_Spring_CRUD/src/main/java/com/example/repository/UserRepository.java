package com.example.repository;

import com.example.db.DatabaseConnection;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository {
    private DatabaseConnection db;

    // as it is a spring managed component then this will be initailized on its own by spring
    public UserRepository(DatabaseConnection db) {

        this.db = db;
    }

    public List<String> findAll(){

        return db.getUsers();
    }

    public void save(String user){
        db.addUser(user);
    }
}

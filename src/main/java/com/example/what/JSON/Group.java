package com.example.what.JSON;

import org.apache.catalina.User;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private long id;
    private String name;
    private List<User> users = new ArrayList<>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getUsers() {
        return users;
    }

    public  void setUsers(List<User> users) {
        this.users = users;
    }

    public void  addUser(User user) {
        users.add(user);
    }
}

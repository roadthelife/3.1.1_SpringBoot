package com.example.democrud.dao;

import com.example.democrud.model.User;

import java.util.List;

public interface UserDAO {

    List<User> allUsers();
    void add(User user);
    void delete(int id);
    void edit(User user);
    User getById(int id);
}

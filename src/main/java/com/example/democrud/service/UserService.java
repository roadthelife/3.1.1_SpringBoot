package com.example.democrud.service;

import com.example.democrud.model.User;

import javax.validation.Valid;
import java.util.List;

public interface UserService {

    List<User> allUsers();
    void add(User user);
    void delete(int id);
    void edit(@Valid User user);
    User getById(int id);
}

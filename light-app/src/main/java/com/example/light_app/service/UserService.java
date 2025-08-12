package com.example.light_app.service;

import com.example.light_app.model.Card;
import com.example.light_app.model.User;

import java.util.List;

public interface UserService {

    User createUser(User user);
    User updateUser(Integer id, User user);
    void deleteUser(Integer id);
}

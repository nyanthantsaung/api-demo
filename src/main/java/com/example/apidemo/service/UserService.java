package com.example.apidemo.service;

import com.example.apidemo.entity.User;

import java.util.List;

public interface UserService {

    List<User> findAll();
    void save(User user);

}

package com.example.apidemo.service.Impl;

import com.example.apidemo.entity.User;
import com.example.apidemo.repo.UserRepo;
import com.example.apidemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.PublicKey;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;
    @Override
   public List<User> findAll() {
       return userRepo.findAll();
   }

    @Override
    public void save(User user) {
        userRepo.save(user);
    }

}

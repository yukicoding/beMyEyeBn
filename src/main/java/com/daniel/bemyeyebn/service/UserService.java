package com.daniel.bemyeyebn.service;

import com.daniel.bemyeyebn.mapper.UserMapper;
import com.daniel.bemyeyebn.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    public User getAllUser(){
        return userMapper.getAllUser();
    }
}

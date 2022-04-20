package com.daniel.bemyeyebn.service;

import com.daniel.bemyeyebn.mapper.UserMapper;
import com.daniel.bemyeyebn.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    public List<User> getAllUser(){
        return userMapper.getAllUser();
    }
    public void insertUser(User user){
         userMapper.insert(user);
    }
}

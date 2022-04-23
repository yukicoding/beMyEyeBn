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
    public Integer addUser(User user){
        return userMapper.InsertUser(user);
    }
    public User getUser(String id){
        return userMapper.getUser(id);
    }
    public Integer updateUser(User user){
        return userMapper.putUser(user);
    }
    public Long deleteUser(String id){
        return userMapper.delete(id);
    }
}

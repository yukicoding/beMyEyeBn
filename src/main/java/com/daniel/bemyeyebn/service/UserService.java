package com.daniel.bemyeyebn.service;

import cn.hutool.core.lang.Console;
import cn.hutool.core.util.CharsetUtil;
import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpUtil;
import com.daniel.bemyeyebn.mapper.UserMapper;
import com.daniel.bemyeyebn.model.User;

import com.daniel.bemyeyebn.utils.GetExample;
import com.daniel.bemyeyebn.utils.PostExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;



@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    public List<User> getAllUser() throws Exception {
        HashMap<String, Object> map = new HashMap<>();
        map.put("key","33da32fe2ab241e0ab87f0099349e15c");

        String result = HttpRequest.get("https://geoapi.qweather.com/v2/city/top?key=33da32fe2ab241e0ab87f0099349e15c")
                .header("Content-Type","application/x-www-form-urlencoded;charset=UTF-8").execute().body();
    System.out.println(result);

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

package com.daniel.bemyeyebn.controller;


import com.daniel.bemyeyebn.model.User;
import com.daniel.bemyeyebn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping("/getAllUser")
    public String getAllUser(){
        return userService.getAllUser().toString();

    }
    @RequestMapping("/insertUser")
    public void insertUser(@RequestParam(name="userName") String name,
                           @RequestParam(name="password") String password,
                           @RequestParam(name="userSex") String userSex,
                           @RequestParam(name="nickName") String nickName
                           ){
        User user = new User();
        user.setUserName(name);
        user.setPassword(password);
        user.setUserSex(userSex);
        user.setNickName(nickName);
        userService.insertUser(user);
    }

}

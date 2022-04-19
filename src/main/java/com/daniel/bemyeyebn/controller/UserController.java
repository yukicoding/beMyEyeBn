package com.daniel.bemyeyebn.controller;


import com.daniel.bemyeyebn.model.User;
import com.daniel.bemyeyebn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
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

}

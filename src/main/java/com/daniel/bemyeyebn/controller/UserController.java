package com.daniel.bemyeyebn.controller;

import com.daniel.bemyeyebn.model.User;
import com.daniel.bemyeyebn.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
  @Autowired UserService userService;

  @GetMapping("")
  public List<User> getAllUser() throws Exception{
    return userService.getAllUser();
  }

  @GetMapping("/{id}")
  public User getUser(@PathVariable(name = "id") String id) {
    return userService.getUser(id);
  }

  @PostMapping("")
  public Integer postUser(@RequestBody User user) {

    return userService.addUser(user);
  }

  @PutMapping("/{id}")
  public Integer putUser(@RequestBody User user){

    return userService.updateUser(user);
  }

  @DeleteMapping("/{id}")
  public void deleteUser(@PathVariable(name = "id") String id) {
    userService.deleteUser(id);
  }
}

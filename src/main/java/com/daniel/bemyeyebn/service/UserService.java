package com.daniel.bemyeyebn.service;

import com.daniel.bemyeyebn.mapper.UserMapper;
import com.daniel.bemyeyebn.model.User;

import com.daniel.bemyeyebn.utils.GetExample;
import com.daniel.bemyeyebn.utils.PostExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;



@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    public List<User> getAllUser() throws Exception {
        GetExample getExample = new GetExample();
        PostExample postExample = new PostExample();
//        String response = getExample.run("https://raw.github.com/square/okhttp/master/README.md");
//        System.out.println(response);
        String response2 = postExample.post("http://www.roundsapp.com/post","{'winCondition':'HIGH_SCORE',"
                + "'name':'Bowling',"
                + "'round':4,"
                + "'lastSaved':1367702411696,"
                + "'dateStarted':1367702378785,"
                + "'players':["
                + "{'name':'" + "qiqi" + "','history':[10,8,6,7,8],'color':-13388315,'total':39},"
                + "{'name':'" + "hyq" + "','history':[6,10,5,10,10],'color':-48060,'total':41}"
                + "]}");
        System.out.println(response2);
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

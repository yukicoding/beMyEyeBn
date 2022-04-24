package com.daniel.bemyeyebn.model;


import lombok.Data;

@Data
public class User {
    private Integer id;
    private String userName;
    private String password;
    private String userSex;
    private String nickName;

//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getUserName() {
//        return userName;
//    }
//
//    public void setUserName(String userName) {
//        this.userName = userName;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public String getUserSex() {
//        return userSex;
//    }
//
//    public void setUserSex(String userSex) {
//        this.userSex = userSex;
//    }
//
//    public String getNickName() {
//        return nickName;
//    }
//
//    public void setNickName(String nickName) {
//        this.nickName = nickName;
//    }
//
//    @Override
//    public String toString() {
//        return "User{" +
//                "id=" + id +
//                ", userName='" + userName + '\'' +
//                ", password='" + password + '\'' +
//                ", userSex='" + userSex + '\'' +
//                ", nickName='" + nickName + '\'' +
//                '}';
//    }
}

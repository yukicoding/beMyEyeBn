package com.daniel.bemyeyebn.mapper;

import com.daniel.bemyeyebn.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    @Select("SELECT * FROM users")
    @Results({
            @Result(property = "id",column = "id"),
            @Result(property = "userName",column = "userName"),
            @Result(property = "password",column = "password"),
            @Result(property = "userSex",column = "user_sex"),
            @Result(property = "nickName",column = "nick_name"),
    })
    List<User> getAllUser();

    @Insert("INSERT INTO users  (userName,password,user_sex,nick_name) VALUES (#{userName},#{password},#{userSex},#{nickName})")
    void insert(User user);

}

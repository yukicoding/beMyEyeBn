package com.daniel.bemyeyebn.mapper;

import com.daniel.bemyeyebn.model.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author yukic
 */
@Repository
public interface UserMapper {
    @Select("SELECT * FROM users")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "userName", column = "userName"),
            @Result(property = "password", column = "password"),
            @Result(property = "userSex", column = "user_sex"),
            @Result(property = "nickName", column = "nick_name"),
    })
    List<User> getAllUser();

    @Insert("INSERT INTO users  (userName,password,user_sex,nick_name) VALUES (#{userName},#{password},#{userSex},#{nickName})")
    @Results({
            @Result(property = "id", column = "id")
            })
    Integer InsertUser(User user);

    @Select("SELECT * FROM USERS WHERE id=#{id}")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "userName", column = "userName"),
            @Result(property = "password", column = "password"),
            @Result(property = "userSex", column = "user_sex"),
            @Result(property = "nickName", column = "nick_name"),
    })
    User getUser(String id);

    @Update("UPDATE USERS SET userName=#{userName},password=#{password},user_sex=#{userSex},nick_name=#{nickName} WHERE id=#{id} ")
    Integer putUser(User user);

    @Delete("DELETE FROM users WHERE id = #{id}")
    @Results({
            @Result(property = "id", column = "id")
    })
    Long delete(String id);
}

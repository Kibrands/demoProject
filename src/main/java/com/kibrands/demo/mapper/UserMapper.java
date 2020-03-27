package com.kibrands.demo.mapper;

import com.kibrands.demo.model.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

    @Insert("INSERT INTO users (userName, email, password, birth) VALUES " +
            "(#{user.userName}, #{user.email}, #{user.password}, #{user.birth})")
    void insertUser(@Param("user") User user);

    @Select("SELECT * FROM users WHERE userId = #{userId}")
    User getUser(@Param("userId") Integer userId);

    @Update("UPDATE users SET userName = #{user.userName}, email = #{user.email}, password = #{user.password}, " +
            "birth = #{user.birth} WHERE userId = #{user.userId}")
    boolean updateUser(@Param("user") User user);

    @Delete("DELETE FROM users WHERE userId = #{userId}")
    boolean deleteUser(@Param("userId") Integer userId);

    @Select("SELECT * FROM users")
    List<User> getAllUsers();
}

package com.yruns.dao;

import com.yruns.pojo.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {

    @Select("select * from tb_user;")
    List<User> selectAll();

    @Select("select * from tb_user where username = #{username};")
    List<User> selectByUsername(@Param("username")String username);

    @Insert("insert into tb_user values(null, #{username}, #{password})")
    void insert(User user);

}

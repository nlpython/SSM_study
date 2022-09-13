package com.yruns.dao;

import com.yruns.pojo.User;
import org.apache.ibatis.annotations.Insert;

public interface UserDao {
    @Insert("insert into tb_user(name,age)values(#{name},#{age})")
    public void save(User user);
}

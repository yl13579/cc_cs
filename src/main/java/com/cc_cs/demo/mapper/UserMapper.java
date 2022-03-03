package com.cc_cs.demo.mapper;

import com.cc_cs.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.Collection;

@Mapper
public interface UserMapper {
    User selectUserByUid(Integer uid);
    User selectUserByName(String name);
    User selectUserByMail(String mail);
    Collection<User> selectAllUsers();
    void insertUser(User user);
    void updateUser(User user);
    void deleteUser(Integer uid);
}

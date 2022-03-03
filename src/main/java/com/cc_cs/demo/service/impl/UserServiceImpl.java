//package com.cc_cs.demo.service.impl;
//
//import com.cc_cs.demo.entity.User;
//import com.cc_cs.demo.mapper.UserMapper;
//import com.cc_cs.demo.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import java.util.Collection;
//
//public class UserServiceImpl implements UserService {
//    @Autowired
//    private UserMapper userMapper;
//
//    @Override
//    public User selectUserByUid(Integer uid) {
//        return userMapper.selectUserByUid(uid);
//    }
//
//    @Override
//    public User selectUserByName(String name) {
//        return userMapper.selectUserByName(name);
//    }
//
//    @Override
//    public User selectUserByMail(String mail) {
//        return userMapper.selectUserByMail(mail);
//    }
//
//    @Override
//    public Collection<User> selectAllUsers() {
//        return userMapper.selectAllUsers();
//    }
//
//    @Override
//    public void insertUser(User user) {
//        userMapper.insertUser(user);
//    }
//
//    @Override
//    public void updateUser(User user) {
//        userMapper.updateUser(user);
//    }
//
//    @Override
//    public void deleteUser(Integer uid) {
//        userMapper.deleteUser(uid);
//    }
//}

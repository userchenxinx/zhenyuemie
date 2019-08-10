package com.pinming.service.impl;

import com.pinming.mapper.UserMapper;
import com.pinming.pojo.User;
import com.pinming.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: djs
 * @create: 2019-08-02 22:38
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public boolean login(String email, String password) {
        Integer i = userMapper.login(email, password);

        return i>0 ? true:false;
    }

    @Override
    public User findUserByEmail(String email) {
        User user = userMapper.findUserByEmail(email);
        return user;
    }

    @Override
    public void addUser(User user) {
        userMapper.addUser(user);
    }


}

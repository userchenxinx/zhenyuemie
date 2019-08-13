package com.pinming.service.impl;

import com.pinming.mapper.UserMapper;
import com.pinming.pojo.User;
import com.pinming.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: djs
 * @program: zhenyuemie
 * @create: 2019-08-11 13:26
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public void addUser(User user) {
        userMapper.addUser(user);
    }

    @Override
    public Integer findUserById(Integer id) {
        Integer i = userMapper.findUserById(id);
        return i;
    }

    @Override
    public void updateUserDetail(User user) {
        userMapper.updateUserDetail(user);
    }
}

package com.pinming.service;

import com.pinming.pojo.User;

/**
 * @author: djs
 * @create: 2019-08-11 13:24
 **/
public interface UserService {

    public void addUser(User user);

    Integer findUserById(Integer id);

    void updateUserDetail(User user);
}

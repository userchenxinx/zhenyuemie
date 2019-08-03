package com.pinming.service;

import com.pinming.pojo.User;

/**
 * @author: djs
 * @create: 2019-08-02 22:37
 **/
public interface UserService {

    public boolean login(String email,String password);

    public User findUserByEmail(String email);
}

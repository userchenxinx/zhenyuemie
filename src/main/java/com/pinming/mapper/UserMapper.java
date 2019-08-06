package com.pinming.mapper;

import com.pinming.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author: djs
 * @create: 2019-08-02 22:34
 **/
@Mapper
public interface UserMapper {

    Integer login(String email,String password);

    User findUserByEmail(String email);

    void addUser(User user);
}

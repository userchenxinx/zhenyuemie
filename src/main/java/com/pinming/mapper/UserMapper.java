package com.pinming.mapper;

import com.pinming.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author: djs
 * @create: 2019-08-11 13:28
 **/
@Mapper
public interface UserMapper {
    void addUser(User user);

    Integer findUserById(Integer id);

    void updateUserDetail(User user);
}

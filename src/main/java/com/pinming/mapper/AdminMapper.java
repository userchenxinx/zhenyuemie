package com.pinming.mapper;


import com.pinming.pojo.Admin;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author: djs
 * @create: 2019-08-02 22:34
 **/
@Mapper
public interface AdminMapper {

    Integer login(String email,String password);

    Admin findAdminByEmail(String email);

    void addAdmin(Admin admin);

    Admin findById(Integer id);
}

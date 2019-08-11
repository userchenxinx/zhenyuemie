package com.pinming.service;


import com.pinming.pojo.Admin;

/**
 * @author: djs
 * @create: 2019-08-02 22:37
 **/
public interface AdminService {

    boolean login(String email, String password);

    Admin findAdminByEmail(String email);

    public void addAdmin(Admin admin);

    Admin findAdminById(Integer id);

    /* void findAdminByTel(String tel);*/
}

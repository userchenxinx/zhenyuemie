package com.pinming.service.impl;


import com.pinming.mapper.AdminMapper;
import com.pinming.pojo.Admin;
import com.pinming.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: djs
 * @create: 2019-08-02 22:38
 **/
@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    public boolean login(String email, String password) {
        Integer i = adminMapper.login(email, password);

        return i>0 ? true:false;
    }


    public Admin findAdminByEmail(String email) {
        Admin admin = adminMapper.findAdminByEmail(email);
        return admin;
    }


    public void addAdmin(Admin admin) {
        adminMapper.addAdmin(admin);
    }

    @Override
    public Admin findAdminById(Integer id) {
        Admin admin = adminMapper.findById(id);
        return admin;
    }


}

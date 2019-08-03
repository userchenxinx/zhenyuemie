package com.pinming.controller;

import com.pinming.common.util.JsonBean;
import com.pinming.common.util.Md5Util;
import com.pinming.pojo.User;
import com.pinming.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @author: djs
 * @create: 2019-08-02 22:03
 **/
@RestController
@RequestMapping("/user")
@Api(value = "登陆")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/login.do")
    @ApiOperation(value = "该方法登陆")
    public JsonBean login(User user, HttpSession session) throws Exception {
        String pwd = Md5Util.encodeByMd5(user.getPassword());
        boolean result = userService.login(user.getEmail(), pwd);
         User user1 = userService.findUserByEmail(user.getEmail());
        if(result){
            session.setAttribute("user",user1);
           // System.out.println(session.getAttribute("user"));
            return new JsonBean(1,"登陆成功");
        }else {
            return new JsonBean(0,"登陆失败");
        }

    }

}

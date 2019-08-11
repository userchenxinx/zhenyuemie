    package com.pinming.controller;

    import com.pinming.common.util.JsonBean;
import com.pinming.pojo.User;
import com.pinming.service.AdminService;
import com.pinming.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

    /**
     * @author: djs
     * @program: zhenyuemie
     * @create: 2019-08-11 12:08
     **/
    @RestController
    @RequestMapping("/user")
    @Api(value = "用户资料",tags = "用户资料")
    public class UserController {

        @Autowired
        private UserService userService;
        @Autowired
        private AdminService adminService;

        @ApiOperation(value = "添加用户资料", notes = "添加用户资料")
        @PutMapping(value = "/add.do")
        public JsonBean updateAndInsert(User user, HttpServletRequest request) {
            //获取session
            HttpSession session = request.getSession();

           // 根据键值取session中的值
            Integer id = (Integer)session.getAttribute("id");
            Integer i = userService.findUserById(id);
            //System.out.println(id);
            if(i == 0){
                user.setAid(id);
                userService.addUser(user);
                return new JsonBean(1, "添加成功");
            }else if(i > 0){
                //user.setAid(id);
                userService.updateUserDetail(user);
                return new JsonBean(1,"修改成功");
            }else{
                return new JsonBean(0,"该用户不存在或非法登陆");
            }
            //Admin admin = adminService.findAdminById(id);

        }
    }


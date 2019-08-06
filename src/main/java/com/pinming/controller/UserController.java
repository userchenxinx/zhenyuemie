package com.pinming.controller;

import com.pinming.common.util.JsonBean;
import com.pinming.common.util.Md5Util;
import com.pinming.pojo.User;
import com.pinming.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Date;
import java.util.Random;

/**
 * @author: djs
 * @create: 2019-08-02 22:03
 **/
@RestController
@RequestMapping("/user")
@Api(value = "用户",tags ="用户相关")
public class UserController {
    private static final String CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static final int WIDTH = 80;
    private static final int HEIGHT = 30;
    private static final int FONT_SIZE = 18;
    private static final Color[] COLORS = {Color.BLACK,Color.BLUE,Color.CYAN,Color.GREEN,Color.MAGENTA,
            Color.ORANGE,Color.RED,Color.ORANGE};

    @Autowired
    private UserService userService;


    @GetMapping("/login.do")
    @ApiOperation(value = "该方法负责登陆")
    public JsonBean login(User user, HttpSession session) throws Exception {
        String pwd = Md5Util.encodeByMd5(user.getPassword());
        boolean result = userService.login(user.getEmail(), pwd);
        if(result){
            User user1 = userService.findUserByEmail(user.getEmail());
            session.setAttribute("user",user1);
           // System.out.println(session.getAttribute("user"));
            return new JsonBean(1,"登陆成功");
        }else {
            return new JsonBean(0,"登陆失败,请先去注册");
        }

    }

    @PostMapping("/register.do")
    @ApiOperation("该方法负责注册")
    public JsonBean register(User user,HttpSession session) throws Exception {
        User user1 = userService.findUserByEmail(user.getEmail());
        Object code = session.getAttribute("code");
        if(user1 != null && !code.equals(user.getCode())){
            return new JsonBean(0,"该账号已经注册过/验证码错误");
        }else{
            String s = Md5Util.encodeByMd5(user.getPassword());
            user.setCreatetime(new Date());
            user.setPassword(s);
            userService.addUser(user);
            return new JsonBean(1,"注册成功,请前往登陆");
        }

    }

    @GetMapping ("/createcode.do")
    @ApiOperation(value ="生成验证码")
    public JsonBean createcode(HttpServletResponse resp, HttpServletRequest req, HttpSession session) throws IOException {

            //在内存中创建图片对象
            BufferedImage image = new BufferedImage(WIDTH,HEIGHT,
                    BufferedImage.TYPE_INT_ARGB);
            //获得绘图对象
            Graphics g = image.getGraphics();
            //设置背景验证
            g.setColor(Color.GRAY);
            //填充背景色
            g.fillRect(0, 0, WIDTH, HEIGHT);
            //设置字体
            g.setFont(new Font("宋体",Font.ITALIC,FONT_SIZE));
            Random random = new Random();
            //随机产生四个文字，绘制到图片上
            StringBuilder strb = new StringBuilder();
            for(int i = 0;i < 4;i++){
                g.setColor(COLORS[random.nextInt(COLORS.length)]);
                char c = CHARS.charAt(random.nextInt(CHARS.length()));
                strb.append(c);
                g.drawString(String.valueOf(c),10 + i * FONT_SIZE, FONT_SIZE);
                //绘制随机线条
                g.setColor(COLORS[random.nextInt(COLORS.length)]);
                g.drawLine(random.nextInt(WIDTH), random.nextInt(HEIGHT),
                        random.nextInt(WIDTH), random.nextInt(HEIGHT));
            }
            //把验证码字符串保存到Session中
            session.setAttribute("code",strb.toString());
            //System.out.println(session.getAttribute("code"));
            //告诉浏览器不缓存图片
            resp.addHeader("Cache-Control", "no-cache");
            //将图片发送给浏览器
            ImageIO.write(image, "PNG", resp.getOutputStream());
            return new JsonBean(1,null);
        }






}

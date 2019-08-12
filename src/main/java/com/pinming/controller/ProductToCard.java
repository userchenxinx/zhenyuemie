package com.pinming.controller;

import com.pinming.common.util.JsonBean;
import com.pinming.pojo.User;
import com.pinming.service.CartService;
import com.pinming.vo.CartGoods;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/cart")
@Api(value = "这是一个购物车相关的接口",tags = "这是一个购物车相关的接口")
public class ProductToCard {



    @Autowired
    private CartService cartService;

    @PutMapping("/addCart")
    @ResponseBody
    @ApiOperation(value = "这是一个添加购物车的方法")
    public JsonBean addProductToCard(HttpSession session) {


        User user = (User)session.getAttribute("user");
        if (user == null) {
            return new JsonBean(0, "用户未登录，请先登录");
        } else {
             int userid = user.getId();
             int goodsid = 1;
             int goodsnum = 2;
           //从缓存里拿商品id;//从登录的loginUser中拿userid，标记是谁的购物车；在前端传过来商品数量；
            cartService.SkincareToCart(goodsid,userid,goodsnum);
            return  new JsonBean(1,"添加购物车成功");
       }
       /* int userid = 3;
        int goodsid = 2;
        int goodsnum = 2;
        //从缓存里拿商品id;//从登录的loginUser中拿userid，标记是谁的购物车；在前端传过来商品数量；
        cartService.SkincareToCart(goodsid,userid,goodsnum);
        return  new JsonBean(1,"添加购物车成功");*/

    }

    @GetMapping("/listgoods")
    @ResponseBody
    @ApiOperation(value = "这是一个展示购物车商品的接口")
    public JsonBean showCartGoods(int userid){
        List<CartGoods> list = cartService.queryCart(userid);
        return  new JsonBean(1,list);
    }


    @DeleteMapping("/deleteAllCart")
    @ResponseBody
    @ApiOperation(value = "这是一个清空购物车的接口")
    public JsonBean deleteCartGoods(int userid){

        cartService.deleteAllCart(userid);
        return new JsonBean(1,"清空成功");
    }

    @DeleteMapping("/deleteCart")
    @ResponseBody
    @ApiOperation(value = "这是一个单个删除购物车的接口")
    public JsonBean deleteCart(int id){

        cartService.deleteCart(id);
        return new JsonBean(1,"删除成功");
    }
}

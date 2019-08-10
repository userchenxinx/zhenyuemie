package com.pinming.controller;

import com.pinming.common.vo.R;
import com.pinming.service.ShopFsPageService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: zhenyuemie
 * @author: Larissa
 * @create: 2019-08-06 22:07
 */
@Controller
@CrossOrigin
@Api(value = "商品首页",tags ="商品首页")
public class ShopFsPageController {

    @Autowired
    private ShopFsPageService shopFsPageService;
    // 首页展示世界大牌图片
    @ApiOperation(value = "首页展示世界大牌",notes = "首页展示世界大牌")
    @ResponseBody
    @GetMapping("/shoppage/worddp.do")
    public R selectWordType(String wordname){
        return shopFsPageService.selectWordType(wordname);
    }
    // 首页展示通过图片查看商品
    @ApiOperation(value = "点击图片查看商品",notes = "点击图片查看商品")
    @ResponseBody
    @GetMapping("/shoppage/img.do")
    public R selectImg(String img){
        return shopFsPageService.selectImg(img);
    }
    //血拼一下根据折扣价进行显示
    @ApiOperation(value = "血拼一下",notes = "血拼一下")
    @ResponseBody
    @GetMapping("/shoppage/discount.do")
    public R selectDiscount(){
        return shopFsPageService.selectDiscount();
    }
    // 导购精选
    @ApiOperation(value = "导购精选",notes = "导购精选")
    @ResponseBody
    @GetMapping("/shoppage/selection.do")
    public R seleselection(){
        return shopFsPageService.selection();
    }
}

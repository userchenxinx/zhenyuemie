package com.pinming.controller;

import com.pinming.common.util.JsonBean;
import com.pinming.common.vo.R;
import com.pinming.pojo.Mshopdeta;
import com.pinming.service.ManshopService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;


@Controller
@CrossOrigin
@Api(value = "男士专区",tags ="男士专区操作")
public class ManshopController {
    @Autowired
    private ManshopService manshopService;

    // 商品列表分类
    @ApiOperation(value = "男士专区列表",notes = "男士专区列表")
    @ResponseBody
    @GetMapping("/manlist/listid.do")
    public R selectByManId(int id){
        return manshopService.selectByManId(id);
    }

    //查看类型下商品
    @ApiOperation(value = "类型下商品",notes = "类型下商品")
    @ResponseBody
    @GetMapping("/manlist/ftypeid.do")
    public R selectByFtypeid(int id){
        return manshopService.selectByFtypeId(id);
    }
    //根据商品id查看商品详情
    @ApiOperation(value = "根据商品id查看商品详情",notes = "根据商品id查看商品详情")
    @ResponseBody
    @GetMapping("/manlist/byshopdetaid .do")
    public R selectById(int id){
        return manshopService.selectById(id);
    }

//    //查看所有商品
//    @ApiOperation(value = "查看所有商品",notes = "查看所有商品")
//    @ResponseBody
//    @GetMapping("/manlist/allshop .do")
//    //分页测试
//    public R selectAllShop(int page){
//        Map<String,Object> map = (Map<String, Object>) manshopService.selectAll(page);
//        return R.setOK("成功",map);
//    }

    //查看所有商品
    @ApiOperation(value = "查看所有商品-分页@@@",notes = "查看所有商品")
    @ResponseBody
    @GetMapping("/manlist/allshop .do")
    //分页测试
    public JsonBean selectAllShop(int page){
        Map<String,Object> map = manshopService.selectAll(page);
        return new JsonBean(1,map);
    }

    @ApiOperation(value = "全文搜索商品")
    @ResponseBody
    @GetMapping("/manlist/search.do")
    public JsonBean findByType(String goodsname, Model model){

        List<Mshopdeta> list = manshopService.findByType(goodsname);
        model.addAttribute("list",list);
        return new JsonBean(1,list);
    }
}

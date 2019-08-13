package com.pinming.controller;

import com.pinming.common.util.JsonBean;
import com.pinming.common.util.VPageInfo;
import com.pinming.pojo.Cosmetics;
import com.pinming.service.CosmeticsServce;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: jie
 * @create: 2019-08-01 20:05
 **/
@RestController
@RequestMapping("cosmetics")
@Api(value = "展示彩妆信息", tags ="彩妆")
public class CosmeticsController {

    @Autowired
    CosmeticsServce cosmeticsServer;

    @RequestMapping(value = "/list.do", method = RequestMethod.GET)
    @ApiOperation(value = "该方法是通过分页获取所有彩妆信息的方法")
    public JsonBean findByPage(int page, Integer type, String info){

        VPageInfo<Cosmetics> pageInfo = cosmeticsServer.findByPage(page, type, info);
        System.out.println(pageInfo);

        return new JsonBean(1,pageInfo);

    }

    @RequestMapping(value = "/query.do", method = RequestMethod.GET)
    @ApiOperation(value = "该方法是通过指定id获取彩妆信息的方法")
    public JsonBean findById(int id){
        List<Cosmetics> list = cosmeticsServer.findSkincareById(id);

        return new JsonBean(1, list);
    }

    @RequestMapping(value = "/skin.do", method = RequestMethod.GET)
    @ApiOperation(value = "该方法是通过指定肤色获取所有彩妆信息的方法")
    public JsonBean findBySkintypeId(int id){
        List<Cosmetics> list = cosmeticsServer.findSkintypeById(id);

        return new JsonBean(1,list);
    }

    @RequestMapping(value = "/brand.do", method = RequestMethod.GET)
    @ApiOperation(value = "该方法是通过指定品牌获取所有彩妆信息的方法")
    public JsonBean findBrandById(int id){
        List<Cosmetics> list = cosmeticsServer.findBrandtypeById(id);

        return new JsonBean(1,list);
    }

    @RequestMapping(value = "/efficacy.do", method = RequestMethod.GET)
    @ApiOperation(value = "该方法是通过指定功效获取所有彩妆信息的方法")
    public JsonBean findEfficacyById(int id){
        List<Cosmetics> list = cosmeticsServer.findEfficacytypeById(id);

        return new JsonBean(1,list);
    }

    @RequestMapping(value = "/asc.do", method = RequestMethod.GET)
    @ApiOperation(value = "该方法是通过价格升序获取所有彩妆信息的方法")
    public JsonBean findAllAsc(Double price){
        List<Cosmetics> list = cosmeticsServer.findSkincareAsc(price);

        return new JsonBean(1,list);
    }

    @RequestMapping(value = "/desc.do", method = RequestMethod.GET)
    @ApiOperation(value = "该方法是通过价格降序获取所有彩妆信息的方法")
    public JsonBean findAllDesc(Double price){
        List<Cosmetics> list = cosmeticsServer.findSkincareDesc(price);

        return new JsonBean(1,list);
    }

    @RequestMapping(value = "/select.do", method = RequestMethod.GET)
    @ApiOperation(value = "该方法是通过类型获取所有彩妆信息的方法")
    public JsonBean selectAll(Double price){
        List<Cosmetics> list = cosmeticsServer.selectAllGoods();

        return new JsonBean(1,list);
    }

    @RequestMapping(value = "/findall.do", method = RequestMethod.GET)
    @ApiOperation(value = "该方法是通过多类型条件获取所有彩妆信息的方法")
    public JsonBean findgoodsAll(int id){
        List<Cosmetics> list = cosmeticsServer.findAllGoods(id);

        return new JsonBean(1,list);
    }

}

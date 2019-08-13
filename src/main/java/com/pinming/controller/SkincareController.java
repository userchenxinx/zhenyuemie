package com.pinming.controller;

import com.pinming.common.util.JsonBean;
import com.pinming.common.util.VPageInfo;
import com.pinming.pojo.Skincare;
import com.pinming.service.SkincareService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: jie
 * @create: 2019-08-03 15:44
 **/
@RestController
@RequestMapping("/skincare")
@Api(value = "展示护肤品信息", tags ="护肤品")
public class SkincareController {

    @Autowired
    SkincareService skincareService;

    @RequestMapping(value = "/list.do", method = RequestMethod.GET)
    @ApiOperation(value = "该方法是通过分页获取所有护肤品信息的方法")
    public JsonBean findByPage(int page, Integer type, String info){
        VPageInfo<Skincare> vPageInfo = skincareService.findBypage(page, type, info);

        return new JsonBean(1,vPageInfo);
    }

    @RequestMapping(value = "/query.do", method = RequestMethod.GET)
    @ApiOperation(value = "该方法是通过指定id获取所有护肤品信息的方法")
    public JsonBean findById(int id){
        Skincare list = skincareService.findSkincareById(id);

        return new JsonBean(1, list);
    }

    @RequestMapping(value = "/skin.do", method = RequestMethod.GET)
    @ApiOperation(value = "该方法是通过指定肤色获取所有护肤品信息的方法")
    public JsonBean findBySkintypeId(int id){
        List<Skincare> list = skincareService.findSkintypeById(id);

        return new JsonBean(1,list);
    }

    @RequestMapping(value = "/brand.do", method = RequestMethod.GET)
    @ApiOperation(value = "该方法是通过指定品牌获取所有护肤品信息的方法")
    public JsonBean findBrandById(int id){
        List<Skincare> list = skincareService.findBrandtypeById(id);

        return new JsonBean(1,list);
    }

    @RequestMapping(value = "/efficacy.do", method = RequestMethod.GET)
    @ApiOperation(value = "该方法是通过指定功效获取所有护肤品信息的方法")
    public JsonBean findEfficacyById(int id){
        List<Skincare> list = skincareService.findEfficacytypeById(id);

        return new JsonBean(1,list);
    }

    @RequestMapping(value = "/asc.do", method = RequestMethod.GET)
    @ApiOperation(value = "该方法是通过价格升序获取所有护肤品信息的方法")
    public JsonBean findAllAsc(Double price){
        List<Skincare> list = skincareService.findSkincareAsc(price);

        return new JsonBean(1,list);
    }

    @RequestMapping(value = "/desc.do", method = RequestMethod.GET)
    @ApiOperation(value = "该方法是通过价格降序获取所有护肤品信息的方法")
    public JsonBean findAllDesc(Double price){
        List<Skincare> list = skincareService.findSkincareDesc(price);

        return new JsonBean(1,list);
    }

    @RequestMapping(value = "/select.do", method = RequestMethod.GET)
    @ApiOperation(value = "该方法是通过类型获取所有护肤品信息的方法")
    public JsonBean selectAll(Double price){
        List<Skincare> list = skincareService.selectAllGoods();

        return new JsonBean(1,list);
    }

}

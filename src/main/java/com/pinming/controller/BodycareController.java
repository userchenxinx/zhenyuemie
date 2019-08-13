package com.pinming.controller;

import com.pinming.common.util.JsonBean;
import com.pinming.common.util.VPageInfo;
import com.pinming.pojo.Bodycare;
import com.pinming.service.BodycareService;
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
@RequestMapping("/bodycare")
@Api(value = "展示身体护理品信息", tags ="身体护理品")
public class BodycareController {

    @Autowired
    BodycareService bodycareService;

    @RequestMapping(value = "/list.do", method = RequestMethod.GET)
    @ApiOperation(value = "该方法是通过分页获取所有身体护理品信息的方法")
    public JsonBean findByPage(int page, Integer type, String info){
        VPageInfo<Bodycare> vPageInfo = bodycareService.findBypage(page, type, info);

        return new JsonBean(1,vPageInfo);
    }

    @RequestMapping(value = "/query.do", method = RequestMethod.GET)
    @ApiOperation(value = "该方法是通过指定id获取所有身体护理品信息的方法")
    public JsonBean findById(int id){
        List<Bodycare> list = bodycareService.findBodycareById(id);

        return new JsonBean(1, list);
    }

    @RequestMapping(value = "/skin.do", method = RequestMethod.GET)
    @ApiOperation(value = "该方法是通过指定肤色获取所有身体护理品信息的方法")
    public JsonBean findBySkintypeId(int id){
        List<Bodycare> list = bodycareService.findSkintypeById(id);

        return new JsonBean(1,list);
    }

    @RequestMapping(value = "/brand.do", method = RequestMethod.GET)
    @ApiOperation(value = "该方法是通过指定品牌获取所有身体护理品信息的方法")
    public JsonBean findBrandById(int id){
        List<Bodycare> list = bodycareService.findBrandtypeById(id);

        return new JsonBean(1,list);
    }

    @RequestMapping(value = "/efficacy.do", method = RequestMethod.GET)
    @ApiOperation(value = "该方法是通过指定功效获取所有身体护理品信息的方法")
    public JsonBean findEfficacyById(int id){
        List<Bodycare> list = bodycareService.findEfficacytypeById(id);

        return new JsonBean(1,list);
    }

    @RequestMapping(value = "/asc.do", method = RequestMethod.GET)
    @ApiOperation(value = "该方法是通过价格升序获取所有身体护理品信息的方法")
    public JsonBean findAllAsc(Double price){
        List<Bodycare> list = bodycareService.findBodycareAsc(price);

        return new JsonBean(1,list);
    }

    @RequestMapping(value = "/desc.do", method = RequestMethod.GET)
    @ApiOperation(value = "该方法是通过价格降序获取所有身体护理品信息的方法")
    public JsonBean findAllDesc(Double price){
        List<Bodycare> list = bodycareService.findBodycareDesc(price);

        return new JsonBean(1,list);
    }

    @RequestMapping(value = "/select.do", method = RequestMethod.GET)
    @ApiOperation(value = "该方法是通过类型获取所有身体护理品信息的方法")
    public JsonBean selectAll(Double price){
        List<Bodycare> list = bodycareService.selectAllGoods();

        return new JsonBean(1,list);
    }

}

package com.pinming.controller;

import com.pinming.common.util.JsonBean;
import com.pinming.common.util.VPageInfo;
import com.pinming.pojo.Perfume;
import com.pinming.service.PerfumeServce;
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
@RequestMapping("perfume")
@Api(value = "香氛信息", tags ="香氛")
public class PerfumeController {

    @Autowired
    PerfumeServce perfumeServer;

    @RequestMapping(value = "/list.do", method = RequestMethod.GET)
    @ApiOperation(value = "该方法是通过分页获取所有香氛信息的方法")
    public JsonBean findByPage(int page, Integer type, String info){

        VPageInfo<Perfume> pageInfo = perfumeServer.findByPage(page, type, info);
        System.out.println(pageInfo);

        return new JsonBean(1,pageInfo);

    }

    @RequestMapping(value = "/query.do", method = RequestMethod.GET)
    @ApiOperation(value = "该方法是通过指定id获取所有香氛信息的方法")
    public JsonBean findById(int id){
        List<Perfume> list = perfumeServer.findSkincareById(id);

        return new JsonBean(1, list);
    }

    @RequestMapping(value = "/skin.do", method = RequestMethod.GET)
    @ApiOperation(value = "该方法是通过指定肤色获取所有香氛信息的方法")
    public JsonBean findBySkintypeId(int id){
        List<Perfume> list = perfumeServer.findSkintypeById(id);

        return new JsonBean(1,list);
    }

    @RequestMapping(value = "/brand.do", method = RequestMethod.GET)
    @ApiOperation(value = "该方法是通过指定品牌获取所有香氛信息的方法")
    public JsonBean findBrandById(int id){
        List<Perfume> list = perfumeServer.findBrandtypeById(id);

        return new JsonBean(1,list);
    }

    @RequestMapping(value = "/efficacy.do", method = RequestMethod.GET)
    @ApiOperation(value = "该方法是通过指定功效获取所有香氛信息的方法")
    public JsonBean findEfficacyById(int id){
        List<Perfume> list = perfumeServer.findEfficacytypeById(id);

        return new JsonBean(1,list);
    }

    @RequestMapping(value = "/asc.do", method = RequestMethod.GET)
    @ApiOperation(value = "该方法是通过价格升序获取所有香氛信息的方法")
    public JsonBean findAllAsc(Double price){
        List<Perfume> list = perfumeServer.findSkincareAsc(price);

        return new JsonBean(1,list);
    }

    @RequestMapping(value = "/desc.do", method = RequestMethod.GET)
    @ApiOperation(value = "该方法是通过价格降序获取所有香氛信息的方法")
    public JsonBean findAllDesc(Double price){
        List<Perfume> list = perfumeServer.findSkincareDesc(price);

        return new JsonBean(1,list);
    }

}

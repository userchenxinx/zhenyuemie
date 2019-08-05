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
        List<Skincare> list = skincareService.findSkincareById(id);

        return new JsonBean(1, list);
    }

}

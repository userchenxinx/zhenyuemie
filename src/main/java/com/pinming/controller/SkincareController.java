package com.pinming.controller;

import com.pinming.common.util.JsonBean;
import com.pinming.common.util.VPageInfo;
import com.pinming.pojo.Skincare;
import com.pinming.service.SkincareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: jie
 * @create: 2019-08-03 15:44
 **/
@RestController
@RequestMapping("/skincare")
public class SkincareController {

    @Autowired
    SkincareService skincareService;

    @RequestMapping("list.do")
    public JsonBean findByPage(int page, Integer type, String info){
        VPageInfo<Skincare> vPageInfo = skincareService.findBypage(page, type, info);

        return new JsonBean(1,vPageInfo);
    }

    @RequestMapping("query.do")
    public JsonBean findById(int id){
        List<Skincare> list = skincareService.findSkincareById(id);

        return new JsonBean(1, list);
    }

}

package com.pinming.controller;

import com.pinming.common.util.JsonBean;
import com.pinming.common.util.VPageInfo;
import com.pinming.pojo.Perfume;
import com.pinming.service.PerfumeServce;
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
public class PerfumeController {

    @Autowired
    PerfumeServce perfumeServer;

    @RequestMapping(value = "/list.do", method = RequestMethod.GET)
    public JsonBean findByPage(int page, Integer type, String info){

        VPageInfo<Perfume> pageInfo = perfumeServer.findByPage(page, type, info);
        System.out.println(pageInfo);

        return new JsonBean(1,pageInfo);

    }

    @RequestMapping("query.do")
    public JsonBean findById(int id){
        List<Perfume> list = perfumeServer.findSkincareById(id);

        return new JsonBean(1, list);
    }

}

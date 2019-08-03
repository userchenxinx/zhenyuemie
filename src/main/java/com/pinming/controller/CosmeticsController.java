package com.pinming.controller;

import com.pinming.common.util.JsonBean;
import com.pinming.common.util.VPageInfo;
import com.pinming.pojo.Cosmetics;
import com.pinming.service.CosmeticsServce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: jie
 * @create: 2019-08-01 20:05
 **/
@RestController
@RequestMapping("cosmetics")
public class CosmeticsController {

    @Autowired
    CosmeticsServce cosmeticsServer;

    @RequestMapping(value = "/list.do", method = RequestMethod.GET)
    public JsonBean findByPage(int page, Integer type, String info){

        VPageInfo<Cosmetics> pageInfo = cosmeticsServer.findByPage(page, type, info);
        System.out.println(pageInfo);

        return new JsonBean(1,pageInfo);

    }
}

package com.pinming.controller;

import com.pinming.common.vo.R;
import com.pinming.pojo.Evaluate;
import com.pinming.service.EvaluateService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@CrossOrigin
@Api(value = "用户点评",tags ="用户点评操作")
public class EvaluateController {

    @Autowired
    private EvaluateService evaluateService;

    // 用户点评列表
    @ApiOperation(value = "用户点评",notes = "用户点评")
    @ResponseBody
    @GetMapping("/evaluatelist/listid.do")
    public R showAllEvaluateById(int id){
        return evaluateService.showAllEvaluate(id);
    }

    // 添加点评
    @ApiOperation(value = "添加点评",notes = "添加点评")
    @ResponseBody
    @GetMapping("/evaluate/add.do")
    public R addEva(Evaluate evaluate){
        return evaluateService.addEva(evaluate);
    }
}

package com.pinming.controller;

import com.pinming.common.vo.R;
import com.pinming.pojo.Aaddress;
import com.pinming.service.AaddressService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @program: zhenyuemie
 * @author: Larissa
 * @create: 2019-08-10 14:51
 */
@RestController
@CrossOrigin
@Api(value = "收件地址",tags ="收件地址操作")
public class AddressController {
    @Autowired
    private AaddressService aaddressService;

    @ApiOperation(value = "省市区联查",notes = "省市区联查")
    @GetMapping("/user/addrarea.do")
    public R selectAddrArea(int id){
        return aaddressService.selectAddrArea(id);
    }

    // 收件地址
    @ApiOperation(value = "收件地址",notes = "收件地址")
    @GetMapping("/user/addr.do")
    public R selectAllAddr(){
        return aaddressService.selectAddr();
    }
    // 添加收件地址
    @ApiOperation(value = "添加收件地址",notes = "添加收件地址")
    @GetMapping("/user/addaddr.do")
    public R addAddr(Aaddress aaddress){
        return aaddressService.addAddr(aaddress);
    }

    //  删除收件
    @ApiOperation(value = "通过id删除收件地址",notes = "删除收件地址")
    @ResponseBody
    @GetMapping("/set/dele.do")
    public R deleAddr(int id){
        return aaddressService.deleAddrById(id);

    }
    // 编辑收件地址
    @ApiOperation(value = "通过id查找收件地址",notes = "查找收件地址")
    @ResponseBody
    @PostMapping("/user/findbyid.do")
    public R findById(int id){
        return aaddressService.findById(id);
    }
    @ApiOperation(value = "修改收件地址",notes = "修改收件地址")
    @ResponseBody
    @PostMapping("/user/updateadds.do")
    public R updateAddr(Aaddress aaddress){
        return aaddressService.updateAddr(aaddress);
    }
}

package com.pinming.service.impl;

import com.pinming.common.vo.R;
import com.pinming.mapper.AaddressMapper;
import com.pinming.model.AddressVG;
import com.pinming.model.Adds;
import com.pinming.pojo.Aaddress;
import com.pinming.service.AaddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: zhenyuemie
 * @author: Larissa
 * @create: 2019-08-10 14:46
 */
@Service
public class AaddressServiceImpl implements AaddressService {
    @Autowired
    private AaddressMapper aaddressMapper;

    @Override
    public R selectAddrArea(int id) {
        List<Adds> list=aaddressMapper.findArea(id);
        return R.setOK("OK",list);
    }

    @Override
    public R selectAddr() {
        List<AddressVG> list = aaddressMapper.findAllAddr();
        return R.setOK("OK",list);
    }

    @Override
    public R addAddr(Aaddress aaddress) {
        aaddressMapper.addAddr(aaddress);
        return R.setOK("Ok","添加成功");
    }

    @Override
    public R deleAddrById(int id) {
        aaddressMapper.delectAddr(id);
        return R.setOK("OK","删除成功");
    }

    @Override
    public R findById(int id) {
        Aaddress aaddress = aaddressMapper.findById(id);
        return R.setOK("OK",aaddress);
    }

    @Override
    public R updateAddr(Aaddress aaddress) {
        aaddressMapper.update(aaddress);
        return R.setOK("OK","修改成功");
    }
}

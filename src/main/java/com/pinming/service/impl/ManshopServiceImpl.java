package com.pinming.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.pinming.common.vo.R;
import com.pinming.mapper.ManshopMapper;
import com.pinming.mapper.MshopdetaMapper;
import com.pinming.mapper.MtypeMapper;
import com.pinming.model.ManshopVG;
import com.pinming.model.MshopdfVG;
import com.pinming.pojo.Mshopdeta;
import com.pinming.service.ManshopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ManshopServiceImpl implements ManshopService {
    @Autowired
    private ManshopMapper manshopMapper;
    @Autowired
    private MtypeMapper mtypeMapper;
    @Autowired
    private MshopdetaMapper mshopdetaMapper;


    @Override
    public R selectByManId(int id) {
        List<ManshopVG> list = manshopMapper.findList(id);

        return R.setOK("OK",list);
    }

    @Override
    public R selectByFtypeId(int id) {
        List<MshopdfVG> list = mshopdetaMapper.findshopByftypeId(id);
        return R.setOK("OK",list);
    }

    @Override
    public R selectById(int id) {
        List<Mshopdeta> list = mshopdetaMapper.selectById(id);
        return R.setOK("OK",list);
    }

    //测试分页
    @Override
    public Map<String, Object> selectAll(int page) {
        PageHelper.startPage(page,2);
        List<Mshopdeta> list = mshopdetaMapper.findAllShop();
        Map<String,Object> map = new HashMap<>();
        //获取总记录书
        map.put("total",((Page)list).getTotal());
        //当前页显示的记录
        map.put("rows",list);
        return map;
    }

//    //分页测试
//    @Override
//    public R selectAll(int page) {
//        PageHelper.startPage(page,5);
//        List<Mshopdeta> list = mshopdetaMapper.findAllShop();
//        Map<String,Object> map = new HashMap<>();
//        //获取总记录书
//        map.put("total",((Page)list).getTotal());
//        //当前页显示的记录
//        map.put("rows",list);
//
//        return R.setOK("OK",map);
//    }

    @Override
    public List<Mshopdeta> findByType(String goodsname) {
        List<Mshopdeta> list = manshopMapper.findByType(goodsname);
        return list;
    }

}

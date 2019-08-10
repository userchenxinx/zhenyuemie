package com.pinming.service;

import com.pinming.common.vo.R;
import com.pinming.pojo.Mshopdeta;

import java.util.List;
import java.util.Map;

public interface ManshopService {

    R selectByManId(int id);

    R selectByFtypeId(int id);

    R selectById(int id);

//    //分页测试
//    R selectAll(int page);
    //分页测试
    Map<String,Object> selectAll(int page);

    //条件查询
    List<Mshopdeta> findByType(String goodsname);
}

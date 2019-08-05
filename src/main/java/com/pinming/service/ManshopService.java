package com.pinming.service;

import com.pinming.common.vo.R;
import com.pinming.pojo.Mshopdeta;

import java.util.List;

public interface ManshopService {

    R selectByManId(int id);

    R selectByFtypeId(int id);

    R selectById(int id);

    R selectAll();

    //条件查询
    List<Mshopdeta> findByType(String goodsname);
}

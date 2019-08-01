package com.pinming.mapper;

import com.pinming.pojo.Cosmetics;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author: jie
 * @create: 2019-08-01 17:14
 **/
@Mapper
public interface CosmeticsMapper {

    /**
     * 查询所有的商品信息
     * @return
     */
    List<Cosmetics> findAll();
}

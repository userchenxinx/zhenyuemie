package com.pinming.mapper;


import com.pinming.model.MshopTyptV;
import com.pinming.model.MshopdfVG;
import com.pinming.pojo.Mshopdeta;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface MshopdetaMapper {
    // 根据ftype查看商品
    List<MshopdfVG> findshopByftypeId(int id);
    // 根据商品id查看详情
    List<Mshopdeta> selectById(int id);
    //查看所有商品
    List<Mshopdeta> findAllShop();
    // 根据ftype的id展示商品
    List<MshopTyptV> selectTypeId (int id);

    // 根据更新时间进行排序

    List<Mshopdeta> findByType(String goodsname);
}
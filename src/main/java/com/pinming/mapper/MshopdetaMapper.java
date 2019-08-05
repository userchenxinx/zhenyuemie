package com.pinming.mapper;


import com.pinming.model.MshopdfVG;
import com.pinming.pojo.Mshopdeta;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface MshopdetaMapper {
    // 根据ftype查看商品
    List<MshopdfVG> findshopByftypeId(int id);
    // 查看商品详情
    List<Mshopdeta> selectById(int id);
}
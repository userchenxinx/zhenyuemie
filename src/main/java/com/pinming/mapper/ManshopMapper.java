package com.pinming.mapper;
import com.pinming.model.ManshopVG;
import com.pinming.pojo.Mshopdeta;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;
@Mapper
public interface ManshopMapper {
    List<ManshopVG> findList(int id);

    //条件查询
    List<Mshopdeta> findByType(String goodsname);
}
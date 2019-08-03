package com.pinming.mapper;

import com.pinming.pojo.Cosmetics;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

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
    public List<Cosmetics> findByIndexAndSize(@Param("index") int index, @Param("size") int size,
                                              @Param("type") Integer type, @Param("info") String info);
    public int count(@Param("type") Integer type, @Param("info") String info);
}

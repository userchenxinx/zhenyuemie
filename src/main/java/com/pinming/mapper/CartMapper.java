package com.pinming.mapper;

import com.pinming.pojo.Cart;
import com.pinming.vo.CartGoods;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CartMapper {
    void deleteByPrimaryKey(int userid);

    int insert(int userid ,int goodsid,int goodsnum);

    int insertSelective(Cart record);

    List<CartGoods> selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cart record);

    int updateByPrimaryKey(Cart record);

    void deleteById(int id);
}
package com.pinming.mapper;


import com.pinming.pojo.OrderDetails;
import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface OrderDetailsMapper {
    int deleteByPrimaryKey(Integer id);

    int insertSelective(OrderDetails record);

    OrderDetails selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderDetails record);

    int updateByPrimaryKey(OrderDetails record);

    void add(OrderDetails orderDetails);
}
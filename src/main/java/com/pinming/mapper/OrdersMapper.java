package com.pinming.mapper;

import com.pinming.pojo.Orders;
import com.pinming.vo.OrderQueryVo;
import com.pinming.vo.userOrder;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrdersMapper {
    int deleteByPrimaryKey(Integer oid);

    int insertSelective(Orders record);

    List<userOrder> selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKey(Orders record);

    int add(Orders orders);

    Orders selectAutoId();

    List<userOrder> selectuserOrderList(OrderQueryVo orderQueryVo);

    int getCount(OrderQueryVo orderQueryVo);
}
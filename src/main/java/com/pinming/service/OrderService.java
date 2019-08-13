package com.pinming.service;

import com.pinming.vo.OrderQueryVo;
import com.pinming.vo.VorderInfo;
import com.pinming.vo.userOrder;

import java.util.List;


public interface OrderService {
   /* void addOrder(Orders orders, List<OrderDetails> detailsList);
*/
    void addOrder(VorderInfo orderInfo);

    void  addOrder2(String[] ids,String[] nums,Integer uid);

    List<userOrder> selectOrders(int uid);

    List<userOrder> selectListOrder(OrderQueryVo orderQueryVo);

    int getCount(OrderQueryVo orderQueryVo);
}

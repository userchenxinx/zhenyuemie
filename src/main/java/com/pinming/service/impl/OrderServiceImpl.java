package com.pinming.service.impl;

import com.pinming.common.util.StrUtils;
import com.pinming.mapper.OrderDetailsMapper;
import com.pinming.mapper.OrdersMapper;
import com.pinming.mapper.SkincareMapper;
import com.pinming.pojo.OrderDetails;
import com.pinming.pojo.Orders;
import com.pinming.pojo.Skincare;
import com.pinming.service.OrderService;
import com.pinming.vo.OrderQueryVo;
import com.pinming.vo.VorderInfo;
import com.pinming.vo.userOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired(required = false)
    private OrdersMapper ordersDao;
    @Autowired(required = false)
    private OrderDetailsMapper detailsDao;
    @Autowired(required = false)
    private SkincareMapper skincareDao;
   /* @Override
    public void addOrder(Orders orders, List<OrderDetails> detailsList) {
         int oid = 0;
         if(orders.getOid()==0 && orders.getOid()==null){
             ordersDao.add(orders);
             oid = orders.getOid();
             System.out.println(oid);
         }

         //分别添加订单明细;
        for(OrderDetails orderDetails : detailsList){
            orderDetails.setOid(oid);
            detailsDao.add(orderDetails);
        }
    }*/

    @Override
    public void addOrder(VorderInfo orderInfo) {
        Orders orders =new Orders();
        orders.setCreatetime(new Date());
        orders.setOrderstatus(1);
        orders.setUid(4);
        orders.setOrdercode(StrUtils.createOrderCode());

        double totalPrice = 0.0;

        List<OrderDetails> details = orderInfo.getDetails();

        for(OrderDetails orderDetails : details){
            Skincare skincare =  skincareDao.findById(orderDetails.getGoodsdetid());
            totalPrice = orderDetails.getGoodsnum()*skincare.getPrice();
        }
        orders.setTatalprice(totalPrice);

        ordersDao.add(orders);
      /*  Orders orders1 = ordersDao.selectAutoId();*/
        int oid = orders.getOid();
        for(OrderDetails orderDetails : details){
            orderDetails.setOid(oid);
            detailsDao.add(orderDetails);
        }
    }

    @Override
    public void addOrder2(String[] ids, String[] nums, Integer uid) {

    }

    @Override
    public List<userOrder> selectOrders(int uid) {
        return ordersDao.selectByPrimaryKey(uid);
    }

    @Override
    public List<userOrder> selectListOrder(OrderQueryVo orderQueryVo) {
        return ordersDao.selectuserOrderList(orderQueryVo);
    }

    @Override
    public int getCount(OrderQueryVo orderQueryVo) {
        int result = ordersDao.getCount(orderQueryVo);
        return result;
    }
}

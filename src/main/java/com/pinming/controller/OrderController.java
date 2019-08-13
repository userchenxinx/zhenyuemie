package com.pinming.controller;


import com.pinming.common.util.JsonBean;
import com.pinming.common.util.Page;
import com.pinming.pojo.OrderDetails;
import com.pinming.service.OrderService;
import com.pinming.vo.OrderQueryVo;
import com.pinming.vo.VorderInfo;
import com.pinming.vo.userOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/order")
public class OrderController {

     @Autowired
     private OrderService  orderService;


     @PostMapping("/addOrder")
     @ResponseBody
     public JsonBean addOrder(HttpServletRequest request, HttpServletResponse response, HttpSession session){


        /*  if (user == null) {
             return new JsonBean(-1, "用户未登录，请先登录");
         }*/

//         String[] ids = request.getParameterValues("ids");
//         String[] nums = request.getParameterValues("nums");
//         User user = (User)session.getAttribute("user");

         VorderInfo orderInfo = new VorderInfo();
         orderInfo.setUid(4);
         List<OrderDetails> list = new ArrayList<>();

        /* for(int i = 0; i < ids.length; i++){
             OrderDetails details = new OrderDetails();
             details.setGoodsdetid(Integer.parseInt(ids[i]));
             details.setGoodsnum(Integer.parseInt(nums[i]));

             list.add(details);
         }*/
         OrderDetails details = new OrderDetails();
         details.setGoodsdetid(1);
         details.setGoodsnum(2);

         list.add(details);
         orderInfo.setDetails(list);

         orderService.addOrder(orderInfo);

         return new JsonBean(1,null);
     }

     @GetMapping("/listOrder")
     @ResponseBody
     public JsonBean selectOrder(int uid){

         List<userOrder>  list = orderService.selectOrders(uid);
         if(list.size() != 0 ){
             return  new JsonBean(1,list);
         }else {
             return new JsonBean(0,null);
         }

     }

     @GetMapping("/listAllorder")
     @ResponseBody
     public JsonBean list(Model model, OrderQueryVo orderQueryVo){

         //当前页数 每页多少条  计算begin
         orderQueryVo.setBegin((orderQueryVo.getPage()-1)*orderQueryVo.getRows());
         List<userOrder> userOrders = orderService.selectListOrder(orderQueryVo);

         Page<userOrder> page = new Page<>();
         page.setSize(orderQueryVo.getRows());
         page.setTotal(orderService.getCount(orderQueryVo));
         page.setRows(userOrders);
         model.addAttribute("page",page);

         return new JsonBean(1,userOrders);
     }


}

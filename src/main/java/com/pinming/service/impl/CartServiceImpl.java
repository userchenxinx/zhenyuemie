package com.pinming.service.impl;

import com.pinming.mapper.CartMapper;
import com.pinming.service.CartService;
import com.pinming.vo.CartGoods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl implements CartService {

    @Autowired(required = false)
    private CartMapper cartDao;


    @Override
    public void SkincareToCart( int userid,int goodsid, int goodsnum) {
        cartDao.insert(userid,goodsid,goodsnum);
    }

    @Override
    public List<CartGoods> queryCart(int userid) {
        List<CartGoods> list = cartDao.selectByPrimaryKey(userid);
        return list;
    }

    @Override
    public void deleteAllCart(int userid) {
        cartDao.deleteByPrimaryKey(userid);
    }

    @Override
    public void deleteCart(int id) {
        cartDao.deleteById(id);
    }


}

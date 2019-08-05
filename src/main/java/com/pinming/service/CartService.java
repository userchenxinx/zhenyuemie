package com.pinming.service;

import com.pinming.vo.CartGoods;

import java.util.List;

public interface CartService {

    void SkincareToCart(int goodsid, int userid,int goodsnum);

    List<CartGoods> queryCart(int userid);

    void deleteAllCart(int userid);

    void deleteCart(int id);
}

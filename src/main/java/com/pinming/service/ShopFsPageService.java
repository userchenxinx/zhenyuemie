package com.pinming.service;

import com.pinming.common.vo.R;

public interface ShopFsPageService {
    R selectWordType(String wordname);
    R selectImg(String img);

    //血拼一下根据折扣价进行显示
    R selectDiscount();
    // 导购精选
    R selection();
}

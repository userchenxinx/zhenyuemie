package com.pinming.service;

import com.pinming.common.vo.R;
import com.pinming.pojo.Aaddress;

public interface AaddressService {
    R selectAddrArea(int id);
    // 收件地址
    R selectAddr();
    // 添加收件地址
    R addAddr(Aaddress aaddress);

    //  删除收件地址
    R deleAddrById(int id);

    // 修改收件地址
    R findById(int id);
    R updateAddr(Aaddress aaddress);
}

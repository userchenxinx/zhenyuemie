package com.pinming.mapper;


import com.pinming.common.vo.R;
import com.pinming.model.AddressVG;
import com.pinming.model.Adds;
import com.pinming.pojo.Aaddress;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface AaddressMapper {
    // 三级联动 进行省市区/县的查询
    List<Adds> findArea(int id);
    // 查看收件地址
    List<AddressVG> findAllAddr();
    // 添加收件地址
    void addAddr(Aaddress aaddress);
    // 删除收件地址
    void delectAddr(int id);
    // 修改收件地址
    Aaddress findById(int id);
    void update(Aaddress aaddress);
}
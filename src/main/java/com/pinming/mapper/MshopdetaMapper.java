package com.pinming.mapper;


import com.pinming.model.MshopTyptV;
import com.pinming.model.MshopdfVG;
import com.pinming.pojo.Mshopdeta;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface MshopdetaMapper {
    // 根据ftype查看商品
    List<MshopdfVG> findshopByftypeId(int id);
    // 根据商品id查看详情
    List<Mshopdeta> selectById(int id);
    //查看所有商品
    List<Mshopdeta> findAllShop();
    // 根据ftype的id展示商品
    List<MshopTyptV> selectTypeId (int id);
    // 根据更新时间进行排序
    List<Mshopdeta> selectTime(int ftypeid);

    // 根据价格进行排序
    List<Mshopdeta> selectPrice(int ftypeid);
    // 首页展示世界大牌图片
    List<Mshopdeta> selectNFtype(String wordname);
    //首页展示通过图片查看商品
    List<Mshopdeta> selectImg(String img);

    // 导购精选
    List<Mshopdeta> selection();

    //血拼一下根据折扣价进行显示
    List<MshopTyptV> selectDiscount();

    // 最热榜单商品
}
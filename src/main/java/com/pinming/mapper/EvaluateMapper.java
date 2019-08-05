package com.pinming.mapper;


import com.pinming.pojo.Evaluate;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface EvaluateMapper {

    // 通过商品的id查看指定商品的评价
    //List<Evaluate> allEvaluateByGid(@Param("gid") int gid);

    // 添加评论

}
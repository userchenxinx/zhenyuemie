package com.pinming.mapper;


import com.pinming.model.EvaluateVG;
import com.pinming.pojo.Evaluate;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface EvaluateMapper {

    // 通过商品的id查看指定商品的评价
    List<EvaluateVG> allEvaluateByGid(int id);

    // 添加评论
    int addEvaluate(Evaluate evaluate);
}
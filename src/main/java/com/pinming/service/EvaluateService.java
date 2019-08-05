package com.pinming.service;

import com.pinming.common.vo.R;
import com.pinming.pojo.Evaluate;

import java.util.Map;

public interface EvaluateService {

    // 展示所有的评论
    R showAllEvaluate(int id);
    // 添加评论
    R addEva(Evaluate evaluate);

}

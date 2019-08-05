package com.pinming.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.pinming.common.vo.PageBean;
import com.pinming.common.vo.R;
import com.pinming.mapper.EvaluateMapper;
import com.pinming.model.EvaluateVG;
import com.pinming.pojo.Evaluate;
import com.pinming.service.EvaluateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class EvaluateServiceImpl implements EvaluateService {

    @Autowired
    private EvaluateMapper evaluateMapper;
    @Override
    public R showAllEvaluate(int id) {
//        int page = Integer.parseInt(map.get("page").toString());
//        int count = Integer.parseInt(map.get("count").toString());
//        int id = Integer.parseInt(map.get("id").toString());
//
//        PageBean<EvaluateVG> pageBean = new PageBean();
//        PageHelper.startPage(page,count);

        List<EvaluateVG> list = evaluateMapper.allEvaluateByGid(id);
//        if (list == null || list.isEmpty()){
//            return R.setERROR("暂无评论");
//        }
//        pageBean.setData(list);
//        pageBean.setCount(count);
//        pageBean.setCurrPage(count);
//        pageBean.setTotalPage(((Page)list).getPages());
//        pageBean.setTotalCount((int)((Page)list).getTotal());

        return R.setOK("OK",list);

    }

    @Override
    public R addEva(Evaluate evaluate) {
        if (evaluateMapper.addEvaluate(evaluate) < 0){
            return R.setERROR("阿欧，添加失败");
        }

        return R.setOK("OK","添加成功");

    }
}

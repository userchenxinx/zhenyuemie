package com.pinming.service.impl;

import com.pinming.common.util.VPageInfo;
import com.pinming.mapper.CosmeticsMapper;
import com.pinming.pojo.Cosmetics;
import com.pinming.service.CosmeticsServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: jie
 * @create: 2019-08-01 19:58
 **/
@Service
public class CosmeticsServerImpl implements CosmeticsServer {

    @Autowired
    CosmeticsMapper cosmeticsMapper;


    @Override
    public VPageInfo<Cosmetics> findByPage(int page) {
        return null;
    }

    @Override
    public VPageInfo<Cosmetics> findByPage(int page, Integer type, String info) {

        VPageInfo<Cosmetics> pageInfo = new VPageInfo<>();
        pageInfo.setCurrentPage(page);

        //设置总页数
        int count = cosmeticsMapper.count(type,info);
        int size =pageInfo.getPageSize();
        int totalPage = 0;
        if ( count % size == 0){
                totalPage = count / size;
        } else {
            totalPage = count / size + 1;
        }
        pageInfo.setTotalPage(totalPage);

        //设置当前查询到的数据
        int index = (page - 1) * pageInfo.getPageSize();
        List<Cosmetics> list = cosmeticsMapper.findByIndexAndSize(index, pageInfo.getPageSize(), type, info);
        pageInfo.setInfos(list);


        return pageInfo;
    }
}

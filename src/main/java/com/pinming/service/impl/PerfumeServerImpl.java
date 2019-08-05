package com.pinming.service.impl;

import com.pinming.common.util.VPageInfo;
import com.pinming.mapper.PerfumeMapper;
import com.pinming.pojo.Perfume;
import com.pinming.service.PerfumeServce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: jie
 * @create: 2019-08-01 19:58
 **/
@Service
public class PerfumeServerImpl implements PerfumeServce {

    @Autowired
    PerfumeMapper perfumeMapper;


    @Override
    public VPageInfo<Perfume> findByPage(int page) {
        return null;
    }

    @Override
    public VPageInfo<Perfume> findByPage(int page, Integer type, String info) {

        VPageInfo<Perfume> pageInfo = new VPageInfo<>();
        pageInfo.setCurrentPage(page);

        //设置总页数
        int count = perfumeMapper.count(type,info);
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
        List<Perfume> list = perfumeMapper.findByIndexAndSize(index, pageInfo.getPageSize(), type, info);
        pageInfo.setInfos(list);


        return pageInfo;
    }

    /**
     * 通过id进行查询
     * @param id
     * @return
     */
    @Override
    public List<Perfume> findSkincareById(int id) {
        return perfumeMapper.findById(id);
    }
}

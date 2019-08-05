package com.pinming.service.impl;

import com.pinming.common.util.VPageInfo;
import com.pinming.mapper.SkincareMapper;
import com.pinming.pojo.Skincare;
import com.pinming.service.SkincareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: jie
 * @create: 2019-08-03 14:36
 **/
@Service
public class SkincareServiceImpl implements SkincareService {

    @Autowired
    SkincareMapper skincareMapper;

    @Override
    public VPageInfo<Skincare> findByPage(int page) {
        return null;
    }

    /**
     * 分页查询信息
     * @param page
     * @param type
     * @param info
     * @return
     */
    @Override
    public VPageInfo<Skincare> findBypage(int page, Integer type, String info) {

        VPageInfo<Skincare> pageInfo = new VPageInfo<>();
        pageInfo.setCurrentPage(page);

        //设置总页数
        int count = skincareMapper.count(type, info);
        int size = pageInfo.getPageSize();
        int totalPage = 0;
        if (count % size == 0){
            totalPage = count / size;

        }else {
            totalPage = count / size + 1;
        }
        pageInfo.setTotalPage(totalPage);

        //设置当前查询到的信息
        int index = (page - 1) * pageInfo.getPageSize();
        List<Skincare> list = skincareMapper.findBySizeAndIndex(  index, pageInfo.getPageSize(),info, type);
        pageInfo.setInfos(list);

        return pageInfo;
    }

    /**
     * 通过id进行查询
     * @param id
     * @return
     */
    @Override
    public List<Skincare> findSkincareById(int id) {
        return skincareMapper.findById(id);
    }

    /**
     * 通过肤质类型进行查询
     * @param id
     * @return
     */
    @Override
    public List<Skincare> findSkintypeById(int id) {
        return skincareMapper.findBySkintypeId(id);
    }

    /**
     * 通过品牌进行信息查询
     * @param id
     * @return
     */
    @Override
    public List<Skincare> findBrandtypeById(int id) {
        return skincareMapper.findByBrandtypeId(id);
    }

    /**
     * 通过功效进行查询信息
     * @param id
     * @return
     */
    @Override
    public List<Skincare> findEfficacytypeById(int id) {
        return skincareMapper.findByEfficacytyoeId(id);
    }

    /**
     * 通过价格升序展示
     * @param price
     * @return
     */
    @Override
    public List<Skincare> findSkincareAsc(Double price) {
        return skincareMapper.findAllAsc(price);
    }

    /**
     * 通过价格降序展示
     * @param price
     * @return
     */
    @Override
    public List<Skincare> findSkincareDesc(Double price) {
        return skincareMapper.findAllDesc(price);
    }
}

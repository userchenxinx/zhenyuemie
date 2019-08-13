package com.pinming.service.impl;

import com.pinming.common.util.VPageInfo;
import com.pinming.mapper.CosmeticsMapper;
import com.pinming.pojo.Cosmetics;
import com.pinming.pojo.Perfume;
import com.pinming.service.CosmeticsServce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: jie
 * @create: 2019-08-01 19:58
 **/
@Service
public class CosmeticsServerImpl implements CosmeticsServce {

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

    /**
     * 通过id进行查询
     * @param id
     * @return
     */
    @Override
    public List<Cosmetics> findSkincareById(int id) {
        return cosmeticsMapper.findById(id);
    }

    /**
     * 通过肤质类型进行查询
     * @param id
     * @return
     */
    @Override
    public List<Cosmetics> findSkintypeById(int id) {
        return cosmeticsMapper.findBySkintypeId(id);
    }

    /**
     * 通过品牌进行信息查询
     * @param id
     * @return
     */
    @Override
    public List<Cosmetics> findBrandtypeById(int id) {
        return cosmeticsMapper.findByBrandtypeId(id);
    }

    /**
     * 通过功效进行查询信息
     * @param id
     * @return
     */
    @Override
    public List<Cosmetics> findEfficacytypeById(int id) {
        return cosmeticsMapper.findByEfficacytyoeId(id);
    }

    /**
     * 通过价格升序展示
     * @param price
     * @return
     */
    @Override
    public List<Cosmetics> findSkincareAsc(Double price) {
        return cosmeticsMapper.findAllAsc(price);
    }

    /**
     * 通过价格降序展示
     * @param price
     * @return
     */
    @Override
    public List<Cosmetics> findSkincareDesc(Double price) {
        return cosmeticsMapper.findAllDesc(price);
    }

    /**
     * 通过类型查询所有数据
     * @return
     */
    @Override
    public List<Cosmetics> selectAllGoods() {
        return cosmeticsMapper.selectAll();
    }

    @Override
    public List<Cosmetics> findAllGoods(int id) {
        return cosmeticsMapper.selectAllGoods(id);
    }
}

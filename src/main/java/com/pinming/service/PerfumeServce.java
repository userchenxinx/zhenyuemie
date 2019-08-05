package com.pinming.service;

import com.pinming.common.util.VPageInfo;
import com.pinming.pojo.Perfume;

import java.util.List;

/**
 * @author: jie
 * @create: 2019-08-01 17:40
 **/
public interface PerfumeServce {

    /**
     * 分页查询所有的产品信息
     * @return
     */
    public VPageInfo<Perfume> findByPage(int page);

    /**
     * 分页查询
     * @param page
     * @param type
     * @param info
     * @return
     */
    public VPageInfo<Perfume> findByPage(int page, Integer type, String info);

    /**
     * 通过id查询商品信息
     * @param id
     * @return
     */
    public List<Perfume> findSkincareById(int id);
}

package com.pinming.service;

import com.pinming.common.util.VPageInfo;
import com.pinming.pojo.Skincare;

import java.util.List;

/**
 * @author: jie
 * @create: 2019-08-03 14:34
 **/
public interface SkincareService {

    /**
     * 通过分页查询
     * @param page
     * @return
     */
    public VPageInfo<Skincare> findByPage(int page);

    /**
     * 分页展示数据
     * @param page
     * @param type
     * @param info
     * @return
     */
    public VPageInfo<Skincare> findBypage(int page,Integer type, String info);

    /**
     * 通过id查询商品信息
     * @param id
     * @return
     */
    public List<Skincare> findSkincareById(int id);
}

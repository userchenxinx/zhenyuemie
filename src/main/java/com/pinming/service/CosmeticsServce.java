package com.pinming.service;

import com.pinming.common.util.VPageInfo;
import com.pinming.pojo.Cosmetics;

/**
 * @author: jie
 * @create: 2019-08-01 17:40
 **/
public interface CosmeticsServce {

    /**
     * 分页查询所有的产品信息
     * @return
     */
    public VPageInfo<Cosmetics> findByPage(int page);

    /**
     * 分页查询
     * @param page
     * @param type
     * @param info
     * @return
     */
    public VPageInfo<Cosmetics> findByPage(int page, Integer type, String info);
}

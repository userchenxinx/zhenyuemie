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

    /**
     * 通过肤质类型进行查询信息
     * @param id
     * @return
     */
    public List<Perfume> findSkintypeById(int id);

    /**
     * 通过品牌类型进行信息查询
     * @param id
     * @return
     */
    public List<Perfume> findBrandtypeById(int id);

    /**
     * 通过功效进行查询
     * @param id
     * @return
     */
    public List<Perfume> findEfficacytypeById(int id);

    /**
     * 通过价格进行升序排序
     * @param price
     * @return
     */
    public List<Perfume> findSkincareAsc(Double price);

    /**
     * 通过价格进行降序排序
     * @param price
     * @return
     */
    public List<Perfume> findSkincareDesc(Double price);

    /**
     * 通过类型查询所有
     * @return
     */
    public List<Perfume> selectAllGoods();
}

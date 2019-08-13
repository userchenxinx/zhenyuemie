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
    public Skincare findSkincareById(int id);

    /**
     * 通过肤质类型进行查询信息
     * @param id
     * @return
     */
    public List<Skincare> findSkintypeById(int id);

    /**
     * 通过品牌类型进行信息查询
     * @param id
     * @return
     */
    public List<Skincare> findBrandtypeById(int id);

    /**
     * 通过功效进行查询
     * @param id
     * @return
     */
    public List<Skincare> findEfficacytypeById(int id);

    /**
     * 通过价格进行升序排序
     * @param price
     * @return
     */
    public List<Skincare> findSkincareAsc(Double price);

    /**
     * 通过价格进行降序排序
     * @param price
     * @return
     */
    public List<Skincare> findSkincareDesc(Double price);

    /**
     * 通过类型查询所有
     * @return
     */
    public List<Skincare> selectAllGoods();


}

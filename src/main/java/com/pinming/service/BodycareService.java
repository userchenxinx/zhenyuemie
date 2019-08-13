package com.pinming.service;

import com.pinming.common.util.VPageInfo;
import com.pinming.pojo.Bodycare;

import java.util.List;

/**
 * @author: jie
 * @create: 2019-08-03 14:34
 **/
public interface BodycareService {

    /**
     * 通过分页查询
     * @param page
     * @return
     */
    public VPageInfo<Bodycare> findByPage(int page);

    /**
     * 分页展示数据
     * @param page
     * @param type
     * @param info
     * @return
     */
    public VPageInfo<Bodycare> findBypage(int page, Integer type, String info);

    /**
     * 通过id查询商品信息
     * @param id
     * @return
     */
    public List<Bodycare> findBodycareById(int id);

    /**
     * 通过肤质类型进行查询信息
     * @param id
     * @return
     */
    public List<Bodycare> findSkintypeById(int id);

    /**
     * 通过品牌类型进行信息查询
     * @param id
     * @return
     */
    public List<Bodycare> findBrandtypeById(int id);

    /**
     * 通过功效进行查询
     * @param id
     * @return
     */
    public List<Bodycare> findEfficacytypeById(int id);

    /**
     * 通过价格进行升序排序
     * @param price
     * @return
     */
    public List<Bodycare> findBodycareAsc(Double price);

    /**
     * 通过价格进行降序排序
     * @param price
     * @return
     */
    public List<Bodycare> findBodycareDesc(Double price);

    /**
     * 通过类型查询所有
     * @return
     */
    public List<Bodycare> selectAllGoods();

    /**
     * 通过多种条件进行查询
     * @return
     */
    public List<Bodycare> findAllGoods(int id);
}

package com.pinming.mapper;

import com.pinming.pojo.Cosmetics;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author: jie
 * @create: 2019-08-01 17:14
 **/
@Mapper
public interface CosmeticsMapper {

    /**
     * 查询所有的商品信息
     * @return
     */
    public List<Cosmetics> findByIndexAndSize(@Param("index") int index, @Param("size") int size,

                                              @Param("type") Integer type, @Param("info") String info);

    /**
     * 计算页数
     * @param type
     * @param info
     * @return
     */
    public int count(@Param("type") Integer type, @Param("info") String info);

    /**
     * 通过id查询商品的详情信息
     * @param id
     * @return
     */
    public List<Cosmetics> findById(int id);

    /**
     * 通过肤质类型进行查询
     * @param id
     * @return
     */
    public List<Cosmetics> findBySkintypeId(int id);

    /**
     * 通过品牌进行信息查询
     * @param id
     * @return
     */
    public List<Cosmetics> findByBrandtypeId(int id);

    /**
     * 通过功效进行查询
     * @param id
     * @return
     */
    public List<Cosmetics> findByEfficacytyoeId(int id);

    /**
     * 通过价格升序展示
     * @param price
     * @return
     */
    public List<Cosmetics> findAllAsc(Double price);

    /**
     * 通过价格降序展示
     * @param price
     * @return
     */
    public List<Cosmetics> findAllDesc(Double price);

    /**
     * 通过类型进行查询
     * @return
     */
    public List<Cosmetics> selectAll();

    /**
     * 通过多种条件进行查询
     * @return
     */
    public List<Cosmetics> selectAllGoods(int efid, int brid, int skid);
}

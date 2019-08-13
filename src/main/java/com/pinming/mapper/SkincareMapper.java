package com.pinming.mapper;

import com.pinming.pojo.Skincare;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author: jie
 * @create: 2019-08-03 14:20
 **/
@Mapper
public interface SkincareMapper {

    /**
     * 分页查询所有
     * @param index
     * @param size
     * @param info
     * @param type
     * @return
     */
    public List<Skincare> findBySizeAndIndex(@Param("index") int index, @Param("size") int size, @Param("info") String info, @Param("type")Integer type);

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
    public Skincare findById(int id);

    /**
     * 通过肤质类型进行查询
     * @param id
     * @return
     */
    public List<Skincare> findBySkintypeId(int id);

    /**
     * 通过品牌进行信息查询
     * @param id
     * @return
     */
    public List<Skincare> findByBrandtypeId(int id);

    /**
     * 通过功效进行查询
     * @param id
     * @return
     */
    public List<Skincare> findByEfficacytyoeId(int id);

    /**
     * 通过价格升序展示
     * @param price
     * @return
     */
    public List<Skincare> findAllAsc(Double price);

    /**
     * 通过价格降序展示
     * @param price
     * @return
     */
    public List<Skincare> findAllDesc(Double price);

    /**
     * 通过类型进行查询
     * @return
     */
    public List<Skincare> selectAll();


}

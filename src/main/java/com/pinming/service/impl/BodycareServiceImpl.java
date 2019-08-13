package com.pinming.service.impl;

import com.pinming.common.util.VPageInfo;
import com.pinming.mapper.BodycareMapper;
import com.pinming.pojo.Bodycare;
import com.pinming.service.BodycareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: jie
 * @create: 2019-08-03 14:36
 **/
@Service
public class BodycareServiceImpl implements BodycareService {

    @Autowired
    BodycareMapper bodycareMapper;

    @Override
    public VPageInfo<Bodycare> findByPage(int page) {
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
    public VPageInfo<Bodycare> findBypage(int page, Integer type, String info) {

        VPageInfo<Bodycare> pageInfo = new VPageInfo<>();
        pageInfo.setCurrentPage(page);

        //设置总页数
        int count = bodycareMapper.count(type, info);
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
        List<Bodycare> list = bodycareMapper.findBySizeAndIndex(  index, pageInfo.getPageSize(),info, type);
        pageInfo.setInfos(list);

        return pageInfo;
    }

    /**
     * 通过id进行查询
     * @param id
     * @return
     */
    @Override
    public List<Bodycare> findBodycareById(int id) {
        return bodycareMapper.findById(id);
    }

    /**
     * 通过肤质类型进行查询
     * @param id
     * @return
     */
    @Override
    public List<Bodycare> findSkintypeById(int id) {
        return bodycareMapper.findBySkintypeId(id);
    }

    /**
     * 通过品牌进行信息查询
     * @param id
     * @return
     */
    @Override
    public List<Bodycare> findBrandtypeById(int id) {
        return bodycareMapper.findByBrandtypeId(id);
    }

    /**
     * 通过功效进行查询信息
     * @param id
     * @return
     */
    @Override
    public List<Bodycare> findEfficacytypeById(int id) {
        return bodycareMapper.findByEfficacytyoeId(id);
    }

    /**
     * 通过价格升序展示
     * @param price
     * @return
     */
    @Override
    public List<Bodycare> findBodycareAsc(Double price) {
        return bodycareMapper.findAllAsc(price);
    }

    /**
     * 通过价格降序展示
     * @param price
     * @return
     */
    @Override
    public List<Bodycare> findBodycareDesc(Double price) {
        return bodycareMapper.findAllDesc(price);
    }

    /**
     * 通过类型查询所有数据
     * @return
     */
    @Override
    public List<Bodycare> selectAllGoods() {
        return bodycareMapper.selectAll();
    }

    @Override
    public List<Bodycare> findAllGoods(int efid, int brid, int skid) {
        return bodycareMapper.selectAllGoods(efid,brid,skid);
    }
}

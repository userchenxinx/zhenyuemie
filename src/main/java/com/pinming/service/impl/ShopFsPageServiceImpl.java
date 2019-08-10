package com.pinming.service.impl;

import com.pinming.common.vo.R;
import com.pinming.mapper.MshopdetaMapper;
import com.pinming.model.MshopTyptV;
import com.pinming.pojo.Mshopdeta;
import com.pinming.service.ShopFsPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: zhenyuemie
 * @author: Larissa
 * @create: 2019-08-06 22:08
 */
@Service
public class ShopFsPageServiceImpl implements ShopFsPageService {

    @Autowired
    private MshopdetaMapper mshopdetaMapper;
    @Override
    public R selectWordType(String wordname) {
        List<Mshopdeta> list = mshopdetaMapper.selectNFtype(wordname);
        return R.setOK("OK",list);
    }

    @Override
    public R selectImg(String img) {
        List<Mshopdeta> list = mshopdetaMapper.selectImg(img);
        return R.setOK("OK",list);
    }

    @Override
    public R selectDiscount() {
        List<MshopTyptV> list=mshopdetaMapper.selectDiscount();
        return R.setOK("OK",list);
    }

    @Override
    public R selection() {
        List<Mshopdeta> list=mshopdetaMapper.selection();
        return R.setOK("OK",list);
    }
}

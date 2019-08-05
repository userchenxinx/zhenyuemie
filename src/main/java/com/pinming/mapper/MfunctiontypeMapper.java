package com.pinming.mapper;


import com.pinming.pojo.Mfunctiontype;

public interface MfunctiontypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Mfunctiontype record);

    int insertSelective(Mfunctiontype record);

    Mfunctiontype selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Mfunctiontype record);

    int updateByPrimaryKey(Mfunctiontype record);
}
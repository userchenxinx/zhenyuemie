package com.pinming.service;

import com.pinming.common.vo.R;

public interface ManshopService {

    R selectByManId(int id);

    R selectByFtypeId(int id);

    R selectById(int id);

    R selectAll();

    R selectFtypeId(int id);
}

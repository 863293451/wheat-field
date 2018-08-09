package com.jk.service.test.impl;

import com.jk.mapper.test.testMapper;
import com.jk.pojo.test.boos;
import com.jk.service.test.ItestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class testServiceImpl implements ItestService {

    @Autowired
    private testMapper testMapperAll;

    // 使用 mybits  进行 查询
    public List<boos> getListboos() {
        List<boos> boosList = testMapperAll.getListboos();
        return boosList;
    }
}
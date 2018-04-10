package com.productDemo.service.impl;

import com.productDemo.dao.CatagoryDao;
import com.productDemo.pojo.Catagory;
import com.productDemo.service.CatagoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by
 * 白夜行 on 2018/4/9.
 */
@Service
public class CatagoryServiceImpl implements CatagoryService{

    @Autowired
    private CatagoryDao catagoryDao;//注入产品类别的数据访问对象

    @Override
    public List<Catagory> getCatagorys() {
        return catagoryDao.getCatagorys();
    }
}

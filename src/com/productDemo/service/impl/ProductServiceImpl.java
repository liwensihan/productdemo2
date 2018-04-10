package com.productDemo.service.impl;

import com.productDemo.dao.ProductDao;
import com.productDemo.pojo.Product;
import com.productDemo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by
 * 白夜行 on 2018/4/9.
 */
@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductDao productDao;//产品数据访问层对象

    @Override
    public List<Product> getProducts(Map map) {
        return productDao.getProducts(map);
    }

    @Override
    public int getCount() {
        return productDao.getCount();
    }

    @Override
    public int del(Integer id) {
        return productDao.del(id);
    }

    @Override
    public int add(Product product) {
        return productDao.add(product);
    }
}

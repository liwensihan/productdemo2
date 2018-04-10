package com.productDemo.service;

import com.productDemo.pojo.Product;
import com.productDemo.util.Pager;

import java.util.List;
import java.util.Map;

/**
 * Created by
 * 白夜行 on 2018/4/9.
 */
public interface ProductService {
    List<Product> getProducts(Map map);//得到产品
    int getCount();//得到产品数量
    int del(Integer id);//删除
    int add(Product product);//新增
}

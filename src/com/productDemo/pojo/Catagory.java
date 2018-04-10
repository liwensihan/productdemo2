package com.productDemo.pojo;

/**
 * Created by
 * 白夜行 on 2018/4/9.
 */
public class Catagory {
    private Integer id;//产品类别编号
    private String name;//产品类别名
    private String explain;//产品介绍

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExplain() {
        return explain;
    }

    public void setExplain(String explain) {
        this.explain = explain;
    }
}

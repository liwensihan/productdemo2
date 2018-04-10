package com.productDemo.pojo;

/**
 * Created by
 * 白夜行 on 2018/4/9.
 */
public class Product {
    private Integer id;//产品编号
    private String productname;//产品名称
    private String descs;//产品描述
    private Integer cid;//产品类别编号
    private Catagory catagory;//产品类别对象

    public Catagory getCatagory() {
        return catagory;
    }

    public void setCatagory(Catagory catagory) {
        this.catagory = catagory;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getDescs() {
        return descs;
    }

    public void setDescs(String descs) {
        this.descs = descs;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }
}

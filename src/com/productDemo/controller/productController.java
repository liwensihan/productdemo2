package com.productDemo.controller;

import com.productDemo.pojo.Catagory;
import com.productDemo.pojo.Product;
import com.productDemo.service.CatagoryService;
import com.productDemo.service.ProductService;
import com.productDemo.util.Pager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by
 * 白夜行 on 2018/4/9.
 */
@Controller
public class productController {

    @Autowired
    private ProductService productService;

    @Autowired
    private CatagoryService catagoryService;

    /**
     * 去查询
     * @param modelAndView
     * @param pageNo
     * @return
     */
    @RequestMapping("/index")
    public ModelAndView index(ModelAndView modelAndView ,Integer pageNo){
        Pager pager = new Pager();
        pager.setTotalCount(productService.getCount());
        if (pageNo==null){
            pager.setPageNo(1);
        }else{
            pager.setPageNo(pageNo);
        }
        Map map = new HashMap();
        map.put("pageNo",(pager.getPageNo()-1)*pager.getPageSize());
        map.put("pageSize",pager.getPageSize());
        List<Product> productList = productService.getProducts(map);
        modelAndView.addObject("productList",productList);
        modelAndView.addObject("pager",pager);
        modelAndView.setViewName("index");
        return modelAndView;
    }

    /**
     * 去删除
     * @param modelAndView
     * @param id
     * @return
     */
    @RequestMapping("/del")
    public ModelAndView del(ModelAndView modelAndView,Integer id){
        int isDel = productService.del(id);
        if (isDel>0){
            modelAndView.setViewName("redirect:/index?isDel=yes");
        }else{
            modelAndView.setViewName("redirect:/index?isDel=no");
        }
        return modelAndView;
    }


    /**
     * 去新增
     * @param modelAndView
     * @return
     */
    @RequestMapping("/toInsert")
    public ModelAndView toAdd(ModelAndView modelAndView){
        List<Catagory> catagoryList  = catagoryService.getCatagorys();
        modelAndView.addObject("catagoryList",catagoryList);
        modelAndView.setViewName("insert");
        return modelAndView;
    }

    /**
     * 新增
     * @param modelAndView
     * @param product
     * @return
     */
    @RequestMapping("/insert")
    public ModelAndView add(ModelAndView modelAndView,Product product){
        int isAdd = productService.add(product);
        if (isAdd>0){
            modelAndView.setViewName("redirect:/index?isAdd=yes");
        }else{
            modelAndView.setViewName("redirect:/index?isAdd=no");
        }
        return modelAndView;
    }
}

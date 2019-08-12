package com.MustLearnSSM.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: xiaozhe
 * @Date: 2019/8/9 16:37
 * 商品管理控制层
 */

@Controller
public class ProductController {
    
    @RequestMapping("product_list")
    public String listProduct(){
        return "product_list";
    }
}

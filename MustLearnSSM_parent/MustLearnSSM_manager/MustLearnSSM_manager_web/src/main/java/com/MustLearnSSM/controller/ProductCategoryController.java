package com.MustLearnSSM.controller;

import com.MustLearnSSM.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.EasyUiTree;
import pojo.ResponseJsonResult;

import java.util.List;

/**
 * @Author: xiaozhe
 * @Date: 2019/8/11 13:12
 * 商品分类控制器
 */

@Controller
@RequestMapping("/product_category")
public class ProductCategoryController {

    @Autowired
    ProductCategoryService productCategoryService;

    /**
     * 根据parentid返回数据列表
     */
    @RequestMapping("/list")
    @ResponseBody
    public List<EasyUiTree> getProductCategoryByParentId(@RequestParam(value = "id", defaultValue = "0") Short
                                                                 parentId) {
        List<EasyUiTree> easyUiTrees = productCategoryService.findProductCategoryListByParentId(parentId);
        return easyUiTrees;
    }



    /**
     * 添加分类
     */
    @RequestMapping("/add")
    @ResponseBody
    public ResponseJsonResult addCategory(Short parentId,String name){
        ResponseJsonResult responseJsonResult=productCategoryService.addCategory(parentId,name);
        return responseJsonResult;
    }


    /**
     * 删除分类
     */
    @RequestMapping("/del")
    @ResponseBody
    public ResponseJsonResult delCategory(Short parentId,Short id){
        ResponseJsonResult responseJsonResult=productCategoryService.deleteCategory(parentId,id);
        return responseJsonResult;
    }

}

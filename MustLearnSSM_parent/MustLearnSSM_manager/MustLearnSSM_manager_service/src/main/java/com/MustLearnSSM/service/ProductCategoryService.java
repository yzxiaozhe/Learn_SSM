package com.MustLearnSSM.service;

import pojo.EasyUiTree;
import pojo.ResponseJsonResult;

import java.util.List;

/**
 * @Author: xiaozhe
 * @Date: 2019/8/11 13:17
 */
public interface ProductCategoryService {
    
    List<EasyUiTree> findProductCategoryListByParentId(Short parentid);
    
    ResponseJsonResult addCategory(Short parentid,String name);
    
    ResponseJsonResult deleteCategory(Short parentid,Short id);
}

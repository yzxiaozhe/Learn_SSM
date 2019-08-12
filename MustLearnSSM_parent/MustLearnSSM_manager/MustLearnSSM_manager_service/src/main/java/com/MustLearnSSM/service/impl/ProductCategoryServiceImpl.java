package com.MustLearnSSM.service.impl;

import com.MustLearnSSM.mapper.ProductCategoryMapper;
import com.MustLearnSSM.pojo.ProductCategory;
import com.MustLearnSSM.pojo.ProductCategoryExample;
import com.MustLearnSSM.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.EasyUiTree;
import pojo.ResponseJsonResult;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xiaozhe
 * @Date: 2019/8/11 13:20
 */


@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {

    @Autowired
    private ProductCategoryMapper productCategoryMapper;

    @Override
    public List<EasyUiTree> findProductCategoryListByParentId(Short parentid) {

        ProductCategoryExample productCategoryExample = new ProductCategoryExample();
        ProductCategoryExample.Criteria criteria = productCategoryExample.createCriteria();
        criteria.andParentIdEqualTo(parentid);
        List<ProductCategory> productCategoryList = productCategoryMapper.selectByExample(productCategoryExample);

        List<EasyUiTree> easyUITrees = new ArrayList<>(productCategoryList.size());

        for (ProductCategory productCategory:productCategoryList) {

            EasyUiTree easyuiTree = new EasyUiTree();

            easyuiTree.setId(productCategory.getId());
            easyuiTree.setText(productCategory.getName());
            easyuiTree.setState(productCategory.getParentId()==0?"closed":"open");
            easyuiTree.setAttributes(productCategory.getParentId()+"");

            easyUITrees.add(easyuiTree);
        }

        return easyUITrees;
    }

    @Override
    public ResponseJsonResult addCategory(Short parentid, String name) {
        
        ProductCategory productCategory =new ProductCategory();
        productCategory.setParentId(parentid);
        productCategory.setName(name);
        
        productCategoryMapper.insert(productCategory);
        
        ResponseJsonResult responseJsonResult=new ResponseJsonResult();
        responseJsonResult.setMsg(productCategory.getId()+"");
        
        return responseJsonResult;
    }

    @Override
    public ResponseJsonResult deleteCategory(Short parentid, Short id) {

        ProductCategoryExample productCategoryExample = new ProductCategoryExample();
        ProductCategoryExample.Criteria criteria = productCategoryExample.createCriteria();

        if(parentid == 0){
            criteria.andIdEqualTo(id);
            ProductCategoryExample.Criteria criteria1 = productCategoryExample.createCriteria();
            criteria1.andParentIdEqualTo(id);
            productCategoryExample.or(criteria1);
        }else{
            criteria.andIdEqualTo(id);
        }

        productCategoryMapper.deleteByExample(productCategoryExample);

        ResponseJsonResult responseJsonResult = new ResponseJsonResult();
        responseJsonResult.setStatus(200);
        responseJsonResult.setMsg("success");

        return responseJsonResult;
    }

}
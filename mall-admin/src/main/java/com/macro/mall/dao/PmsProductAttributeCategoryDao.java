package com.macro.mall.dao;

import com.macro.mall.dto.PmsProductAttributeCategoryItem;

import java.util.List;

/**
 * 自定义商品属性分类Dao
 * Created by qx on 2024/4/23.
 */
public interface PmsProductAttributeCategoryDao {
    /**
     * 获取包含属性的商品属性分类
     */
    List<PmsProductAttributeCategoryItem> getListWithAttr();
}

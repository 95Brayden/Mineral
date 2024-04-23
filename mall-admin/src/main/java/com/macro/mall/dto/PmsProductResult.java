package com.macro.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 查询单个产品进行修改时返回的结果
 * Created by qx on 2024/4/23.
 */
public class PmsProductResult extends PmsProductParam {
    @Getter
    @Setter
    @ApiModelProperty("商品所选分类的父id")
    private Long cateParentId;
}

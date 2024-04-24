package com.macro.mall.portal.domain;

import com.macro.mall.model.OmsOrder;
import com.macro.mall.model.OmsOrderItem;

import java.util.List;

/**
 * 包含订单商品信息的订单详情
 * Created by mxh on 2024/4/24.
 */
public class OmsOrderDetail extends OmsOrder {
    private List<OmsOrderItem> orderItemList;

    public List<OmsOrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(List<OmsOrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }
}
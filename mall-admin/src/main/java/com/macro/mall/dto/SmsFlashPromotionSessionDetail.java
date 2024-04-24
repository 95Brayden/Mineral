package com.macro.mall.dto;

import com.macro.mall.model.SmsFlashPromotionSession;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 包含商品数量的场次信息
 * Created by qx on 2024/4/24.
 */
public class SmsFlashPromotionSessionDetail extends SmsFlashPromotionSession {
    @Setter
    @Getter
    @ApiModelProperty("商品数量")
    private Long productCount;
}

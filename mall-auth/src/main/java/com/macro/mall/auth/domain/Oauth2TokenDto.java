package com.macro.mall.auth.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Oauth2获取Token返回信息封装
 * Created by mxh on 2024/4/22.
 */

@Data
@EqualsAndHashCode(callSuper = false)
@Builder
public class Oauth2TokenDto {
    /**
     * EqualsAndHashCode会调用父类的equals()和hashCode()方法，
     * 但在这里设置为false，表示只考虑当前类的字段。
     * Builder 建造者模式
     * ApiModelProperty Swagger生成API文档 中间是描述
     */
    @ApiModelProperty("访问令牌")
    private String token;
    @ApiModelProperty("刷令牌")
    private String refreshToken;
    @ApiModelProperty("访问令牌头前缀")
    private String tokenHead;
    @ApiModelProperty("有效时间（秒）")
    private int expiresIn;
}

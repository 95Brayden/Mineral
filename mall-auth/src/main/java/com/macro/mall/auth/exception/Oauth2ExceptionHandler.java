package com.macro.mall.auth.exception;

import com.macro.mall.common.api.CommonResult;
import org.springframework.security.oauth2.common.exceptions.OAuth2Exception;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 全局处理Oauth2抛出的异常
 * Created by mxh on 2024/4/23.
 */

@ControllerAdvice
public class Oauth2ExceptionHandler {
    /**
     * @ControllerAdvice 是 Spring MVC 提供的一个注解，用于全局处理控制器
     */
    @ResponseBody
    @ExceptionHandler(value = OAuth2Exception.class)
    public CommonResult handleOauth2(OAuth2Exception e) {
        return CommonResult.failed(e.getMessage());
    }
}

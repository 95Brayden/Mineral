package com.macro.mall.common.api;

/**
 * 封装API的错误码
 *
 * @author mxh
 * @date 2024/4/22
 */
public interface IErrorCode {
    long getCode();

    String getMessage();
}
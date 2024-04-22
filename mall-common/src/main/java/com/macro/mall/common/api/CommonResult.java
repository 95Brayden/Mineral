package com.macro.mall.common.api;

/**
 * 通用返回对象
 * Created by mxh on 2024/4/22.
 */
public class CommonResult<T> {
    private long code;
    private String message;
    private T data;
    protected CommonResult() {
    }

    protected CommonResult(long code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
    /**
     * 成功返回结果
     *
     * @param data 获取的数据
     */
    public static <T> CommonResult<T> success(T data) {
        return new CommonResult<T>(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMessage(), data);
    }
}

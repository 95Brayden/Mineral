package com.macro.mall.component;

import cn.hutool.json.JSONUtil;
import com.macro.mall.common.api.CommonResult;
import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.server.ServerAuthenticationEntryPoint;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.nio.charset.Charset;

/**
 * 自定义未登录或者token失效时的返回结果
 * Created by macro on 2020/6/18.
 */
@Component
public class RestAuthenticationEntryPoint  {

}

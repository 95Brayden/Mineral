package com.macro.mall.auth.service;

import com.macro.mall.common.domain.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 后台用户服务远程调用Service
 * Created by mxh on 2024/4/23.
 */

@FeignClient("mall-admin")
public interface UmsAdminService {
    /**
     *声明 HTTP 客户端: 通过 @FeignClient 注解，你可以声明一个或多个 Feign 客户端，用于调用远程服务。
     * 服务发现与负载均衡: 当你使用服务发现（如 Eureka）和负载均衡器（如 Ribbon）时，Feign 可以自动为你的 Feign 客户端提供负载均衡的能力。
     * 集成 Spring Cloud: Feign 与 Spring Cloud 集成得非常好，可以轻松地与其他 Spring Cloud 组件（如 Eureka、Ribbon、Hystrix 等）一起使用。
     */
    @GetMapping("/admin/loadByUsername")
    UserDto loadUserByUsername(@RequestParam String username);
}

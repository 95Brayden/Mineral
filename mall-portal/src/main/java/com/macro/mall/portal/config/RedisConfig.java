package com.macro.mall.portal.config;

import com.macro.mall.common.config.BaseRedisConfig;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;

/**
 * Redis相关配置
 * Created by mxh on 2024/4/24.
 */
@EnableCaching
@Configuration
public class RedisConfig extends BaseRedisConfig {

}

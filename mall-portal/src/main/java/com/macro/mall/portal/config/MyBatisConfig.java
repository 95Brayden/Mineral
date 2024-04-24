package com.macro.mall.portal.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * MyBatis相关配置
 * Created by mxh on 2024/4/24.
 */
@Configuration
@EnableTransactionManagement
@MapperScan({"com.macro.mall.mapper","com.macro.mall.portal.dao"})
public class MyBatisConfig {
}

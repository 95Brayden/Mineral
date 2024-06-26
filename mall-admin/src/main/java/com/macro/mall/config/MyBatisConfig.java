package com.macro.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * MyBatis相关配置
 * Created by qx on 2024/5/6.
 */
@Configuration
@EnableTransactionManagement
@MapperScan({"com.macro.mall.mapper","com.macro.mall.dao"})
public class MyBatisConfig {

}

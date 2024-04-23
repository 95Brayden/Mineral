package com.macro.mall.auth.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * SpringSecurity相关配置
 * Created by mxh on 2024/4/23.
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig{

    /**
     *它用于启用 Web 安全性功能
     * 启用 Spring Security: 启用 Spring Security 的所有功能，包括身份验证、授权、攻击防护等。
     * 自定义安全配置: 允许你在配置类中自定义安全规则、用户认证、授权等行为。
     * 提供默认的安全配置: 如果你不提供任何自定义的安全配置，Spring Security 会提供一组默认的安全规则和行为。
     */
    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception {
        return authenticationConfiguration.getAuthenticationManager();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }


}

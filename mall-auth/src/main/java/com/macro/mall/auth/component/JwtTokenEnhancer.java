package com.macro.mall.auth.component;

import com.macro.mall.auth.domain.SecurityUser;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * JWT内容增强器
 * Created by mxh on 2024/4/22.
 */

public class JwtTokenEnhancer implements TokenEnhancer {
    @Override
    public  OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication){
        SecurityUser securityUser =(SecurityUser) authentication.getPrincipal();
        Map<String,Object> info =new HashMap<>();
        //设置用户ID->jwt中
        info.put("id",securityUser.getId());
        info.put("client_id",securityUser.get)
    }
}

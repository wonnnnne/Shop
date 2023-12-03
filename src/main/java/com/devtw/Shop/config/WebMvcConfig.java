package com.devtw.Shop.config;

import com.devtw.Shop.interceptor.LoginInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Autowired
    private LoginInterceptor loginInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 로그인 인터셉터를 등록하고 적용할 URL 패턴 설정
        registry.addInterceptor(loginInterceptor)
                .addPathPatterns("/secure/**") // 보안이 필요한 URL 패턴 설정
                .excludePathPatterns("/login", "/logout"); // 제외할 URL 패턴 설정
    }
}

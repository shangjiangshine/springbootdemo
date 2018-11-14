package com.shineyoung.configuration;

import com.shineyoung.interceptor.LoggerInterceptor;
import com.shineyoung.interceptor.SessionInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by ShineYoung on 2018/11/14.
 */
@Configuration
public class CommonConfiguration extends WebMvcConfigurerAdapter{
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 将SessionInterceptor拦截器添加到我们的SpringBoot项目内，让SpringBoot项目可以识别拦截
        registry.addInterceptor(new SessionInterceptor()).addPathPatterns("/**");
        // 将LoggerInterceptor拦截器添加到我们的SpringBoot项目内，让SpringBoot项目可以识别拦截
        registry.addInterceptor(new LoggerInterceptor()).addPathPatterns("/**");
    }

    // 自定义静态资源文件路径
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/demo/static/**").addResourceLocations("classpath:/static/");
    }


}

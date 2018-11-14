package com.shineyoung.configuration;

import com.shineyoung.servlet.TestServlet;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by dell on 2018/11/14.
 */
@Configuration
// servlet组件扫面如果不配置basePackages默认扫描配置类当前所在包及子包下的servlet
@ServletComponentScan(basePackages = "com.shineyoung.servlet")
public class ServletConfiguration {

/*    @Bean
    public ServletRegistrationBean servletRegistrationBean() {
        return new ServletRegistrationBean(new TestServlet(), "/test");
    }*/
}

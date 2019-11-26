package com.kgc.springmvc.app;

import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.*;

import java.util.List;

@Configuration
@ComponentScan("com.kgc.springmvc.controller")
@EnableWebMvc
public class Appconfig implements WebMvcConfigurer {

    //添加json转换 管理器 将FastJson组件添加

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> list) {
        list.add(new FastJsonHttpMessageConverter());
    }


}

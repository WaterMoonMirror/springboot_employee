package com.wondersgroup.employee.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//使用WebMvcConfigurerAdapter可以来扩展SpringMVC的功能  (WebMvcConfigurerAdapter被废弃，jdk8可以有默认的方法，就不在需要适配器)
//@EnableWebMvc   不要接管SpringMVC
@Configuration
public class MyMvcConfig  implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("login");
        registry.addViewController("/login.html").setViewName("login");
        registry.addViewController("/main.html").setViewName("dashboard");
    }


}

package com.zhuheng.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan({"com.zhuheng.controller","com.zhuheng.config"})
@EnableWebMvc
public class SpringMvcConfig {
}

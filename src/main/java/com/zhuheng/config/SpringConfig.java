package com.zhuheng.config;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.zhuheng.service")
@PropertySource("classpath:jdbc.properties")
@Import({JdbcConfig.class,MyBatisConfig.class})
public class SpringConfig {
}

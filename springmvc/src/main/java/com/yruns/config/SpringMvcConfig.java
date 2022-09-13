package com.yruns.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * SpringMvcConfig
 */
@Configuration
@EnableWebMvc       // 开启Json转换为Java数据功能
@ComponentScan("com.yruns.controller")
public class SpringMvcConfig {
}

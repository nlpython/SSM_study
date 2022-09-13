package com.yruns.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * SpringMvcConfig
 */
@Configuration
@ComponentScan({"com.yruns.controller", "com.yruns.config"})
@EnableWebMvc
public class SpringMvcConfig{
}

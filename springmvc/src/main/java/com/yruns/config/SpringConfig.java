package com.yruns.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * SpringConfig
 */
@Configuration
@ComponentScan({"com.yruns.dao", "com.yruns.service"})
public class SpringConfig {
}


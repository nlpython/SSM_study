package com.yruns.config;

/**
 * SpringConfig
 */

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("com.yruns")
@EnableAspectJAutoProxy
public class SpringConfig {
}

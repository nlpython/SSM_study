package com.yruns.config;

import org.springframework.context.annotation.*;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * SpringConfig
 */
@Configuration
@ComponentScan("com.yruns")
@PropertySource("classpath:jdbc.properties")
@Import({JdbcConfig.class, Mybatis.class})
@EnableAspectJAutoProxy
@EnableTransactionManagement
public class SpringConfig {
}

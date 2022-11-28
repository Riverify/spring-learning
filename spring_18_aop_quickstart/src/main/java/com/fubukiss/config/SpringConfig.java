package com.fubukiss.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.fubukiss")
//开启注解开发AOP功能
@EnableAspectJAutoProxy
public class SpringConfig {
}

package com.fubukiss.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.fubukiss")
@EnableAspectJAutoProxy
public class SpringConfig {
}

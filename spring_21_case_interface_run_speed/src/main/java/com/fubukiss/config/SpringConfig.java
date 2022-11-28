package com.fubukiss.config;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.fubukiss")
@PropertySource("classpath:jdbc.properties")
@Import({JdbcConfig.class, MybatisConfig.class})
@EnableAspectJAutoProxy
public class SpringConfig {
}

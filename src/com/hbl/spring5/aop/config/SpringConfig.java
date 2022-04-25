package com.hbl.spring5.aop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration //作为配置类，替代XNL
@ComponentScan(basePackages = "com.hbl.spring5.aop")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class SpringConfig {
}

package com.hbl.spring5.ioc.BeanBaseOnAnnotation.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //作为配置类，替代XNL
@ComponentScan(basePackages = "com.hbl.spring5.ioc.BeanBaseOnAnnotation")
public class SpringConfig{
}

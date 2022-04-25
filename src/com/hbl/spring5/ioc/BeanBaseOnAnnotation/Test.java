package com.hbl.spring5.ioc.BeanBaseOnAnnotation;

import com.hbl.spring5.ioc.BeanBaseOnAnnotation.config.SpringConfig;
import com.hbl.spring5.ioc.BeanBaseOnAnnotation.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    @org.junit.Test
    public void testService(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Annotation.xml");
        UserService userService = context.getBean("userService",UserService.class);
        System.out.println(userService);
        userService.add();
    }

    @org.junit.Test
    public void testConfigureClass(){
        //加载配置类
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = context.getBean("userService",UserService.class);
        System.out.println(userService);
        userService.add();
    }
}

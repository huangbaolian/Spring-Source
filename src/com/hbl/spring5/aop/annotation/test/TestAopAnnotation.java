package com.hbl.spring5.aop.annotation.test;

import com.hbl.spring5.aop.annotation.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAopAnnotation {

    @Test
    public void testAnnotation(){
        ApplicationContext context = new ClassPathXmlApplicationContext("aopAnnotation.xml");
        User user = context.getBean("user",User.class);
        user.add();
    }
}

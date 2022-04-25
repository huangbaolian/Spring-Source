package com.hbl.spring5.ioc.BeanBaseOnXML.setBaseProperty.testDemo;

import com.hbl.spring5.ioc.BeanBaseOnXML.setBaseProperty.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {
    @Test
    public void  testservice(){
        //1.加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        //2.获取配置创建的对
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }
}

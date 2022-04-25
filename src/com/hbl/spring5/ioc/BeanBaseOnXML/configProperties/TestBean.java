package com.hbl.spring5.ioc.BeanBaseOnXML.configProperties;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {
    @Test
    public void  testProp(){
        //1.加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("ConfigProperties.xml");
        //2.获取配置创建的对象
        ConfigProperties prop = context.getBean("prop", ConfigProperties.class);
        System.out.println(prop);

    }
}

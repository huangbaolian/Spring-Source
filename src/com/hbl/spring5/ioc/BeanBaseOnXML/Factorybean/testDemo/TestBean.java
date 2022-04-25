package com.hbl.spring5.ioc.BeanBaseOnXML.Factorybean.testDemo;

import com.hbl.spring5.ioc.BeanBaseOnXML.setColletionType.Course;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {
    @Test
    public void  testFactBean(){
        //1.加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("FactoryBean.xml");
        //2.获取配置创建的对
        Course myBean = context.getBean("myBean", Course.class);
        System.out.println(myBean);
    }
}

package com.hbl.spring5.ioc.BeanBaseOnXML.autoWire.testDemo;

import com.hbl.spring5.ioc.BeanBaseOnXML.autoWire.Emp;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {
    @Test
    public void  testAutoBean(){
        //1.加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("AutoWireBean.xml");
        //2.获取配置创建的对象
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);

    }
}

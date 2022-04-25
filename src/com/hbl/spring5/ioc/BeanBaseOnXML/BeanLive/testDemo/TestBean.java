package com.hbl.spring5.ioc.BeanBaseOnXML.BeanLive.testDemo;

import com.hbl.spring5.ioc.BeanBaseOnXML.BeanLive.Orders;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {
    @Test
    public void  testLiveBean(){
        //1.加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("LiveBean.xml");
        //2.获取配置创建的对象
        Orders orders = context.getBean("orders", Orders.class);
        System.out.println("(4).bean可以使用了（对象获取到了）");
        System.out.println(orders);

        //手动销毁
        ((ClassPathXmlApplicationContext)context).close();
    }
}

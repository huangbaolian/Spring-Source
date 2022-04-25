package com.hbl.spring5.ioc.BeanBaseOnXML.setColletionType.testDemo;

import com.hbl.spring5.ioc.BeanBaseOnXML.setColletionType.Book;
import com.hbl.spring5.ioc.BeanBaseOnXML.setColletionType.Stu;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {
    @Test
    public void  testStu(){
        //1.加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("CollectionTypeBean.xml");
        //2.获取配置创建的对
        Stu stu = context.getBean("stu", Stu.class);
        stu.test();
    }

    @Test
    public void  testBookCom(){
        //1.加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("CollectionTypeBeanCom.xml");
        //2.获取配置创建的对
        Book book = context.getBean("book", Book.class);
        book.test();
    }
}

package com.hbl.spring5.aop.xml.test;

import com.hbl.spring5.aop.annotation.User;
import com.hbl.spring5.aop.xml.Book;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAopXml {

    @Test
    public void testxml(){
        ApplicationContext context = new ClassPathXmlApplicationContext("aopXml.xml");
        Book book = context.getBean("book", Book.class);
        book.buy();
    }
}

package com.hbl.spring5.transaction;

import com.hbl.spring5.jdbc.entity.User;
import com.hbl.spring5.jdbc.service.UserService;
import com.hbl.spring5.transaction.config.SpringConfig;
import com.hbl.spring5.transaction.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    @org.junit.Test
    public void testTransactionAccountMoney(){
        ApplicationContext context = new ClassPathXmlApplicationContext("transactionConfig.xml");
        AccountService accountService = context.getBean("accountService", AccountService.class);
        accountService.accountMoney();
    }

    @org.junit.Test
    public void testTransactionXML(){
        ApplicationContext context = new ClassPathXmlApplicationContext("transactionConfigXML.xml");
        AccountService accountService = context.getBean("accountService", AccountService.class);
        accountService.accountMoney();
    }

    @org.junit.Test
    public void testTransactionBySpringConfig(){
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountService accountService = context.getBean("accountService", AccountService.class);
        accountService.accountMoney();
    }


}

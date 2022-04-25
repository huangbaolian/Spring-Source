package com.hbl.spring5.jdbc;

import com.hbl.spring5.jdbc.entity.User;
import com.hbl.spring5.jdbc.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class Test {

    @org.junit.Test
    public void testJdbcAdd(){
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbcConfig.xml");
        UserService userService = context.getBean("userService", UserService.class);
        User user = new User();
        user.setUserId(2);
        user.setUserName("abc00");
        user.setPassword("wer");
        userService.addUser(user);
    }

    @org.junit.Test
    public void testJdbcupdate(){
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbcConfig.xml");
        UserService userService = context.getBean("userService", UserService.class);
        User user = new User();
        user.setUserId(2);
        user.setUserName("cccc");
        userService.updateUser(user);
    }

    @org.junit.Test
    public void testJdbcDelete(){
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbcConfig.xml");
        UserService userService = context.getBean("userService", UserService.class);
        User user = new User();
        user.setUserId(2);
        userService.deleteUser(user);
    }

    @org.junit.Test
    public void testJdbcFindCount(){
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbcConfig.xml");
        UserService userService = context.getBean("userService", UserService.class);
        int count = userService.findCount();
        System.out.println(count);
    }

    @org.junit.Test
    public void testJdbcFindUser(){
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbcConfig.xml");
        UserService userService = context.getBean("userService", UserService.class);
        User user = userService.findUserInfo(1);
        System.out.println(user.toString());
    }

    @org.junit.Test
    public void testJdbcFindUsers(){
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbcConfig.xml");
        UserService userService = context.getBean("userService", UserService.class);
        List<User> user = userService.findUsers();
        System.out.println(user);
    }

    @org.junit.Test
    public void testJdbcbatchAdd(){
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbcConfig.xml");
        UserService userService = context.getBean("userService", UserService.class);
        List<Object[]> batchArgs = new ArrayList<>();
        Object[] u1 = {7,"123","asd"};
        Object[] u2 = {8,"456","ssss"};
        Object[] u3 = {9,"789","cccc"};
        batchArgs.add(u1);
        batchArgs.add(u2);
        batchArgs.add(u3);
        userService.batchAdd(batchArgs);
    }
    @org.junit.Test
    public void testJdbcbatchUpdate(){
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbcConfig.xml");
        UserService userService = context.getBean("userService", UserService.class);
        List<Object[]> batchArgs = new ArrayList<>();
        Object[] u1 = {"111",7};
        Object[] u2 = {"222",8};
        Object[] u3 = {"333",9};
        batchArgs.add(u1);
        batchArgs.add(u2);
        batchArgs.add(u3);
        userService.batchUpdate(batchArgs);
    }
    @org.junit.Test
    public void testJdbcbatchDelete(){
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbcConfig.xml");
        UserService userService = context.getBean("userService", UserService.class);
        List<Object[]> batchArgs = new ArrayList<>();
        Object[] u1 = {7};
        Object[] u2 = {8};
        Object[] u3 = {9};
        batchArgs.add(u1);
        batchArgs.add(u2);
        batchArgs.add(u3);
        userService.batchDelete(batchArgs);
    }
}

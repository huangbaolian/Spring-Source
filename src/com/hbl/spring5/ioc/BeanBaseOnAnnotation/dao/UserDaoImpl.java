package com.hbl.spring5.ioc.BeanBaseOnAnnotation.dao;

import org.springframework.stereotype.Repository;

@Repository(value = "userDaoForQualifier")
public class UserDaoImpl implements UserDao{
    @Override
    public void add() {
        System.out.println("add dao");
    }
}

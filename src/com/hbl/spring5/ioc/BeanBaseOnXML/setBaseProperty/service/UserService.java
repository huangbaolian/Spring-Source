package com.hbl.spring5.ioc.BeanBaseOnXML.setBaseProperty.service;

import com.hbl.spring5.ioc.BeanBaseOnXML.setBaseProperty.dao.UserDao;

public class UserService {
    //创建USerDao类型属性，生成Set方法
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add(){
        System.out.println("service add +++++");
        //原始方式：创建UserDao对象
        /*UserDao userDao  = new UserDaoImpl();
        userDao.update();*/
        //
        userDao.update();
    }
}

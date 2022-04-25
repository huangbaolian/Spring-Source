package com.hbl.spring5.ioc.BeanBaseOnAnnotation.service;

import com.hbl.spring5.ioc.BeanBaseOnAnnotation.dao.UserDao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

//在注解里面value属性值可以省略不写
//默认值是类名称首字母小写
//@Component
@Service(value = "userService")
public class UserService {

    /*//定义Dao类型属性
    //不需要set方法
    //添加注入属性注解
    @Autowired  //根据类型进行注入
    @Qualifier(value = "userDaoForQualifier") //如果一个接口有多个实现类时，仅仅使用 @Autowired进行注入，找不到应该使用哪个实现类
    private UserDao userDao;*/

    // @Resource //根据类型注入
    @Resource(name = "userDaoForQualifier") //根据名称注入
    private UserDao userDao;
    @Value(value = "abc")
    private String name;

    public void add(){
        System.out.println("service add .. +"+name);
        userDao.add();
    }
}

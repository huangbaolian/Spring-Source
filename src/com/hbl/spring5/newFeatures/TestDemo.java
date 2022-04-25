package com.hbl.spring5.newFeatures;


import com.hbl.spring5.newFeatures.NullableAndFunc.User;
import org.junit.Test;
import org.springframework.context.support.GenericApplicationContext;

public class TestDemo {

    /*函数式风格创建对象，交给spring进行管理*/
    @Test
    public void GenericApplicationContext(){
        /*创建GenericApplicationContext对象*/
        GenericApplicationContext context = new GenericApplicationContext();
        /*调用context的方法对象注册*/
        context.refresh();
        context.registerBean("user",User.class,() -> new User());
        /*获取在Spring注册的对象*/
        /*User user = (User) context.getBean("com.hbl.spring5.newFeatures.NullableAndFunc.User");*/
        User user = (User) context.getBean("user");
        System.out.println(user);
    }
}

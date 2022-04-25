package com.hbl.spring5.aop.annotation;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class PersonProxy {
    //后置通知
    @Before(value="execution(* com.hbl.spring5.aop.annotation.User.add(..))")
    public void before(){
        System.out.println("Person before....");
    }

}

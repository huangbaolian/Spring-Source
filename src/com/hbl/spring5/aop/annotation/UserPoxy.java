package com.hbl.spring5.aop.annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//增强类
@Component
@Aspect
@Order(3)
public class UserPoxy {
    //相同切入点抽取
    @Pointcut(value = "execution(* com.hbl.spring5.aop.annotation.User.add(..))")
    public void pointDemo(){

    }
    //前置通知
    @Before(value="pointDemo()")
    public void before(){
        System.out.println("before....");
    }


    //后置通知
    @After(value="execution(* com.hbl.spring5.aop.annotation.User.add(..))")
    public void after(){
        System.out.println("after....");
    }

    //前置通知
    @AfterReturning(value="execution(* com.hbl.spring5.aop.annotation.User.add(..))")
    public void afterReturning(){
        System.out.println("afterReturning....");
    }

    @AfterThrowing(value="execution(* com.hbl.spring5.aop.annotation.User.add(..))")
    public void afterThrowing(){
        System.out.println("afterThrowing....");
    }

    @Around(value="execution(* com.hbl.spring5.aop.annotation.User.add(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕之前....");
        //被增强的方法执行
        proceedingJoinPoint.proceed();
        System.out.println("环绕之后....");
    }

}

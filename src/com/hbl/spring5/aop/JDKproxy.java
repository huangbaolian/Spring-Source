package com.hbl.spring5.aop;

import com.hbl.spring5.ioc.BeanBaseOnXML.setBaseProperty.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class JDKproxy {
    public static void main(String[] args) {
        //创建接口实现类的代理对象
        Class[] interfaces = {UserDao.class};
        /*Proxy.newProxyInstance(JDKproxy.class.getClassLoader(), interfaces, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                return null;
            }
        });*/

        UserDaoImpl userDao = new UserDaoImpl();
        UserDao dao = (UserDao) Proxy.newProxyInstance(JDKproxy.class.getClassLoader(), interfaces, new UserDaoProxy(userDao));
        int result = dao.add(1,2);
        System.out.println(result);
    }
}

//创建代理对象代码
class UserDaoProxy implements InvocationHandler{
    //1.把创建的是谁的代理对象，就需要把谁传递过来
      //有参构造传递
    private Object obj;
    public UserDaoProxy(Object obj){
        this.obj=obj;
    }

    //增强的逻辑
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //方法之前
        System.out.println("方法之前...."+method.getName() +"； 传递的参数："+ Arrays.toString(args));

        //被增强的方法执行
        Object res = method.invoke(obj,args);
        //方法之后
        System.out.println("方法之后....."+obj);
        return res;
    }
}

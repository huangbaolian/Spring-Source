package com.hbl.spring5.ioc.BeanBaseOnXML.BeanLive;

public class Orders {
    //无参数构造
    public Orders(){
        System.out.println("(1).通过构造器创建Bean实例（无参构造）");
    }


    private String oname;

    public void setOname(String oname) {
        this.oname = oname;
        System.out.println("(2).为bean的属性设置值和对其他bean的引用（调用set方法）");
    }

    //创建执行初始化的方法
    public void initMethod(){
        System.out.println("(3).调用bean的初始化的方法(需要进行配置)");
    }

    //创建执行销毁的方法
    public void destroyMethod(){
        System.out.println("(5).当容器关闭的时候，调用bean的销毁方法（需要配置销毁的方法）");
    }
}

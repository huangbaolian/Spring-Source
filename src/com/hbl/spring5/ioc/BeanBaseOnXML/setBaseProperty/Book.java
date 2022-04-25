package com.hbl.spring5.ioc.BeanBaseOnXML.setBaseProperty;
/*
* 使用set方法进行注入属性
* */
public class Book {
    private String bname;
    private String bauther;

    //set方法注入
    public void setBname(String bname) {
       this.bname = bname;
    }

    public void setBauther(String bauther) {
        this.bauther = bauther;
    }
    public void testBook(){
        System.out.println(bname+">>>"+bauther);
    }
}

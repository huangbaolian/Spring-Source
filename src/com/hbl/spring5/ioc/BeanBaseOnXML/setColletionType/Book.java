package com.hbl.spring5.ioc.BeanBaseOnXML.setColletionType;

import java.util.List;

public class Book {
    private List<String> list;

    public void setList(List<String> list) {
        this.list = list;
    }

   public void test(){
       System.out.println(list);
   }
}

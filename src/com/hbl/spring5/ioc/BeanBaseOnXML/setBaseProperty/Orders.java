package com.hbl.spring5.ioc.BeanBaseOnXML.setBaseProperty;

/**
 * 使用有参构造注入
 */
public class Orders {
    private String oname;
    private String address;

    public Orders(String oname, String address) {
        this.oname = oname;
        this.address = address;
    }

    public void ordersTest(){
        System.out.println(oname+"   "+address);
    }
}

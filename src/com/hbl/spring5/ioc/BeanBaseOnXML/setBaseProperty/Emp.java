package com.hbl.spring5.ioc.BeanBaseOnXML.setBaseProperty;

public class Emp {
    private String ename;
    private String gender;
    //一个员工属于某个部门--对象类型的属性来表示
    private Dept dept;

    public Dept getDept() {
        return dept;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public void add(){
        System.out.println(ename+" "+gender+" "+dept);
    }
}

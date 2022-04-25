package com.hbl.spring5.ioc.BeanBaseOnXML.setColletionType;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Stu {
    //1.数组类型属性
    private String[] Courses;
    //2.list 集合类型属性
    private List<String> list;
    //3.map 集合类型属性
    private Map<String,String> maps;
    //4.set集合类型属性
    private Set<String> sets;

    //学生所学多门课程---在集合里面设置对象类型值
    private List<Course> courseList;

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setCourses(String[] courses) {
        Courses = courses;
    }

    public void test(){
        System.out.println(Arrays.toString(Courses));
        System.out.println(list);
        System.out.println(maps);
        System.out.println(sets);
        System.out.println(courseList);
    }
}

package com.softeem.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
//        spring控制反转，对象的创建可以由spring容器创建
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        Student student = (Student)context.getBean("student");
        student.setId(1);
        System.out.println(student.getId());
        System.out.println(student.getName());
    }
}

package com.softeem.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        ApplicationContext contenxt= new ClassPathXmlApplicationContext("app*.xml");
        People p = (People)contenxt.getBean("getPeople");
        System.out.println(p.getName());
        System.out.println(p.getSon());
        System.out.println(Arrays.toString(p.getAddress()));
        System.out.println(p.getIDCard());
        System.out.println(p.getMethod());
        System.out.println(p.getProp());
        System.out.println(p.getToday());
    }
}

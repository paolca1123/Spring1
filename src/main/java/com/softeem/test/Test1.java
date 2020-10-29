package com.softeem.test;

import com.softeem.autowire.People;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-3.xml");
        People people = context.getBean("people", People.class);
        System.out.println(people);
    }
}

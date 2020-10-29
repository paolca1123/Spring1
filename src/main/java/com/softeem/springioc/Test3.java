package com.softeem.springioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

//测试静态工厂bean
public class Test3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-*.xml");
        Dog dog = (Dog)context.getBean("getDog");
        dog.showInfo();

        Cat cat = (Cat)context.getBean("getCat");
        System.out.println(cat.getcName());
        cat.showInfo();
    }
}

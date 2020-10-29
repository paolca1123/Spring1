package com.softeem.springioc;

import com.sun.javafx.collections.MappingChange;

import java.util.Map;

public class Student {
    private int id;
    private String name;
    private Map map;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", map=" + map +
                '}';
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Student(){
        System.out.println("hello im student");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

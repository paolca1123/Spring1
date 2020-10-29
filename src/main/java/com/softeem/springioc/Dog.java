package com.softeem.springioc;

public class Dog implements Animal {
    private String dName;

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    @Override
    public void showInfo() {
        System.out.println("hello"+this.dName);
    }
}

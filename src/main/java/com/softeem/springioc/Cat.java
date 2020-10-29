package com.softeem.springioc;

public class Cat implements Animal {
    private String cName;

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    @Override
    public void showInfo() {
        System.out.println("我讨厌猫");
    }
}

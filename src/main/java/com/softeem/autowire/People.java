package com.softeem.autowire;

import lombok.Data;

public class People {
    private String pName;
    private Dog dog;

    @Override
    public String toString() {
        return "People{" +
                "pName='" + pName + '\'' +
                ", dog=" + dog +
                '}';
    }

    public People(Dog dog) {
        this.dog = dog;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
}

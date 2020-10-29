package com.softeem.springioc;

public class AnimalFactory {
    public static Animal getAnimal(String name){
        if(name.equals("cat")){
            return new Cat();
        }else if(name.equals("dog")){
            return new Dog();
        }
        return null;
    }

    public Animal getAnimal2(String name){
        if(name.equals("cat")){
            return new Cat();
        }else if(name.equals("dog")){
            return new Dog();
        }
        return null;
    }
}

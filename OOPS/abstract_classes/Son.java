package com.abstract_classes;

public class Son extends Parent{
    private final Object age;

    public Son(int age){
        this.age = age;
    }
    @Override
    public void career(){
        System.out.println("I want ot become a doctor");
    }
    @Override
    void partner(){
        System.out.println("I love iron man");
    }
}

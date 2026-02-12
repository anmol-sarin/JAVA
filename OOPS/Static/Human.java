package com.Static;

public class Human {
    int age;
    String name;
    int Salary;
    boolean married;
    static long population;
    public Human(int age, String name , int Salary , Boolean married){
        this.age = age;
        this.name = name;
        this.Salary = Salary;
        this.married = married;
        this.population += 1;
    }
}

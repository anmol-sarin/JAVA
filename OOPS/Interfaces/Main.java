package com.Interfaces;

public class Main implements Brake , engine {
    @Override
    public void brake(){
        System.out.println("I brake like a normal car");
    }

    @Override
    public void start(){

        System.out.println("I start like a normal car");
    }
    @Override
    public void end(){
        System.out.println("I stop like a normal car");

    }
    @Override
    public void acc(){
        System.out.println("I accelerates like a normal car");

    }
    public static void main(String[] args){
        Main car = new Main();
        car.brake();
    }
}

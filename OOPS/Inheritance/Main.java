package com.Inheritance;
import com.Inheritance.Inheritance.Box;
public class Main {
    public static void main(String [] args){
        Box obj = new Box(4.5);
        System.out.println("Box without inheritance : " + obj.l + " , " + obj.b + " , " + obj.h);
        Box1 obj2 = new Box1(3.4,5.6,7.8,2.3);
        System.out.println("Box with inheritance : " + obj2.l + " , " + obj2.b + " , " + obj2.h + " , " + obj2.w);
        Box2 obj3 = new Box2(3.4,5.6,7.8,2.3,4.8);
        System.out.println("Example of multilevel inheritance :" +obj3.l + " , "+obj3.b + " , "+obj3.h + " , "+obj3.w + " , "+obj3.v );

    }
    static class Box1 extends Box{
        double w;
        Box1(){
            this.w = -1;
        }
        Box1(double side){
            this.w = side;
        }
        Box1(double l,double b, double h, double w){
            super(l,b,h);
            this.w = w;
        }
    }
    static class Box2 extends Box1{
        double v;
        Box2(){
            this.v = -1;
        }
        Box2(double volume){
            this.v = volume;
        }
        Box2(double l, double b, double h, double w, double v){
            super(l,b,h,w);
            this.v = v;
        }
    }
}


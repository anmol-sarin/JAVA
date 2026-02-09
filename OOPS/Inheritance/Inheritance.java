package com.Inheritance;

public class Inheritance {
    static class Box{
        double l;
        double b;
        double h;
        Box(){
            this.l = -1;
            this.b = -1;
            this.h = -1;
        }
        Box(double side){
            this.l = side;
            this.b = side;
            this.h = side;
        }
        Box(double length, double breadth, double height){
            this.l = length;
            this.b = breadth;
            this.h = height;
        }
        Box(Box other){
            this.l = other.l;
            this.b = other.b;
            this.h = other.h;
        }

    }
}

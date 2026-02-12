package com.Static;

import java.sql.SQLOutput;

public class Static_Block {
    static int a = 4;
    static int b;
    static {
        System.out.println("I am in static block");
        b = a * 5;
    }
    public static void main(String[] args){
        Static_Block obj = new Static_Block();
        System.out.println(obj.a + " , " + obj.b);
    }
}

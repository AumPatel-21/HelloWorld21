package com.company;

public class Yummy {
    public static void main(String[] args) {
        System.out.println("hello");
        chocolate();
        ice_cream();
        System.out.println("goodbye");
    }
    public static void chocolate(){
        System.out.println("yummy chocolate");
    }
    public static void ice_cream() {
        System.out.println("Ice");
        chocolate();
        System.out.println("Cream");
    }
}

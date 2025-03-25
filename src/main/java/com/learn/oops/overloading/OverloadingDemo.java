package com.learn.oops.overloading;

public class OverloadingDemo {

    public static int sum(int a, int b){
        return a+b;
    }

    public static int sum(int a, int b, int c){
        return a+b+c;
    }

    public static double sum(double a, double b){
        return a+b;
    }

    public static double sum(int a, double b){
        return a+b;
    }

    public static double sum(double a, int b){
        return a+b;
    }

    public static void main(String[] args) {

        System.out.println(sum(5,4,6));
        System.out.println(sum(5,4.4));
        System.out.println(sum(5,4));

    }
}

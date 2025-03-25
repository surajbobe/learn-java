package com.learn.collection;

import java.util.Arrays;

public class LearnArraysClass {


    public static void main(String[] args) {

        int[] a = {1,2,4,5,6,78,89,10};

        //sort
        Arrays.sort(a);
        for(int i : a){
            System.out.print(i+",");
        }

        //index search only works on sorted array
        int index = Arrays.binarySearch(a,10);
        System.out.println(index);

        //Arrays.fill
        Arrays.fill(a, 5);
        for(int i : a){
            System.out.print(i+",");
        }

    }
}

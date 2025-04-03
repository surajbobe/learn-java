package com.learn.arrays;

public class FindPairsSumEqualNum {

    //Write a Java program to find all pairs of elements in an integer array whose sum is equal to a given number?

    public static void findThePairs(int[] arr, int sum){

        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] + arr[j] == sum){
                    System.out.println("Pair : "+arr[i]+", "+arr[j]);
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {

        findThePairs(new int[] {4, 6, 5, -10, 8, 5, 20}, 10);
    }
}

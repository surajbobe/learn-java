package com.learn.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class FindDuplicateNumbers {

    public static void usingBruteForce(int[] arr){

        System.out.println("+++++++++++++++Brute Force++++++++++++++++++++");
        for(int i = 0; i < arr.length ; i++){
            for(int j = i+1; j < arr.length ; j++){
                if(arr[i] == arr[j]) {
                    System.out.print("Duplicates : "+ arr[i]+", ");
                    break;
                }

            }
        }
        System.out.println();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");

    }

    public static void usingHashSet(int[] arr){

        System.out.println("+++++++++++++++ HashSet ++++++++++++++++++++");

        HashSet<Integer> hashSet = new HashSet<>();

        for(int i : arr){
            if( ! hashSet.add(i)){
                System.out.println("Duplicates : "+ i +", ");
            }
        }

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
    }

    public static void usingHashSetAndStream(int[] arr){

        System.out.println("+++++++++++++++ usingHashSetAndStream ++++++++++++++++++++");

        HashSet<Integer> hashSet = new HashSet<>();

        List<Integer> collect = Arrays.stream(arr).boxed().filter(i -> !hashSet.add(i)).collect(Collectors.toList());

        System.out.println("Duplicates : "+collect);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
    }

    public static void main(String[] args) {

        int [] arr = {111,222,333,111,333,566,53,22,564};

        usingBruteForce(arr);

        usingHashSet(arr);

        usingHashSetAndStream(arr);

    }
}

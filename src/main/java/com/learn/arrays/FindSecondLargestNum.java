package com.learn.arrays;

public class FindSecondLargestNum {

    public static int findSecondLargestNum(int[] arr){

        System.out.println("++++++++++++++findSecondLargestNum++++++++++++++");

        int l1,l2;

        if(arr[0] > arr[1]) {
            l1 = arr[0];
            l2 = arr[1];
        }else{
            l1 = arr[1];
            l2 = arr[0];
        }

        for(int i = 2 ; i < arr.length ; i++){

            if(arr[i] > l1){
                l2 = l1;
                l1 = arr[i];
            } else if (arr[i] < l1 && arr[i] > l2) {
                l2 = arr[i];
            }

        }

        System.out.println("Second largest number : "+l2);

        return l2;

    }

    public static void main(String[] args) {

        int[] arr = {2,4,1,3,6,3,8,6,8,4,5};

        findSecondLargestNum(arr);

    }
}

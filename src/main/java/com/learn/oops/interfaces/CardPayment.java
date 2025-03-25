package com.learn.oops.interfaces;

public interface CardPayment {

    //fields are by default static and final in interface
    public static final int amount = 1;

    public void deposit(int amount);

    public default void getCashback(){
        System.out.println("Cashback 1 rupees !");
    }

    public static void withdraw(int amount){
        System.out.println("Withdraw : "+amount);
    }
}

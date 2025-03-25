package com.learn.oops.abstracts;

public interface UPIPayment {

    //fields are by default static and final in interface
    public String amount = "UPI";

    public void deposit(int amount);

    public default void getCashback(){
        System.out.println("Cashback 1 rupees !");
    }

    public static void withdraw(int amount){
        System.out.println("Withdraw : "+amount);
    }

}

package com.learn.oops.abstracts;

public abstract class CardPayment {

    //fields are by default static and final in interface
    public String amount = "CardPayment";

    public abstract void deposit(int amount);

    public void getCashback(){
        System.out.println("Cashback 1 rupees !");
    }

    public void withdraw(int amount){
        System.out.println(" CardPayment Withdraw : "+amount);
    }
}

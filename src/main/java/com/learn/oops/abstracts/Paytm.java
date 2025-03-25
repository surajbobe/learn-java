package com.learn.oops.abstracts;

public class Paytm extends CardPayment implements UPIPayment{

    public String amount = "Paytm";

    @Override
    public void deposit(int amount) {
        System.out.println("Paytm deposit");
    }

    //When we have same method in both iterfaces we need to call one or give different implementation
    @Override
    public void getCashback() {
        //UPIPayment.super.getCashback();
        System.out.println("Get paytm chasback");
    }
}

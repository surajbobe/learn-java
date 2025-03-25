package com.learn.oops.interfaces;

public class Paytm implements UPIPayment, CardPayment{

    public int amount = 5;

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

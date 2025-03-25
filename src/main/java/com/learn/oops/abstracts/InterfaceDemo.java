package com.learn.oops.abstracts;

public class InterfaceDemo {

    public static void main(String[] args) {

        UPIPayment upiPayment = new Paytm();
        CardPayment cardPayment = new Paytm();
        Paytm paytm = new Paytm();

        System.out.println("--------------UPIPayment upiPayment = new Paytm();------------------");
        upiPayment.getCashback();
        upiPayment.deposit(3);
        //static method
        UPIPayment.withdraw(3);
        System.out.println(UPIPayment.amount);

        System.out.println("--------------CardPayment cardPayment = new Paytm();------------------");
        cardPayment.getCashback();
        cardPayment.deposit(3);
        //static method
        cardPayment.withdraw(3);
        System.out.println(cardPayment.amount);

        System.out.println("--------------Paytm paytm = new Paytm();------------------");
        paytm.getCashback();
        paytm.deposit(3);
        System.out.println(paytm.amount);

    }
}

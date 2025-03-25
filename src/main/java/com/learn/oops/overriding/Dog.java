package com.learn.oops.overriding;

public class Dog extends Animal{

    private String sound = "Bhav bhav !";
    public String name = "Dog";

    public void eats(){
        System.out.println("Eats something !");
    }

    public String getSound(){
        return sound;
    }

}

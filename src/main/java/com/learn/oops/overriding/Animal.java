package com.learn.oops.overriding;

public class Animal {

    private String sound = "Sum sound !";
    public String name = "Animal";

    public void eats(){
        System.out.println("Eats something !");
    }

    public String getSound(){
        return sound;
    }
}

package com.learn.oops.overriding;

public class OverridingDemo {

    public static void main(String[] args) {

        Animal animal = new Animal();
        Animal animal1 = new Dog();
        Dog dog = new Dog();

        System.out.println("---------------Animal animal = new Animal();----------------------");
        animal.eats();
        System.out.println(animal.getSound());
        System.out.println(animal.name);

        System.out.println("---------------Animal animal1 = new Dog();----------------------");
        animal1.eats();
        System.out.println(animal1.getSound());
        System.out.println(animal1.name);

        System.out.println("---------------Dog dog = new Dog();----------------------");
        dog.eats();
        System.out.println(dog.getSound());
        System.out.println(dog.name);
    }
}

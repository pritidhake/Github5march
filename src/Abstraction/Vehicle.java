package Abstraction;

public abstract class Vehicle {
    int wheels;
    abstract void start(); // does not have method body

    static void show(){         //Have method body
        System.out.println("In static method");
    }
    final void display(){
        System.out.println("In final method");
    }
    void stop(){
        System.out.println("In stop method");
    }
}

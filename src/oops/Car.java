package oops;

/**
 * Method -
 * to expose the behaviour of an object
 * eg. show method
 * Advantage -
 *       1. code optimization
 *       2. code re-usability
 */
public class Car {
    int gears;
    String carName;
    String color;
    void show(){
        System.out.println(gears +" "+carName+" "+color);
    }
}
class CarImp{
    public static void main(String[] args){
        Car c1 = new Car();
        // by using reference variable, we are going to initialize object
        c1.gears =6;
        c1.color ="White";
        c1.carName ="Scoda-Octavia";
        c1.show();
        Car c2 = new Car();
        c2.gears =6;
        c2.color ="Black";
        c2.carName ="MG-Hector";
        c2.show();
    }
}

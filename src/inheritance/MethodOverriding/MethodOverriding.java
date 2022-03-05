package inheritance.MethodOverriding;

public class MethodOverriding {
    void show(){
        System.out.println("In vehicle class");
    }
}
class Car extends MethodOverriding{
    void show(){
        System.out.println("In car class");
    }
}
class Bike extends MethodOverriding{
    void show(){
        System.out.println("In bike class");
    }
}
class CarImpl{
    public static void main(String[] args) {
        Car car = new Car();
        car.show();
        Bike bike = new Bike();
        bike.show();
    }
}

package inheritance;

public class Vehicle {
    int gear;
    int wheels;
}
class Car extends Vehicle {
    String color;
    String name;

    void display() {
        System.out.println("gear:" + gear);
        System.out.println("wheels:" + wheels);
        System.out.println("color:" + color);
        System.out.println("name:" + name);
    }

    void insertData(int g, int w, String c, String nm) {
        int gear = g;
        int wheels = w;
        String color = c;
        String name = nm;
    }
}
class CarImpl{
    public static void main(String[] args) {
        Car car = new Car();
        car.insertData(2,4,"Black","Swift");
        car.display();
    }
}
package polymorphism;

public class Bike {
    int speed = 100;
    void display() {
        System.out.println("Speed is" +speed);
    }
}
 class pulsar extends Bike {
     int speed = 120;
     void display() {
         System.out.println("Speed is " +speed);
     }
 }
 class Honda extends Bike{
     int speed = 150;
     void display() {
         System.out.println("Speed is " +speed);
     }
 }
 class BikeImpl{
     public static void main(String[] args) {
         Bike bike = new pulsar(); //upcasting - created object of child class using parent class bike
         bike.display();

         Bike bike1 = new Honda();
         bike1.display();
     }
}

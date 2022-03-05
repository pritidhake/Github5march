package Abstraction;

import java.util.Scanner;

public abstract class Shape {
    abstract double calculateArea();
}
class Rectangle extends Shape {
   double length = 7,breadth = 8;
    double calculateArea() {
        return length * breadth;
    }
}
class Circle extends Shape {
    double radius = 5;
    double calculateArea() {
        return 3.14 * radius * radius;
    }
}
class Triangle extends Shape {
    double length = 7,breadth = 8;
    double calculateArea() {
        return 0.5 * length * breadth;
    }
}class Square extends Shape {
    double side = 4;
    double calculateArea() {
        return side * side;
    }
}
class ShapeImpl{
    public static void main(String[] args) {
        int ch;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("1: Area of Rectangle");
            System.out.println("2: Area of Circle");
            System.out.println("3: Area of Triangle");
            System.out.println("4: Area of Square");
            System.out.println("5: Exit the programme");
            System.out.println("Enter your choice : ");
            ch = sc.nextInt();
            Shape shape;
            switch (ch) {
                case 1:
                    shape = new Rectangle();
                    System.out.println("Area of Rectangle"+shape.calculateArea());
                    break;
                case 2:
                    shape = new Circle();
                    System.out.println("Area of Circle"+shape.calculateArea());
                    break;
                case 3:
                    shape = new Triangle();
                    System.out.println("Area of Triangle"+shape.calculateArea());
                    break;
                case 4:
                    shape = new Square();
                    System.out.println("Area of Square"+shape.calculateArea());
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        }while (ch<6);
    }
}

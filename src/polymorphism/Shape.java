package polymorphism;

public class Shape {
    void calculateArea() {
        System.out.println("Calculate area");
    }
}
class Rectangle extends Shape {
    void calculateArea() {
        float length = 5;
        float breadth = 4;
        double area = length * breadth;
        System.out.println("Area of Rectangle: " +area);
    }
}
class Circle extends Shape {
    void calculateArea() {
        float radius = 4;
        double area = 0.5 * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}
class Triangle extends Shape {
    void calculateArea() {
        float length=5,breadth=5;
        double area = length * breadth;
        System.out.println("Area of Triangle: " + area);
    }
}class Square extends Shape {
    void calculateArea() {
        double side = 4;
        double area = side * side;
        System.out.println("Area of Square: " + area);
    }
}
class ShapeImpl{
    public static void main(String[] args) {
      Shape shape = new Rectangle();
      shape.calculateArea();
      shape = new Circle();
      shape.calculateArea();
      shape = new Triangle();
      shape.calculateArea();
      shape = new Square();
      shape.calculateArea();
    }
}


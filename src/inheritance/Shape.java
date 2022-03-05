package inheritance;

public class Shape {
    int base;
    int height;
    void insertData(int b, int h){
        base = b;
        height = h;
    }
}
class Rectangle extends Shape{
    double calculateArea(){
        double area = base * height;
        System.out.println("Area of Rectangle: "+area);
        return 0.0;
    }
}
class RectangleImp{
    public static void main(String[] args) {
        Rectangle rectangle= new Rectangle();
        rectangle.insertData(5,7);
        rectangle.calculateArea();
    }
}
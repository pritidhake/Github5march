package oops;

public class Circle {
    int radius;
    void insertData(int r) {
        radius = r;
    }
    void show(){
        System.out.println("Radius: "+radius);
    }
    void calculateArea(){
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle: "+area);
    }
}
class CircleImp{
    public static void main(String[] args){
        Circle c1 = new Circle();
        c1.insertData(2);
        c1.show();
        c1.calculateArea();
    }
}


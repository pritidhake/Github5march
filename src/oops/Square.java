package oops;

public class Square {
    int side;
    void insertData(int s){
        side = s;
    }
    void show() {
        System.out.println("Side: " + side);
    }
    void calculateArea() {
        int area = side * side;
        System.out.println("Area of square:" + area);
    }
}
class SquareImp {
    public static void main(String[] args) {
        Square s1 = new Square();
        s1.insertData(4);
        s1.show();
        s1.calculateArea();
    }
}



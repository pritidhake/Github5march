package oops;

public class Rectangle {
    int length;
    int breadth;
    void insertData(int l,int b){
        length = l;
        breadth = b;
    }
    void show(){
        System.out.println("Length: "+length +" Breadth: "+breadth);
    }
    void calculateArea(){
        int area = length * breadth;
        System.out.println("Area of Rectangle: "+area);
    }
}
class RectangleImp{
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.insertData(5,6);
        r1.show();
        r1.calculateArea();
    }
}


package accessmodifiers;

public class Student {
    // private access modifier
    private int id;
    private String name;
    private String address;
    private void show(){
        name = "Sam";
        System.out.println("Show method");
    }
}
class StudentImpl{
    public static void main(String[] args) {
        Student student = new Student();
    }
}
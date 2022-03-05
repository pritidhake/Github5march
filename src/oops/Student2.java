package oops;

public class Student2{
    int id;
    String name;
}
class TestStudent2{
    public static void main(String[] args){
        //Creating objects
        Student2 s1= new Student2();
        //Initialising objects
        s1.id = 8 ;
        s1.name = "Priti" ;
        //printing the output
        System.out.println(s1.id+" "+s1.name);
    }
}
package oops;
/*
 * new keyword - used to allocate memory at runtime,stored in heap area
 *
 */
public class student {
    int id; //instance variable
    String name; //instance variable

    public static void main(String[] args){
        //Creating an object of class Student
        student s1; //reference variable
        s1 =  new student(); //Heap memory, memory will gets allocated for s1 ref variable
        System.out.println(s1.id);
        System.out.println(s1.name);
    }
}

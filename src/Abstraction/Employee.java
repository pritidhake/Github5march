package Abstraction;

import java.util.Scanner;

public abstract class Employee {
    int id ;
    String name ;
    String mobile;
    String email;
    abstract void insertData(int id1 , String nm,String mob , String em);
    abstract void display();
}
class Developer extends Employee{
    String designation;
    void insertData(int id1 , String nm,String mob , String em) {
        id = id1;
        name = nm;
        mobile = mob;
        email = em;
    }
    void display(){
        System.out.println("id is : "+id+"      "+"Name : "+name+"      "+"Mobile : "+mobile+"      "+"Email : "+email );
    }
}
class Tester extends Employee{
   String designation;
    void insertData(int id1 , String nm,String mob , String em){
         id = id1;
         name = nm;
         mobile = mob;
         email = em;

    }
    void display(){
        System.out.println("id is : "+id+"      "+"Name : "+name+"      "+"Mobile : "+mobile+"      "+"Email : "+email );
    }
}
class EmployeeImpl {
    public static void main(String[] args) {
        int ch;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("1: Developer");
            System.out.println("2: Tester");
            System.out.println("3: Exit");
            System.out.println("Enter your choice: ");
            ch = sc.nextInt();
            Employee employee;
            switch (ch) {
                case 1:
                    employee = new Developer();
                    employee.insertData(101,"Priya","909090","Priya09@gmail.com");
                    employee.display();
                    break;
                case 2:
                    employee = new Tester();
                    employee.insertData(102,"Preeti","980980","Preeti0@gmail.com");
                    employee.display();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        } while (ch > 3);
    }
}
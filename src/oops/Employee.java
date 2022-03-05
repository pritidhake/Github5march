package oops;

public class Employee {
    int id;
    String name;

    void insertData(int i,String nm){
        id = i;
        name = nm;
    }
    void show(){
        System.out.println(id+" "+name);
    }
}
class EmployeeImp{
    public static void main(String[] args){
        Employee e1 = new Employee();
        e1.insertData(101, "abc" );
        e1.show();
        Employee e2 = new Employee();
        e2.insertData(102, "pqr");
        e2.show();
    }
}

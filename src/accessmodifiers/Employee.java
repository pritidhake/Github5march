package accessmodifiers;

public class Employee {
    // Default access modifier
    int id;
    String name;
    void display(){
        System.out.println("display");
    }
}
class Developer extends Employee{
    void display(){
        id = 1;
    }
}
class EmployeeImpl{
    public static void main(String[] args) {
        Employee employee= new Employee();
        employee.id = 1;
        employee.display();
    }
}

package inheritance.MethodOverriding;

public class Employee {
    double salary = 50000;
}
class Developer extends Employee{
    double salary = 45000;
    double calculateSalary(){
        double calculateSalary = 5000 + salary;
        return calculateSalary;
    }
    void printSalary() {
        System.out.println("Developer's Salary is : "+calculateSalary());
    }
}
class Tester extends Employee{
    double salary = 30000;
    double calculateSalary(){
        double calculateSalary = 1000 + salary;
        return calculateSalary;
    }
    void printSalary(){
        System.out.println("Salary of tester is: "+calculateSalary());
    }
}
class EmployeeImpl{
    public static void main(String[] args) {
        Developer d1 = new Developer();
        d1.printSalary();
        Tester tester = new Tester();
        tester.printSalary();
    }
}

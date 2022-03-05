package inheritance;

public class Employee1 {
    double salary;
    void display(){
        salary = 50000;
        System.out.println("salary is: "+salary);
    }
}
class PermanentEmployee1 extends Employee1{
    double hike = 1.5;
    double calculateTotalSalary(){
       double TotalSalary = salary + (salary * hike);
       System.out.println("Total salary: "+TotalSalary);
       return 0;
    }
}
class TemporaryEmployee1 extends Employee1{
    double hike = 0.5;
    double calculateTotalSalary(){
        double TotalSalary = salary + (salary * hike);
        System.out.println("Total salary: "+TotalSalary);
        return 0;
    }
}
class Employee1Impl{
    public static void main(String[] args) {
        PermanentEmployee1 pe = new PermanentEmployee1();
        pe.display();
        pe.calculateTotalSalary();

        TemporaryEmployee1 te = new TemporaryEmployee1();
        te.display();
        te.calculateTotalSalary();
    }
}

package inheritance;

public class Employee {
    int salary = 50000;
}
class Developer extends Employee{
    int bonus = 10000;
    void calculateSalary() {
        int sal = salary + bonus;
        System.out.println("Total salary is: " + sal);
    }
}
class DeveloperImpl{
    public static void main(String[] args) {
        Developer developer = new Developer();
        developer.calculateSalary();
    }


}

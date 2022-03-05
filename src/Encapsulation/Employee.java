package Encapsulation;

public class Employee {
    int id;
    String name;
    double salary;
    double bonus;
    String email;
    public void setId(int i){
        id = i;
    }
    public int getId(){
        return id;
    }
    public void setName(String nm){
        name = nm;
    }
    public String getName(){
        return name;
    }
    public double calculateBonus(){
        bonus = salary + 1000;
        return bonus;
    }
    public void setSalary(double sal){
        salary = sal;
    }
    public double getBonus(){
        return bonus;
    }
}
class EmployeeImpl{
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setId(10);
        System.out.println(e1.getId());
        e1.setName("priya");
        System.out.println(e1.getName());
    }
}



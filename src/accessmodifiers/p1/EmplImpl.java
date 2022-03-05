package accessmodifiers.p1;

import accessmodifiers.Employee;

public class EmplImpl {
    public static void main(String[] args) {
        Employee employee = new Employee();
        //default not acccessible out the package
        // employee.id = 1;
        // employee.display();
    }
}

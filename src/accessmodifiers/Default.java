package accessmodifiers;

public class Default {
    int salary = 10000;
    void display(){
        System.out.println("salary");
    }
}
class DefaultImpl{
    public static void main(String[] args) {
        Default de = new Default();
        de.display();
    }
}

package inheritance;

//Single inheritance
public class Animal {
    void walk(){
        System.out.println("Animal walk");
    }
    public static void main(String[] args) {
        //we can create object in parent class also
        Cow obj =new  Cow();
        obj.walk();
        Dog obj1 = new Dog();
        obj1.walk();
    }
}
//if parent and child have same method with same
class Dog extends Animal{
    void walk(){
    System.out.println("Dog walk");
    }
    //due to method overriding dog will run
}
class Cow extends Animal{
    void walk(){
        System.out.println("Cow walk");
    }
}

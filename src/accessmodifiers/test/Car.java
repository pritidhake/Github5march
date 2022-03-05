package accessmodifiers.test;

public class Car extends Vehicle {
    void display(){
        System.out.println(publicDataMember);
        System.out.println(defaultDataMember);
        System.out.println("*"+protectedDataMember);
    }
}

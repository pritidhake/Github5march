package superdemo;

/** Super keyword-
 * 1. it refers immediate parent class instance variable
 * 2. it refers immediate parent class method
 * 3. it refers immediate direct class constructor(super keyword run automatically even if we did not call it)
 */
public class SuperA {
    int i = 2;
    public void show(){
        System.out.println("In show super a");
    }
    public SuperA(){
        System.out.println("In super a constructor");
    }
    public SuperA(int i){
        System.out.println("in super a parameter constructor");
    }
}
class SuperB extends SuperA{
    int i=4;
    public void show(){
        System.out.println("id->"+super.i);
        System.out.println("in show super b");
//        System.out.println("id->"+super.i);      to refer parent class
    }
    public void display(){
        System.out.println("In super");
    }
    public SuperB(){
        System.out.println("in super b constructor");
    }
    public SuperB(int i){
//        super keyword get executed but parameters does not get applied automatically
        super(3);
        System.out.println("in super b parameter constructor");
    }
    public static void main(String[] args) {

        SuperB obj = new SuperB(7);
//        obj.show();
    }
}
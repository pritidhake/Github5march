package Constructor;
// constructor is special type of functions which invoke (function call) automatically when object of class is created.
//Rules : 1. your class name and constructor name should be same
//        2. your constructor has no return type.
//        3. static then finaldemo & synchronized keywords are not allowed.
//Types : 1. default constructor
//        2. parameterized constructor
//Advantage : 1. to initiate or instantiate variable to default value
// packages name small letters classname start with capital letter obj nd variable name should start with small letters

public class ConstructorDemo {
    int i;
    char c;
    public ConstructorDemo(){
        System.out.println(" in constructor");
    }
    public  ConstructorDemo(char c){
        System.out.println(this.c);
        System.out.println(" in parameter constructor"+i);
    }
    public ConstructorDemo(int i,int j){
        System.out.println("in parameter constructor");
    }
    static synchronized void showDisplay(){
    }

    public static void main(String[] args) {
        ConstructorDemo obj= new ConstructorDemo();
        ConstructorDemo obj1 = new ConstructorDemo('e');
    }
}

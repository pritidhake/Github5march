package finaldemo;

/** Final keyword-
 *  1. Final variable - you can not reassign value of variable
 *  2. Final methods - you can not override method in child class
 *  3. Final class - you can not inherit the class
 *
 *  it can be declared only for unique values
 *
 *  ctrl shift /  = multiline comment(block comment)
 */
public class FinalDemo {
    final int i; //constant

//    final String direction1 ="SOUTH";    DECLARED IN CAPITAL LETTERS
    final float pi = 3.142f;

    public FinalDemo(){
        i=8;
    }
    public  void show(){
//        i = 22;
        System.out.println(i);
    }

    public static void main(String[] args) {
        FinalDemo obj = new FinalDemo();
        obj.show();
    }
}
class Final2Demo extends FinalDemo{
    public void show(){

    }
}
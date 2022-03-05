package inheritance;
// multilevel inheritance
public class Multilevel {
    void eat(){
        System.out.println("In bird class");
    }
}
class Sparrow extends Multilevel{
    void fly(){
        System.out.println("In sparrow class");
    }
}
class BabySparrow extends Multilevel{
    void weep(){
        System.out.println("In BabySparrow class");
    }
}
class BabySparrowImpl{
    public static void main(String[] args) {
        BabySparrow babysparrow = new BabySparrow();
        babysparrow.weep();

    }
}

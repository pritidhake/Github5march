package accessmodifiers.p3;

import accessmodifiers.p2.Simple;

public class SimpleImpl {
    public static void main(String[] args) {
        // protected access modifier
        // not accessible outside the package
       // Simple simple = new Simple();
        //simple.getMsg();

        // through the child or by extending the class we can access protected data member outside the package(through inheritance)
    }
}

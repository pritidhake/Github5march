package packages.pac1;
import packages.*;
import packages.pac1.pac2.P3;


public class PacImpl {
    public static void main(String[] args) {
        P1 p1 = new P1();
        p1.show();

        P2 p2 = new P2();
        p2.show();

        P3 p3 = new P3();

        packages.pac1.pac2.P21 p21= new packages.pac1.pac2.P21();
        p21.show();
    }
}
